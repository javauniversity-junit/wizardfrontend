package web.page.clientobjectivesonepage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Wizard;
import web.model.WizardData;
import web.page.Pages;
import web.page.JSONManager;
import web.page.PageNameEnum;
import web.page.presentedtopage.PresentedToPageModel;
import web.page.teamcommitmentpage.TeamCommitmentPageController;
import web.page.teamcommitmentpage.TeamCommitmentPageModel;
import web.repository.WizardDataRepository;
import web.repository.WizardRepository;
import web.util.EncryptionDecryptionManager;

@Controller // This means that this class is a Controller
public class ClientObjectivesPageController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardRepository wizardRepository;

	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardDataRepository wizardDataRepository;

	private static final Logger mLog = Logger.getLogger(ClientObjectivesPageController.class.getName());

	@RequestMapping(value = "/ClientObjectivesOnePage", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		String decryptID = EncryptionDecryptionManager.decrypt(ID);
		mLog.info("decryptID " + decryptID);
		// get wizard header
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(decryptID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository
				.findByPagesequenceAndWizardid(Pages.CLIENTOBJECTIVESONEPAGE.getPageSequence(), wizard.getWizardid());
		ClientObjectivesOnePageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel = (ClientObjectivesOnePageModel) JSONManager.convertFromJson(wizardData.getPagedata(),
					ClientObjectivesOnePageModel.class);
		}
		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return "pages/ClientObjectivesOnePage";
	}

	@RequestMapping(value = "/ClientObjectivesOnePageTwo", method = RequestMethod.GET)
	public String detailPageTwo(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		String decryptID = EncryptionDecryptionManager.decrypt(ID);
		mLog.info("decryptID " + decryptID);
		// get wizard header
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(decryptID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository
				.findByPagesequenceAndWizardid(Pages.CLIENTOBJECTIVESONEPAGE.getPageSequence(), wizard.getWizardid());
		ClientObjectivesOnePageModel clientObjectivesOnePageModel = null;
		if (wizardData != null) {
			clientObjectivesOnePageModel = (ClientObjectivesOnePageModel) JSONManager
					.convertFromJson(wizardData.getPagedata(), ClientObjectivesOnePageModel.class);
		}
		List<ClientObjectivesOnePageTwoModel> orderList = ClientObjectivesPageHelper.getList(false,
				clientObjectivesOnePageModel);

		// sort
		// tinas Collections.sort(orderList, new ClientObjectivesSortOrder());

		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("orderList", orderList);
		model.addAttribute("dataPageModel", clientObjectivesOnePageModel);
		model.addAttribute("wizard", wizard);
		return "pages/ClientObjectivesOnePageTwo";
	}

	/*
	 * ivate String ; private String ; private String ; private String ; private
	 * String thirdLevelName; private String ; private String ; private String
	 * fourthLevelTitle;
	 */
	@RequestMapping(value = "/saveClientObjectivesOnePage", method = RequestMethod.POST)
	public String save(@RequestParam String wizardId,
			@RequestParam(defaultValue = "false") boolean introduceNewDepartment,
			@RequestParam(defaultValue = "false") boolean featureSpecificProducts,
			@RequestParam(defaultValue = "false") boolean callAttentiontoBrandsPrivateLabelsCarried,
			@RequestParam(defaultValue = "false") boolean promoteOffPriceItemsServices,
			@RequestParam(defaultValue = "false") boolean utilizeCoopVendorDollars,
			@RequestParam(defaultValue = "false") boolean retainCurrentConsumers,
			@RequestParam(defaultValue = "false") boolean increaseCustomerVisits,
			@RequestParam(defaultValue = "false") boolean increaseTrafficLeadCalls,
			@RequestParam(defaultValue = "false") boolean expandTargetConsumers,
			@RequestParam(defaultValue = "false") boolean changeConsumerAttitudes,
			@RequestParam(defaultValue = "false") boolean makePromotionalEventsStronger,
			@RequestParam(defaultValue = "false") boolean increaseDigitalMobileOnlineResponse,
			@RequestParam(defaultValue = "false") boolean developAQuarterlySpike,
			@RequestParam(defaultValue = "false") boolean developDatabaseMarketing,
			@RequestParam(defaultValue = "false") boolean initiateCauseMarketingProgram,
			@RequestParam(defaultValue = "false") boolean developSpeciallyStagedEvent,
			@RequestParam(defaultValue = "false") boolean maintainMarketDominance,
			@RequestParam(defaultValue = "false") boolean improveBusinessNameBrand,
			@RequestParam(defaultValue = "false") boolean establishorReestablishBusinessImage,
			@RequestParam(defaultValue = "false") boolean createPentUpDemand,
			@RequestParam(defaultValue = "false") boolean increaseMarketShare,
			@RequestParam(defaultValue = "false") boolean other,
			@RequestParam(defaultValue = "0") String introduceNewDepartmentSortOrderStr,
			@RequestParam(defaultValue = "0") String featureSpecificProductsSortOrderStr,
			@RequestParam(defaultValue = "0") String callAttentiontoBrandsPrivateLabelsCarriedSortOrderStr,
			@RequestParam(defaultValue = "0") String promoteOffPriceItemsServicesSortOrderStr,
			@RequestParam(defaultValue = "0") String retainCurrentConsumersSortOrderStr,
			@RequestParam(defaultValue = "0") String increaseCustomerVisitsSortOrderStr,
			@RequestParam(defaultValue = "0") String increaseTrafficLeadCallsSortOrderStr,
			@RequestParam(defaultValue = "0") String expandTargetConsumersSortOrderStr,
			@RequestParam(defaultValue = "0") String changeConsumerAttitudesSortOrderStr,
			@RequestParam(defaultValue = "0") String makePromotionalEventsStrongerSortOrderStr,
			@RequestParam(defaultValue = "0") String increaseDigitalMobileOnlineResponseSortOrderStr,
			@RequestParam(defaultValue = "0") String quarterlySeasonalCampaignSortOrderStr,
			@RequestParam(defaultValue = "0") String developAQuarterlySpikeSortOrderStr,
			@RequestParam(defaultValue = "0") String developDatabaseMarketingSortOrderStr,
			@RequestParam(defaultValue = "0") String initiateCauseMarketingProgramSortOrderStr,
			@RequestParam(defaultValue = "0") String developSpeciallyStagedEventSortOrderStr,
			@RequestParam(defaultValue = "0") String maintainMarketDominanceSortOrderStr,
			@RequestParam(defaultValue = "0") String improveBusinessNameBrandSortOrderStr,
			@RequestParam(defaultValue = "0") String establishorReestablishBusinessImageSortOrderStr,
			@RequestParam(defaultValue = "0") String createPentUpDemandSortOrderStr,
			@RequestParam(defaultValue = "0") String increaseMarketShareSortOrderStr,
			@RequestParam(defaultValue = "0") String otherSortOrderStr,
			@RequestParam(defaultValue = "") String otherText,
			@RequestParam(defaultValue = "0") String utilizeCoopVendorDollarsSortOrderortOrderStr,
			@RequestParam(defaultValue = "false") boolean quarterlySeasonalCampaign,
			@RequestParam String wizarddataid, @RequestParam String previousPage, @RequestParam String publishPage,
			@RequestParam(required = false, value = "next") String next,
			@RequestParam(required = false, value = "publish") String publish,
			@RequestParam(required = false, value = "previous") String previous, @RequestParam String nextPage) {
		mLog.info("starting save saveClientObjectivesOnePage");
		mLog.info("utilizeCoopVendorDollars save" + utilizeCoopVendorDollars);

		int introduceNewDepartmentSortOrder = Integer.parseInt(introduceNewDepartmentSortOrderStr);
		int featureSpecificProductsSortOrder = Integer.parseInt(featureSpecificProductsSortOrderStr);
		int callAttentiontoBrandsPrivateLabelsCarriedSortOrder = Integer
				.parseInt(callAttentiontoBrandsPrivateLabelsCarriedSortOrderStr);
		int promoteOffPriceItemsServicesSortOrder = Integer.parseInt(promoteOffPriceItemsServicesSortOrderStr);
		int retainCurrentConsumersSortOrder = Integer.parseInt(retainCurrentConsumersSortOrderStr);
		int increaseCustomerVisitsSortOrder = Integer.parseInt(increaseCustomerVisitsSortOrderStr);
		int increaseTrafficLeadCallsSortOrder = Integer.parseInt(increaseTrafficLeadCallsSortOrderStr);
		int expandTargetConsumersSortOrder = Integer.parseInt(expandTargetConsumersSortOrderStr);
		int changeConsumerAttitudesSortOrder = Integer.parseInt(changeConsumerAttitudesSortOrderStr);

		int makePromotionalEventsStrongerSortOrder = Integer.parseInt(makePromotionalEventsStrongerSortOrderStr);
		int increaseDigitalMobileOnlineResponseSortOrder = Integer
				.parseInt(increaseDigitalMobileOnlineResponseSortOrderStr);
		
		//aa
		int quarterlySeasonalCampaignSortOrder = Integer
				.parseInt(quarterlySeasonalCampaignSortOrderStr);
		
		int developAQuarterlySpikeSortOrder = Integer.parseInt(developAQuarterlySpikeSortOrderStr);
		int developDatabaseMarketingSortOrder = Integer.parseInt(developDatabaseMarketingSortOrderStr);
		int initiateCauseMarketingProgramSortOrder = Integer.parseInt(initiateCauseMarketingProgramSortOrderStr);
		int developSpeciallyStagedEventSortOrder = Integer.parseInt(developSpeciallyStagedEventSortOrderStr);
		int maintainMarketDominanceSortOrder = Integer.parseInt(maintainMarketDominanceSortOrderStr);
		int improveBusinessNameBrandSortOrder = Integer.parseInt(improveBusinessNameBrandSortOrderStr);
		int establishorReestablishBusinessImageSortOrder = Integer
				.parseInt(establishorReestablishBusinessImageSortOrderStr);

		int createPentUpDemandSortOrder = Integer.parseInt(createPentUpDemandSortOrderStr);
		int increaseMarketShareSortOrder = Integer.parseInt(increaseMarketShareSortOrderStr);
		int otherSortOrder = Integer.parseInt(otherSortOrderStr);
		int utilizeCoopVendorDollarsSortOrderortOrder = Integer.parseInt(utilizeCoopVendorDollarsSortOrderortOrderStr);

		// internal next page or publish
		String internalNextPage = nextPage;
		if (publish != null) {
			internalNextPage = publishPage;
		}
		if (previous != null) {
			internalNextPage = previousPage;
		}

		WizardData wizardData = new WizardData();
		wizardData.setPagename(PageNameEnum.ClientObjectivesOnePage.toString());
		wizardData.setPagesequence(Pages.CLIENTOBJECTIVESONEPAGE.getPageSequence());
		if (wizarddataid != null && wizarddataid.trim().length() > 0) {
			Integer wizardDataInt = Integer.valueOf(wizarddataid);
			wizardData.setWizarddataid(wizardDataInt);
		}
		wizardId = EncryptionDecryptionManager.decrypt(wizardId);
		mLog.info("decryptID " + wizardId);
		Integer wizardIdInt = Integer.valueOf(wizardId);
		wizardData.setWizardid(wizardIdInt);

		ClientObjectivesOnePageModel pageModel = new ClientObjectivesOnePageModel(quarterlySeasonalCampaign,quarterlySeasonalCampaignSortOrder, introduceNewDepartment,
				featureSpecificProducts, callAttentiontoBrandsPrivateLabelsCarried, promoteOffPriceItemsServices,
				utilizeCoopVendorDollars, retainCurrentConsumers, increaseCustomerVisits, increaseTrafficLeadCalls,
				expandTargetConsumers, changeConsumerAttitudes, makePromotionalEventsStronger,
				increaseDigitalMobileOnlineResponse, developAQuarterlySpike, developDatabaseMarketing,
				initiateCauseMarketingProgram, developSpeciallyStagedEvent, maintainMarketDominance,
				improveBusinessNameBrand, establishorReestablishBusinessImage, createPentUpDemand, increaseMarketShare,
				other, introduceNewDepartmentSortOrder, featureSpecificProductsSortOrder,
				callAttentiontoBrandsPrivateLabelsCarriedSortOrder, promoteOffPriceItemsServicesSortOrder,
				retainCurrentConsumersSortOrder, increaseCustomerVisitsSortOrder, increaseTrafficLeadCallsSortOrder,
				expandTargetConsumersSortOrder, changeConsumerAttitudesSortOrder,
				makePromotionalEventsStrongerSortOrder, increaseDigitalMobileOnlineResponseSortOrder,
				developAQuarterlySpikeSortOrder, developDatabaseMarketingSortOrder,
				initiateCauseMarketingProgramSortOrder, developSpeciallyStagedEventSortOrder,
				maintainMarketDominanceSortOrder, improveBusinessNameBrandSortOrder,
				establishorReestablishBusinessImageSortOrder, createPentUpDemandSortOrder, increaseMarketShareSortOrder,
				otherSortOrder, utilizeCoopVendorDollarsSortOrderortOrder, otherText);

		String pageData = JSONManager.convertToJson(pageModel);
		wizardData.setPagedata(pageData);
		wizardDataRepository.save(wizardData);
		mLog.info("saved data " + pageData);
		// model.addAttribute("wizard", wizard);
		return internalNextPage;
	}

}
