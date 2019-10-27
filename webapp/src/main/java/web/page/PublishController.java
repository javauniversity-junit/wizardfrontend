package web.page;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.logging.Logger;
import web.page.*;
import web.page.marketplacecompetitionpage.MarketPlaceCompetitionPageModel;
import web.page.planABEPPage.PlanABEPPageModel;
import web.page.planBBEPPage.PlanBBEPPageModel;
import web.page.planDigitalroicalculatorpage.PlanDigitalROICalculatorPageModel;
import web.page.planamedipage.MediaChart;
import web.page.planamedipage.MediaChartHelper;
import web.page.planamedipage.PlanMediaPageModel;
import web.page.confidentialclientevaluationnonepage.ConfidentialClientEvaluationOnePageModel;
import web.model.WizardData;
import web.page.presentedtopage.PresentedToPageController;
import web.page.presentedtopage.PresentedToPageModel;
import web.page.strategicmarketingpageone.StrategicMarketingPageOneModel;
import web.page.strategicmarketingpagethree.StrategicMarketingPageThreeModel;
import web.page.strategicmarketingpagetwo.StrategicMarketingPageTwoModel;
import web.page.teamcommitmentpage.TeamCommitmentPageModel;
import web.repository.WizardDataRepository;

@Controller // This means that this class is a Controller
public class PublishController {
	private static final Logger mLog = Logger.getLogger(PresentedToPageController.class.getName());
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardDataRepository wizardDataRepository;

