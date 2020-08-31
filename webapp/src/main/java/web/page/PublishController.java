package web.page;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.page.*;
import web.page.clientobjectivesonepage.ClientObjectivesOnePageModel;
import web.page.clientobjectivesonepage.ClientObjectivesOnePageTwoModel;
import web.page.clientobjectivesonepage.ClientObjectivesPageHelper;
import web.page.marketplacecompetitionpage.MarketPlaceCompetitionPageModel;
import web.page.planABEPPage.PlanABEPPageModel;
import web.page.planBBEPPage.PlanBBEPPageModel;
import web.page.planDigitalroicalculatorpage.PlanDigitalROICalculatorPageModel;
import web.page.planalifetimevaluedpage.PlanALifetimeValuedPageModel;
import web.page.planamedipage.MediaChart;
import web.page.planamedipage.MediaChartHelper;
import web.page.planamedipage.PlanMediaPageModel;
import web.page.planbLifetimevaluedpage.PlanBLifetimeValuedPageModel;
import web.page.planproposedpage.PlanProposedPageModel;
import web.page.confidentialclientevaluationnonepage.ConfidentialClientEvaluationOnePageModel;
import web.page.extra.ExtraPageModel;
import web.data.MyUserPrincipal;
import web.model.Wizard;
import web.model.WizardData;

import web.page.presentedtopage.PresentedToPageModel;
import web.page.strategicmarketingpageone.StrategicMarketingPageOneModel;
import web.page.strategicmarketingpagethree.StrategicMarketingHelper;
import web.page.strategicmarketingpagethree.StrategicMarketingPageThreeModel;
import web.page.strategicmarketingpagetwo.StrategicMarketingPageTwoModel;
import web.page.targetmarketingpage.TargetMarketingHeaderRow;
import web.page.targetmarketingpage.TargetMarketingPageModel;
import web.page.teamcommitmentpage.TeamCommitmentPageModel;
import web.repository.WizardDataRepository;
import web.repository.WizardRepository;
import web.util.EncryptionDecryptionManager;
import web.util.EnvUtil;

@Controller // This means that this class is a Controller
public class PublishController {                          
	private static final Logger mLog = Logger.getLogger(PublishController.class.getName());
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardDataRepository wizardDataRepository;
	@Autowired
	private Environment env;
	
	// inject it,
	@Autowired
	private EnvUtil envUtil;

	
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardRepository wizardRepository;
	
	@RequestMapping(value = "/Publish", method = RequestMethod.GET)
	public String agentView(Model model, @RequestParam String ID, HttpSession session) {
		String decryptId = session.getAttribute("ID").toString();
		String detail = detail(model, decryptId);
		return detail;
	}
	

	@RequestMapping(value = "/PublishClient", method = RequestMethod.GET)
	public String clientView(Model model, @RequestParam String ID) {
		mLog.info("ID  [" + ID + "]");
		//String idDecode  = EncryptionDecryptionManager.decode(ID);
		//mLog.info("idDecode  [" + idDecode + "]");
		String decryptId = EncryptionDecryptionManager.decrypt(ID);
		mLog.info("decryptId  [" + decryptId + "]");
		String detail = detail(model, decryptId);
		return detail;
		//return "a";
	}
	
