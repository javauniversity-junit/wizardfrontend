package web.page.extra;

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
import web.page.presentedtopage.PresentedToPageController;
import web.page.presentedtopage.PresentedToPageModel;
import web.page.JSONManager;
import web.page.PageNameEnum;
import web.repository.WizardDataRepository;
import web.repository.WizardRepository;

@Controller // This means that this class is a Controller
public class ExtraPageControl {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardRepository wizardRepository;

	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardDataRepository wizardDataRepository;

	private static final Logger mLog = Logger.getLogger(ExtraPageControl.class.getName());

	@RequestMapping(value = "/PlanAFlightDatesPage", method = RequestMethod.GET)
	public String detailPlanAFlightDatesPage(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		// get wizard header
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository
				.findByPagesequenceAndWizardid(Pages.PlanAFlightDatesPage.getPageSequence(), wizard.getWizardid());
		ExtraPageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel = (ExtraPageModel) JSONManager.convertFromJson(wizardData.getPagedata(),
					ExtraPageModel.class);

		}
		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return "pages/PlanAFlightDatesPage";
	}

	@RequestMapping(value = "/PlanBFlightDatesPage", method = RequestMethod.GET)
	public String detailPlanBFlightDatesPage(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		// get wizard header
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository
				.findByPagesequenceAndWizardid(Pages.PlanBFlightDatesPage.getPageSequence(), wizard.getWizardid());
		ExtraPageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel = (ExtraPageModel) JSONManager.convertFromJson(wizardData.getPagedata(),
					ExtraPageModel.class);

		}
		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return "pages/PlanBFlightDatesPage";
	}

	@RequestMapping(value = "/savePlanBFlightDatesPage", method = RequestMethod.POST)
	public String savePlanBFlightDatesPage(@RequestParam String wizardId,
			@RequestParam(defaultValue = "") String textareaId, @RequestParam String wizarddataid,
			@RequestParam String previousPage, @RequestParam String publishPage,
			@RequestParam(required = false, value = "next") String next,
			@RequestParam(required = false, value = "publish") String publish,
			@RequestParam(required = false, value = "previous") String previous, @RequestParam String nextPage) {
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
		wizardData.setPagename(PageNameEnum.PlanBFlightDatesPage.toString());
		wizardData.setPagesequence(Pages.PlanBFlightDatesPage.getPageSequence());
		if (wizarddataid != null && wizarddataid.trim().length() > 0) {
			Integer wizardDataInt = Integer.valueOf(wizarddataid);
			wizardData.setWizarddataid(wizardDataInt);
		}
		Integer wizardIdInt = Integer.valueOf(wizardId);
		wizardData.setWizardid(wizardIdInt);
		ExtraPageModel model = new ExtraPageModel(textareaId);
		String pageData = JSONManager.convertToJson(model);

		wizardData.setPagedata(pageData);
		wizardDataRepository.save(wizardData);
		// model.addAttribute("wizard", wizard);
		return internalNextPage;
	}

	@RequestMapping(value = "/savePlanAFlightDatesPage", method = RequestMethod.POST)
	public String savePlanAFlightDatesPage(@RequestParam String wizardId,
			@RequestParam(defaultValue = "") String textareaId, @RequestParam String wizarddataid,
			@RequestParam String previousPage, @RequestParam String publishPage,
			@RequestParam(required = false, value = "next") String next,
			@RequestParam(required = false, value = "publish") String publish,
			@RequestParam(required = false, value = "previous") String previous, @RequestParam String nextPage) {
		mLog.info("starting save");

		// internal next page or publish
		// internal next page or publish
		String internalNextPage = nextPage;
		if (publish != null) {
			internalNextPage = publishPage;
		}
		if (previous != null) {
			internalNextPage = previousPage;
		}
		WizardData wizardData = new WizardData();
		wizardData.setPagename(PageNameEnum.PlanAFlightDatesPage.toString());
		wizardData.setPagesequence(Pages.PlanAFlightDatesPage.getPageSequence());
		if (wizarddataid != null && wizarddataid.trim().length() > 0) {
			Integer wizardDataInt = Integer.valueOf(wizarddataid);
			wizardData.setWizarddataid(wizardDataInt);
		}
		Integer wizardIdInt = Integer.valueOf(wizardId);
		wizardData.setWizardid(wizardIdInt);
		ExtraPageModel model = new ExtraPageModel(textareaId);
		String pageData = JSONManager.convertToJson(model);

		wizardData.setPagedata(pageData);
		wizardDataRepository.save(wizardData);
		// model.addAttribute("wizard", wizard);
		return internalNextPage;
	}

}