	@RequestMapping(value = "/Publish", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID) {
		Integer idInt = Integer.parseInt(ID);
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


	,PlanALifetimeValuedPage
	,PlanBLifetimeValuedPage


	,MarketPlaceCompetitionPage
	,PlanAProposedPage
	,PlanBProposedPage
	,ClientObjectivesOnePage


	,TargetMarketingPage;
			 */
			
			// ConfidentialClientEvaluationOnePage
			case ConfidentialClientEvaluationOnePage:
				try {
				ConfidentialClientEvaluationOnePageModel confidentialClientEvaluationOnePageModel = null;

				confidentialClientEvaluationOnePageModel = (ConfidentialClientEvaluationOnePageModel) JSONManager
						.convertFromJson(data.getPagedata(), ConfidentialClientEvaluationOnePageModel.class);
				List<PieChart> pieChart = ChartBuilder
						.buildLastYearConfidentialClientEvaluation(confidentialClientEvaluationOnePageModel);

				model.addAttribute("ConfidentialClientEvaluationOnePageLastYearChartModel", pieChart);
				model.addAttribute("ConfidentialClientEvaluationOnePageModel", pieChart);
				
				if (pieChart.size() > 0) {
					publish.setConfidentialClientEvaluationOnePage(true);
				}
				
				//confidentialClientEvaluationProposedPage
				List<PieChart> pieChartProposed = ChartBuilder
						.buildNextYearConfidentialClientEvaluation(confidentialClientEvaluationOnePageModel);

				model.addAttribute("ConfidentialClientEvaluationOnePageLastYearChartProposedModel", pieChartProposed);
				//model.addAttribute("ConfidentialClientEvaluationOnePageModel", pieChartProposed);

				if (pieChartProposed.size() > 0) {
					publish.setConfidentialClientEvaluationProposedPage(true);
				}
				
				mLog.info("found page ConfidentialClientEvaluationOnePageModel");
				break;
				}catch (Exception ex) {
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
				}catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case PlanABEPPage:
			    try {
				PlanABEPPageModel planABEPPageModel = null;

				planABEPPageModel = (PlanABEPPageModel) JSONManager.convertFromJson(data.getPagedata(),
						PlanABEPPageModel.class);
				model.addAttribute("PlanABEPPage", planABEPPageModel);
				//publish.setPresentedToPage(true);
				mLog.info("found page PlanABEPPage");
				break;
			    }catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			
			case PlanADigitalROICalculatorPage:
				try {
				PlanDigitalROICalculatorPageModel planADigitalROICalculatorPageModel = null;

				planADigitalROICalculatorPageModel = (PlanDigitalROICalculatorPageModel) JSONManager.convertFromJson(data.getPagedata(),
						PlanDigitalROICalculatorPageModel.class);
				model.addAttribute("PlanADigitalROICalculatorPage", planADigitalROICalculatorPageModel);
				//publish.setPresentedToPage(true);
				mLog.info("found page PlanADigitalROICalculatorPage");
				break;
				}catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case PlanBBEPPage:
				try {
				PlanBBEPPageModel planBBEPPageModel = null;

				planBBEPPageModel = (PlanBBEPPageModel) JSONManager.convertFromJson(data.getPagedata(),
						PlanBBEPPageModel.class);
				model.addAttribute("PlanBBEPPage", planBBEPPageModel);
				//publish.setPresentedToPage(true);
				mLog.info("found page PlanBBEPPage");
				break;
				}catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case PlanBDigitalROICalculatorPage:
				try {
				PlanDigitalROICalculatorPageModel planBDigitalROICalculatorPageModel = null;

				planBDigitalROICalculatorPageModel = (PlanDigitalROICalculatorPageModel) JSONManager.convertFromJson(data.getPagedata(),
						PlanDigitalROICalculatorPageModel.class);
				model.addAttribute("PlanBDigitalROICalculatorPage", planBDigitalROICalculatorPageModel);
				//publish.setPresentedToPage(true);
				mLog.info("found page PlanBDigitalROICalculatorPage");
				break;
				}catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case PlanAMediaPage:
				try {
					PlanMediaPageModel planAMediaPagedataPageModel = null;
				planAMediaPagedataPageModel = (PlanMediaPageModel) JSONManager.convertFromJson(data.getPagedata(),
						PlanMediaPageModel.class);
				MediaChart mediaChartA = MediaChartHelper.generate(planAMediaPagedataPageModel);
				model.addAttribute("PlanAMediaPage", mediaChartA);
				if (mediaChartA != null) {
					publish.setPlanAMediaPage(true);
				}
				break;
				}catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case PlanBMediaPage:
				try {
					PlanMediaPageModel dataPageModel = null;
				dataPageModel = (PlanMediaPageModel) JSONManager.convertFromJson(data.getPagedata(),
						PlanMediaPageModel.class);
				MediaChart mediaChart = MediaChartHelper.generate(dataPageModel);
				model.addAttribute("PlanBMediaPage", mediaChart);
				if (mediaChart != null) {
					publish.setPlanBMediaPage(true);
				}
				break;
				}catch (Exception ex) {
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
				}catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case StrategicMarketingPageOne:
				try {
				StrategicMarketingPageOneModel strategicMarketingPageOneModel = null;

				strategicMarketingPageOneModel = (StrategicMarketingPageOneModel) JSONManager
						.convertFromJson(data.getPagedata(), StrategicMarketingPageOneModel.class);
				model.addAttribute("StrategicMarketingPageOne", strategicMarketingPageOneModel);
				mLog.info("found page StrategicMarketingPageOne");

				mLog.info("value found page StrategicMarketingPageOne "
						+ strategicMarketingPageOneModel.getYearsInBusiness());
				break;
				}catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case StrategicMarketingPageThree:
				try {
				StrategicMarketingPageThreeModel strategicMarketingPageThreeModel = null;

				strategicMarketingPageThreeModel = (StrategicMarketingPageThreeModel) JSONManager
						.convertFromJson(data.getPagedata(), StrategicMarketingPageThreeModel.class);
				model.addAttribute("StrategicMarketingPageThree", strategicMarketingPageThreeModel);
				mLog.info("found page StrategicMarketingPageTwo");

				mLog.info("value found page StrategicMarketingPageOne ");
				break;
				}catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			case StrategicMarketingPageTwo:
				try {
				StrategicMarketingPageTwoModel strategicMarketingPageTwoModel = null;

				strategicMarketingPageTwoModel = (StrategicMarketingPageTwoModel) JSONManager
						.convertFromJson(data.getPagedata(), StrategicMarketingPageTwoModel.class);
				model.addAttribute("StrategicMarketingPageTwo", strategicMarketingPageTwoModel);
				mLog.info("found page StrategicMarketingPageTwo");

				mLog.info("value found page StrategicMarketingPageOne ");
				break;
				}catch (Exception ex) {
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
				}catch (Exception ex) {
					mLog.severe("error " + ex.getMessage());
					break;
				}
			}
			model.addAttribute("PublishModel", publish);

		}

		return "publish";
	}

}
