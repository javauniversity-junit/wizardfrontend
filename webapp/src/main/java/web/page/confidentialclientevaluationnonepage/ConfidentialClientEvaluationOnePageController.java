package web.page.confidentialclientevaluationnonepage;

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
import web.repository.WizardDataRepository;
import web.repository.WizardRepository;
import web.util.EncryptionDecryptionManager;

@Controller // This means that this class is a Controller
public class ConfidentialClientEvaluationOnePageController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardRepository wizardRepository;

	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardDataRepository wizardDataRepository;

	private static final Logger mLog = Logger.getLogger(ConfidentialClientEvaluationOnePageController.class.getName());

	@RequestMapping(value = "/ConfidentialClientEvaluationOnePage", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		// get wizard header
		String decryptID = EncryptionDecryptionManager.decrypt(ID);
		mLog.info("decryptID " + decryptID);
		// get wizard header
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(decryptID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository.findByPagesequenceAndWizardid(
				Pages.ConfidentialClientEvaluationOnePage.getPageSequence(), wizard.getWizardid());
		ConfidentialClientEvaluationOnePageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel = (ConfidentialClientEvaluationOnePageModel) JSONManager
					.convertFromJson(wizardData.getPagedata(), ConfidentialClientEvaluationOnePageModel.class);

		}
		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return "pages/ConfidentialClientEvaluationOnePage";
	}

	@RequestMapping(value = "/saveConfidentialClientEvaluationOnePage", method = RequestMethod.POST)
	public String save(@RequestParam String wizardId, @RequestParam String wizarddataid,
			@RequestParam String lastYearLabel1, @RequestParam String lastYearLabel2,
			@RequestParam String lastYearLabel3, @RequestParam String lastYearLabel4,
			@RequestParam String lastYearLabel5, @RequestParam String lastYearLabel6,
			@RequestParam String lastYearLabel7, @RequestParam String lastYearLabel8,
			@RequestParam String lastYearLabel9, @RequestParam String lastYearValue1,
			@RequestParam String lastYearValue2, @RequestParam String lastYearValue3,
			@RequestParam String lastYearValue4, @RequestParam String lastYearValue5,
			@RequestParam String lastYearValue6, @RequestParam String lastYearValue7,
			@RequestParam String lastYearValue8, @RequestParam String lastYearValue9,
			@RequestParam String totalMediaInvestment, @RequestParam String totalMediaInvestmentInput,
			@RequestParam String pctTAIGrossSalesLastYear, @RequestParam String grossSalesLastyear,
			@RequestParam String proposedLabel1, @RequestParam String proposedLabel2,
			@RequestParam String proposedLabel3, @RequestParam String proposedLabel4,
			@RequestParam String proposedLabel5, @RequestParam String proposedLabel6,
			@RequestParam String proposedLabel7, @RequestParam String proposedLabel8,
			@RequestParam String proposedLabel9, @RequestParam String proposedValue1,
			@RequestParam String proposedValue2, @RequestParam String proposedValue3,
			@RequestParam String proposedValue4, @RequestParam String proposedValue5,
			@RequestParam String proposedValue6, @RequestParam String proposedValue7,
			@RequestParam String proposedValue8, @RequestParam String proposedValue9,
			@RequestParam String taiNext12Months, @RequestParam String pctGrossSales,
			@RequestParam String estimatedGrossSalesNext12Months, @RequestParam String totalMediaInvestmentTwo,
			@RequestParam String industryAverage, @RequestParam String salesGoals, @RequestParam String taiShouldBe,
			@RequestParam String nextPage, @RequestParam String publishPage, @RequestParam String previousPage,
			@RequestParam(required = false, value = "previous") String previous,
			@RequestParam(required = false, value = "next") String next,
			@RequestParam(required = false, value = "publish") String publish) {

		mLog.info("starting save");
		// internal next page or publish
		String internalNextPage = nextPage;
		if (publish != null) {
			internalNextPage = publishPage;
		}
		if (previous != null) {
			internalNextPage = previousPage;
		}
		WizardData wizardData = new WizardData();
		wizardData.setPagename(PageNameEnum.ConfidentialClientEvaluationOnePage.toString());
		wizardData.setPagesequence(Pages.ConfidentialClientEvaluationOnePage.getPageSequence());
		if (wizarddataid != null && wizarddataid.trim().length() > 0) {
			Integer wizardDataInt = Integer.valueOf(wizarddataid);
			wizardData.setWizarddataid(wizardDataInt);
		}
		wizardId = EncryptionDecryptionManager.decrypt(wizardId);
		mLog.info("decryptID " + wizardId);
		Integer wizardIdInt = Integer.valueOf(wizardId);
		wizardData.setWizardid(wizardIdInt);

		ConfidentialClientEvaluationOnePageModel pageModel = new ConfidentialClientEvaluationOnePageModel(
				lastYearLabel1, lastYearLabel2, lastYearLabel3, lastYearLabel4, lastYearLabel5, lastYearLabel6,
				lastYearLabel7, lastYearLabel8, lastYearLabel9, lastYearValue1, lastYearValue2, lastYearValue3,
				lastYearValue4, lastYearValue5, lastYearValue6, lastYearValue7, lastYearValue8, lastYearValue9,
				totalMediaInvestment, totalMediaInvestmentInput, pctTAIGrossSalesLastYear, grossSalesLastyear,
				proposedLabel1, proposedLabel2, proposedLabel3, proposedLabel4, proposedLabel5, proposedLabel6,
				proposedLabel7, proposedLabel8, proposedLabel9, proposedValue1, proposedValue2, proposedValue3,
				proposedValue4, proposedValue5, proposedValue6, proposedValue7, proposedValue8, proposedValue9,
				taiNext12Months, pctGrossSales, estimatedGrossSalesNext12Months, taiShouldBe, totalMediaInvestmentTwo,
				industryAverage, salesGoals);

		String pageData = JSONManager.convertToJson(pageModel);

		wizardData.setPagedata(pageData);
		wizardDataRepository.save(wizardData);
		// model.addAttribute("wizard", wizard);
		return internalNextPage;
	}
}