	@RequestMapping(value = "/PublishLink", method = RequestMethod.GET)
	public String PublishLink(Model model, @RequestParam String encryptId , Authentication authentication) {
		
		mLog.info("encryptId  [" + encryptId + "]");
		encryptId = EncryptionDecryptionManager.decode(encryptId);
		
		mLog.info(" decode encryptId  [" + encryptId + "]");
		StringBuffer buffer = new StringBuffer();
		StringBuffer domainBuffer = new StringBuffer();

		
		String domain = env.getProperty("domain");
		//encryptId = EncryptionDecryptionManager.encode(encryptId);
		String decodeEncryptId = EncryptionDecryptionManager.encode(encryptId);
		
		//mLog.info("domainA = " + domainA);
		buffer.append(domain);
		buffer.append("PublishClient");
		buffer.append("?ID=");
		buffer.append(decodeEncryptId);
		mLog.info("buffer " + buffer.toString());
		MyUserPrincipal userDetails = (MyUserPrincipal) authentication.getPrincipal();
		String mailToMessage = env.getProperty("mailtoMessage");
		mailToMessage = java.text.MessageFormat.format(mailToMessage, userDetails.getUsername(),buffer.toString());
		mLog.info("mailToMessage " + mailToMessage);
		String id = EncryptionDecryptionManager.decrypt(encryptId);
		mLog.info("id  [" + id + "]");
		
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(id));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository
				.findByPagesequenceAndWizardid(Pages.PRESENTEDTOPAGE.getPageSequence(), wizard.getWizardid());
		PresentedToPageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel = (PresentedToPageModel) JSONManager.convertFromJson(wizardData.getPagedata(),
					PresentedToPageModel.class);

		}
		// DemographicManager.convertFromJson(json)
		
		model.addAttribute("PresentedToPage", dataPageModel);	
		model.addAttribute("link", buffer.toString());
		model.addAttribute("mailToMessage", mailToMessage);
		return "share";
	}
	
	
	
	
	public String detail(Model model,  String ID) {
		Integer idInt = Integer.parseInt(ID);
		String encryptId = EncryptionDecryptionManager.encrypt(ID);
		encryptId = EncryptionDecryptionManager.encode(encryptId);
		model.addAttribute("encryptId", encryptId);
		Publish publish = new Publish();
		// get all pages
		Iterable<WizardData> dataPages = wizardDataRepository.findByWizardid(idInt);
		for (WizardData data : dataPages) {
			// pull of data model
			PageNameEnum pageName = null;
			try {
				pageName = PageNameEnum.valueOf(data.getPagename());
			} catch (Exception ex) {
				mLog.severe("error " + ex.getMessage());
				continue;
			}
			mLog.info("page name = " + pageName);
			switch (pageName) {

			/*
			 * 
			 * 
			 * 
			 * ,PlanALifetimeValuedPage ,PlanBLifetimeValuedPage
			 * 
			 * 
			 * ,MarketPlaceCompetitionPage ,PlanAProposedPage ,PlanBProposedPage
			 * ,ClientObjectivesOnePage
			 * 
			 * 
			 * 
			 * 
			 * 
			 * ,MarketingStrategiesPage
			 * 
			 * ,;
			 */

			// ConfidentialClientEvaluationOnePage
			case ClientObjectivesOnePage:
				try {

					ClientObjectivesOnePageModel clientObjectivesOnePageModel = null;
					clientObjectivesOnePageModel = (ClientObjectivesOnePageModel) JSONManager
							.convertFromJson(data.getPagedata(), ClientObjectivesOnePageModel.class);
					List<ClientObjectivesOnePageTwoModel> orderList = ClientObjectivesPageHelper.getList(true,
							clientObjectivesOnePageModel);
					model.addAttribute("ClientObjectivesPageModel", orderList);
					model.addAttribute("ClientObjectivesPage",clientObjectivesOnePageModel );
					publish.setClientObjectivesPage(true);
					mLog.info("found page ClientObjectivesOnePageTwoModel");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}

			case ConfidentialClientEvaluationOnePage:
				try {
					ConfidentialClientEvaluationOnePageModel confidentialClientEvaluationOnePageModel = null;

					confidentialClientEvaluationOnePageModel = (ConfidentialClientEvaluationOnePageModel) JSONManager
							.convertFromJson(data.getPagedata(), ConfidentialClientEvaluationOnePageModel.class);
					List<PieChart> pieChart = ChartBuilder
							.buildLastYearConfidentialClientEvaluation(confidentialClientEvaluationOnePageModel);

					model.addAttribute("ConfidentialClientEvaluationOnePageLastYearChartModel", pieChart);
					model.addAttribute("ConfidentialClientEvaluationOnePageModel", pieChart);
					model.addAttribute("ConfidentialClientEvaluationPageDataModel",
							confidentialClientEvaluationOnePageModel);

					if (pieChart.size() > 0) {
						publish.setConfidentialClientEvaluationOnePage(true);
					}

					// confidentialClientEvaluationProposedPage
					List<PieChart> pieChartProposed = ChartBuilder
							.buildNextYearConfidentialClientEvaluation(confidentialClientEvaluationOnePageModel);

					model.addAttribute("ConfidentialClientEvaluationOnePageLastYearChartProposedModel",
							pieChartProposed);
					// model.addAttribute("ConfidentialClientEvaluationOnePageModel",
					// pieChartProposed);

					if (pieChartProposed.size() > 0) {
						publish.setConfidentialClientEvaluationProposedPage(true);
					}

					mLog.info("found page ConfidentialClientEvaluationOnePageModel");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case CreateConceptOnePage:
				try {
					ExtraPageModel createConceptOnePageModel = null;

					createConceptOnePageModel = (ExtraPageModel) JSONManager.convertFromJson(data.getPagedata(),
							ExtraPageModel.class);
					model.addAttribute("CreateConceptOnePageModel", createConceptOnePageModel);
					publish.setCreateConceptOnePage(true);
					mLog.info("found page createConceptOnePageModel");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case CreateConceptTwoPage:
				try {
					ExtraPageModel createConceptTwoPageModel = null;

					createConceptTwoPageModel = (ExtraPageModel) JSONManager.convertFromJson(data.getPagedata(),
							ExtraPageModel.class);
					model.addAttribute("CreateConceptTwoPageModel", createConceptTwoPageModel);
					publish.setCreateConceptTwoPage(true);
					mLog.info("found page createConceptTwoPageModel");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case DigitalMobileSocialStrategiesPage:
				try {
					ExtraPageModel digitalMobileSocialStrategiesPageModel = null;

					digitalMobileSocialStrategiesPageModel = (ExtraPageModel) JSONManager
							.convertFromJson(data.getPagedata(), ExtraPageModel.class);
					model.addAttribute("DigitalMobileSocialStrategiesPageModel",
							digitalMobileSocialStrategiesPageModel);
					publish.setDigitalMobileSocialStrategiesPage(true);
					mLog.info("found page digitalMobileSocialStrategiesPage");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}

			case MarketPlaceCompetitionPage:
				try {
					MarketPlaceCompetitionPageModel marketPlaceCompetitionPageModel = null;

					marketPlaceCompetitionPageModel = (MarketPlaceCompetitionPageModel) JSONManager
							.convertFromJson(data.getPagedata(), MarketPlaceCompetitionPageModel.class);
					model.addAttribute("MarketPlaceCompetitionPageModel", marketPlaceCompetitionPageModel);
					publish.setMarketPlaceCompetitionPage(true);
					mLog.info("found page MarketPlaceCompetitionPageModel");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case MarketingStrategiesPage:
				try {
					ExtraPageModel marketingStrategiesPageModel = null;

					marketingStrategiesPageModel = (ExtraPageModel) JSONManager.convertFromJson(data.getPagedata(),
							ExtraPageModel.class);
					model.addAttribute("MarketingStrategiesPageModel", marketingStrategiesPageModel);
					publish.setMarketingStrategiesPage(true);
					mLog.info("found page marketingStrategiesPageModel");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}

			case PlanABEPPage:
				try {
					PlanABEPPageModel planABEPPageModel = null;

					planABEPPageModel = (PlanABEPPageModel) JSONManager.convertFromJson(data.getPagedata(),
							PlanABEPPageModel.class);
					model.addAttribute("PlanABEPPageModel", planABEPPageModel);
					publish.setPlanABEPPage(true);
					mLog.info("found page PlanABEPPage");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}

			case PlanADigitalROICalculatorPage:
				try {
					PlanDigitalROICalculatorPageModel planADigitalROICalculatorPageModel = null;

					planADigitalROICalculatorPageModel = (PlanDigitalROICalculatorPageModel) JSONManager
							.convertFromJson(data.getPagedata(), PlanDigitalROICalculatorPageModel.class);
					model.addAttribute("PlanADigitalROICalculatorPage", planADigitalROICalculatorPageModel);
					publish.setPlanADigitalROICalculatorPage(true);
					mLog.info("found page PlanADigitalROICalculatorPage");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}

			case PlanAExcelPage:
				try {
					ExtraPageModel planAExcelPageModel = null;

					planAExcelPageModel = (ExtraPageModel) JSONManager.convertFromJson(data.getPagedata(),
							ExtraPageModel.class);
					String textArea = planAExcelPageModel.getTextArea();
					textArea = textArea.replaceAll("\\r\\n", "");
					mLog.info("text  planAExcelPageModel [" + textArea + "]");
					//planAExcelPageModel.setTextArea(textArea);
					model.addAttribute("PlanAExcelPageModel", planAExcelPageModel);
					publish.setPlanAExcelPage(true);
					mLog.info("found page planAExcelPageModel");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case PlanAProposedPage:
				try {
					PlanProposedPageModel planAProposedPageModel = null;

					planAProposedPageModel = (PlanProposedPageModel) JSONManager.convertFromJson(data.getPagedata(),
							PlanProposedPageModel.class);
					model.addAttribute("PlanAProposedPageModel", planAProposedPageModel);
					publish.setPlanAProposedPage(true);
					mLog.info("found page planAProposedPage");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case PlanBProposedPage:
				try {
					PlanProposedPageModel planBProposedPageModel = null;

					planBProposedPageModel = (PlanProposedPageModel) JSONManager.convertFromJson(data.getPagedata(),
							PlanProposedPageModel.class);
					model.addAttribute("PlanBProposedPageModel", planBProposedPageModel);
					publish.setPlanBProposedPage(true);
					mLog.info("found page planBProposedPage");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case PlanALifetimeValuedPage:
				try {
					PlanALifetimeValuedPageModel planALifetimeValuedPageModel = null;

					planALifetimeValuedPageModel = (PlanALifetimeValuedPageModel) JSONManager
							.convertFromJson(data.getPagedata(), PlanALifetimeValuedPageModel.class);
					model.addAttribute("PlanALifetimeValuedPageModel", planALifetimeValuedPageModel);
					publish.setPlanALifetimeValuedPage(true);
					mLog.info("found page PlanALifetimeValuedPage");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
				
				
//PlanBDigitalROICalculatorPage
				
	
				//
			case PlanBLifetimeValuedPage:
				try {
					PlanBLifetimeValuedPageModel planBLifetimeValuedPageModel = null;

					planBLifetimeValuedPageModel = (PlanBLifetimeValuedPageModel) JSONManager
							.convertFromJson(data.getPagedata(), PlanBLifetimeValuedPageModel.class);
					model.addAttribute("PlanBLifetimeValuedPageModel", planBLifetimeValuedPageModel);
					publish.setPlanBLifetimeValuedPage(true);
					mLog.info("found page PlanBLifetimeValuedPage");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
				//
			case PlanBExcelPage:
				try {
					ExtraPageModel planBExcelPagePageModel = null;

					planBExcelPagePageModel = (ExtraPageModel) JSONManager.convertFromJson(data.getPagedata(),
							ExtraPageModel.class);
					model.addAttribute("PlanBExcelPageModel", planBExcelPagePageModel);
					publish.setPlanBExcelPage(true);
					mLog.info("found page PlanAExcelPage");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case PlanBBEPPage:
				try {
					PlanBBEPPageModel planBBEPPageModel = null;

					planBBEPPageModel = (PlanBBEPPageModel) JSONManager.convertFromJson(data.getPagedata(),
							PlanBBEPPageModel.class);
					model.addAttribute("PlanBBEPPageModel", planBBEPPageModel);
					publish.setPlanBBEPPage(true);
					mLog.info("found page PlanBBEPPage");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case PlanBDigitalROICalculatorPage:
				try {
					PlanDigitalROICalculatorPageModel planBDigitalROICalculatorPageModel = null;

					planBDigitalROICalculatorPageModel = (PlanDigitalROICalculatorPageModel) JSONManager
							.convertFromJson(data.getPagedata(), PlanDigitalROICalculatorPageModel.class);
					model.addAttribute("PlanBDigitalROICalculatorPage", planBDigitalROICalculatorPageModel);
					publish.setPlanBDigitalROICalculatorPage(true);
					mLog.info("found page PlanBDigitalROICalculatorPage");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case PlanAMediaPage:
				mLog.info("found page PlanAMediaPage");
				try {
					PlanMediaPageModel planAMediaPagedataPageModel = null;
					planAMediaPagedataPageModel = (PlanMediaPageModel) JSONManager.convertFromJson(data.getPagedata(),
							PlanMediaPageModel.class);
					MediaChart mediaChartA = MediaChartHelper.generate(planAMediaPagedataPageModel);
					model.addAttribute("PlanAMediaPage", mediaChartA);
					model.addAttribute("PlanAMediaPagedataPageModel", planAMediaPagedataPageModel);
					if (mediaChartA != null) {
						publish.setPlanAMediaPage(true);
					}
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}

				// PlanAProposedPage
			case PlanBMediaPage:
				mLog.info("found page PlanBMediaPage");
				try {
					PlanMediaPageModel planBMediaPagedataPageModel = null;
					planBMediaPagedataPageModel = (PlanMediaPageModel) JSONManager.convertFromJson(data.getPagedata(),
							PlanMediaPageModel.class);
					MediaChart mediaChart = MediaChartHelper.generate(planBMediaPagedataPageModel);
					model.addAttribute("PlanBMediaPagedataPageModel", planBMediaPagedataPageModel);
					model.addAttribute("PlanBMediaPage", mediaChart);
					if (mediaChart != null) {
						publish.setPlanBMediaPage(true);
					}
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case PresentedToPage:
				try {
					PresentedToPageModel presentedToPageModel = null;

					presentedToPageModel = (PresentedToPageModel) JSONManager.convertFromJson(data.getPagedata(),
							PresentedToPageModel.class);
					model.addAttribute("PresentedToPage", presentedToPageModel);
					publish.setPresentedToPage(true);
					mLog.info("found page PresentedToPage");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}

			case ProfileOfConsumersPage:
				try {
					ExtraPageModel profileOfConsumersPageModel = null;

					profileOfConsumersPageModel = (ExtraPageModel) JSONManager.convertFromJson(data.getPagedata(),
							ExtraPageModel.class);
					model.addAttribute("ProfileOfConsumersPageModel", profileOfConsumersPageModel);
					publish.setProfileOfConsumersPage(true);
					mLog.info("found page profileOfConsumersPageModel");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}

			case StrategicMarketingPageOne:
				try {
					StrategicMarketingPageOneModel strategicMarketingPageOneModel = null;

					strategicMarketingPageOneModel = (StrategicMarketingPageOneModel) JSONManager
							.convertFromJson(data.getPagedata(), StrategicMarketingPageOneModel.class);
					model.addAttribute("StrategicMarketingPageOne", strategicMarketingPageOneModel);
					publish.setStrategicMarketingPageOne(true);
					mLog.info("found page StrategicMarketingPageOne");

					mLog.info("value found page StrategicMarketingPageOne "
							+ strategicMarketingPageOneModel.getYearsInBusiness());
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case StrategicMarketingPageThree:
				try {
					StrategicMarketingPageThreeModel strategicMarketingPageThreeModel = null;

					strategicMarketingPageThreeModel = (StrategicMarketingPageThreeModel) JSONManager
							.convertFromJson(data.getPagedata(), StrategicMarketingPageThreeModel.class);
					model.addAttribute("StrategicMarketingPageThree", strategicMarketingPageThreeModel);
					
					StrategicMarketingHelper strategicMarketingHelper = new StrategicMarketingHelper(strategicMarketingPageThreeModel);
					model.addAttribute("StrategicMarketingHelper", strategicMarketingHelper);
					publish.setStrategicMarketingPageThree(true);
					mLog.info("found page StrategicMarketingPageThree");

					
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case StrategicMarketingPageTwo:
				mLog.info("start StrategicMarketingPageTwo");

				try {
					StrategicMarketingPageTwoModel strategicMarketingPageTwoModel = null;

					strategicMarketingPageTwoModel = (StrategicMarketingPageTwoModel) JSONManager
							.convertFromJson(data.getPagedata(), StrategicMarketingPageTwoModel.class);
					model.addAttribute("StrategicMarketingPageTwo", strategicMarketingPageTwoModel);
					publish.setStrategicMarketingPageTwo(true);
					mLog.info("found page StrategicMarketingPageTwo");

					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case TargetMarketingPage:
				try {
					TargetMarketingPageModel targetMarketingPageModel = null;

					targetMarketingPageModel = (TargetMarketingPageModel) JSONManager
							.convertFromJson(data.getPagedata(), TargetMarketingPageModel.class);
					model.addAttribute("targetMarketingPageModel", targetMarketingPageModel);
					TargetMarketingHeaderRow targetMarketingHeaderRow = new TargetMarketingHeaderRow(
							targetMarketingPageModel);
					mLog.info("found page targetMarketingPageModel");
					model.addAttribute("targetMarketingHeaderRow", targetMarketingHeaderRow);
					publish.setTargetMarketingPage(true);
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}

			case TeamCommitmentPage:
				try {
					TeamCommitmentPageModel teamCommitmentPageModel = null;

					teamCommitmentPageModel = (TeamCommitmentPageModel) JSONManager.convertFromJson(data.getPagedata(),
							TeamCommitmentPageModel.class);
					model.addAttribute("TeamCommitmentPage", teamCommitmentPageModel);
					publish.setTeamCommitmentPage(true);
					mLog.info("found page TeamCommitmentPage");
					break;
				} catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			}
			model.addAttribute("PublishModel", publish);

		}

		return "publish";
	}

}
