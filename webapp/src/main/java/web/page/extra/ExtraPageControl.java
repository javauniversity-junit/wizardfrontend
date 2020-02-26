package web.page.extra;

import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.security.core.Authentication;
import web.data.MyUserPrincipal;
import web.model.Wizard;
import web.model.WizardData;
import web.page.Pages;

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
//MarketingStrategiesPage

	@RequestMapping(value = "/MarketingStrategiesPage", method = RequestMethod.GET)
	public String detailMarketingStrategiesPage(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		// get wizard header
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository
				.findByPagesequenceAndWizardid(Pages.MarketingStrategiesPage.getPageSequence(), wizard.getWizardid());
		ExtraPageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel = (ExtraPageModel) JSONManager.convertFromJson(wizardData.getPagedata(),
					ExtraPageModel.class);

		}
		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return "pages/ProfileOfConsumersPage";
	}

	@RequestMapping(value = "/saveMarketingStrategiesPage", method = RequestMethod.POST)
	public String saveMarketingStrategiesPage(@RequestParam String wizardId,
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
		wizardData.setPagename(PageNameEnum.MarketingStrategiesPage.toString());
		wizardData.setPagesequence(Pages.MarketingStrategiesPage.getPageSequence());
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

	@RequestMapping(value = "/DigitalMobileSocialStrategiesPage", method = RequestMethod.GET)
	public String detailDigitalMobileSocialStrategiesPage(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		// get wizard header
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository.findByPagesequenceAndWizardid(
				Pages.DigitalMobileSocialStrategiesPage.getPageSequence(), wizard.getWizardid());
		ExtraPageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel = (ExtraPageModel) JSONManager.convertFromJson(wizardData.getPagedata(),
					ExtraPageModel.class);

		}
		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return "pages/DigitalMobileSocialStrategiesPage";
	}

	@RequestMapping(value = "/saveDigitalMobileSocialStrategiesPage", method = RequestMethod.POST)
	public String saveDigitalMobileSocialStrategiesPage(@RequestParam String wizardId,
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
		wizardData.setPagename(PageNameEnum.DigitalMobileSocialStrategiesPage.toString());
		wizardData.setPagesequence(Pages.DigitalMobileSocialStrategiesPage.getPageSequence());
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

	@RequestMapping(value = "/ProfileOfConsumersPage", method = RequestMethod.GET)
	public String detailProfileOfConsumersPage(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		// get wizard header
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository
				.findByPagesequenceAndWizardid(Pages.ProfileOfConsumersPage.getPageSequence(), wizard.getWizardid());
		ExtraPageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel = (ExtraPageModel) JSONManager.convertFromJson(wizardData.getPagedata(),
					ExtraPageModel.class);

		}
		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return "pages/ProfileOfConsumersPage";
	}

	@RequestMapping(value = "/saveProfileOfConsumersPage", method = RequestMethod.POST)
	public String saveProfileOfConsumersPage(@RequestParam String wizardId,
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
		wizardData.setPagename(PageNameEnum.ProfileOfConsumersPage.toString());
		wizardData.setPagesequence(Pages.ProfileOfConsumersPage.getPageSequence());
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

	@RequestMapping(value = "/CreateConceptOnePage", method = RequestMethod.GET)
	public String detailCreateConceptOnePage(Model model, @RequestParam String ID, Authentication authentication) {
		mLog.info("starting detail");
		MyUserPrincipal userDetails = (MyUserPrincipal) authentication.getPrincipal();

		// get wizard header
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository
				.findByPagesequenceAndWizardid(Pages.CreateConceptOnePage.getPageSequence(), wizard.getWizardid());
		ExtraPageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel = (ExtraPageModel) JSONManager.convertFromJson(wizardData.getPagedata(),
					ExtraPageModel.class);

		}
		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		String nextPage = "pages/CreateConceptOnePage";// radio
		String clientType = userDetails.getContact().getClientType();
		mLog.info("clientType [" + clientType + "]");
		if (clientType.equals("TV")) {
			nextPage = "pages/CreateConceptOneTVPage";// TV
		}
		mLog.info("nextPage [" + nextPage + "]");
		return nextPage;
	}

	@RequestMapping(value = "/saveCreateConceptOnePage", method = RequestMethod.POST)
	public String saveCreateConceptOnePage(@RequestParam String wizardId,
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
		wizardData.setPagename(PageNameEnum.CreateConceptOnePage.toString());
		wizardData.setPagesequence(Pages.CreateConceptOnePage.getPageSequence());
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

	@RequestMapping(value = "/CreateConceptTwoPage", method = RequestMethod.GET)
	public String detailCreateConceptTwoPage(Model model, @RequestParam String ID, Authentication authentication) {
		mLog.info("starting detail");
		MyUserPrincipal userDetails = (MyUserPrincipal) authentication.getPrincipal();

		// get wizard header
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository
				.findByPagesequenceAndWizardid(Pages.CreateConceptTwoPage.getPageSequence(), wizard.getWizardid());
		ExtraPageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel = (ExtraPageModel) JSONManager.convertFromJson(wizardData.getPagedata(),
					ExtraPageModel.class);

		}
		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		String nextPage = "pages/CreateConceptTwoPage";// radio
		String clientType = userDetails.getContact().getClientType();
		mLog.info("clientType [" + clientType + "]");
		if (clientType.equals("TV")) {
			nextPage = "pages/CreateConceptTwoTVPage";// TV
		}
		return nextPage;
	}

	@RequestMapping(value = "/saveCreateConceptTwoPage", method = RequestMethod.POST)
	public String saveCreateConceptTwoPage(@RequestParam String wizardId,
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
		wizardData.setPagename(PageNameEnum.CreateConceptTwoPage.toString());
		wizardData.setPagesequence(Pages.CreateConceptTwoPage.getPageSequence());
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

	@RequestMapping(value = "/PlanAExcelPage", method = RequestMethod.GET)
	public String detailPlanAExcelPage(Model model, @RequestParam String ID, Authentication authentication) {
		mLog.info("starting PlanAExcelPage");
		MyUserPrincipal userDetails = (MyUserPrincipal) authentication.getPrincipal();
		String nextPage = "pages/PlanAExcelPage";// radio
		String clientType = userDetails.getContact().getClientType();
		mLog.info("clientType [" + clientType + "]");
		if (clientType.equals("TV")) {
			nextPage = "pages/PlanAExcelTVPage";// TV
		}
		mLog.info("nextPage [" + nextPage + "]");
		// get wizard header
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository
				.findByPagesequenceAndWizardid(Pages.PlanAExcelPage.getPageSequence(), wizard.getWizardid());
		ExtraPageModel dataPageModel = null;
		mLog.info("just looked for PlanAExcelPage data");
		if (wizardData != null) {
			mLog.info("found PlanAExcelPage data");
			dataPageModel = (ExtraPageModel) JSONManager.convertFromJson(wizardData.getPagedata(),
					ExtraPageModel.class);

		}
		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return nextPage;
	}

	@RequestMapping(value = "/PlanBExcelPage", method = RequestMethod.GET)
	public String detailPlanBExcelPage(Model model, @RequestParam String ID, Authentication authentication) {
		mLog.info("starting detail");
		MyUserPrincipal userDetails = (MyUserPrincipal) authentication.getPrincipal();
		String nextPage = "pages/PlanBExcelPage";// radio
		String clientType = userDetails.getContact().getClientType();
		mLog.info("clientType [" + clientType + "]");
		if (clientType.equals("TV")) {
			nextPage = "pages/PlanBExcelTVPage";// TV
		}
		// get wizard header
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository
				.findByPagesequenceAndWizardid(Pages.PlanBExcelPage.getPageSequence(), wizard.getWizardid());
		ExtraPageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel = (ExtraPageModel) JSONManager.convertFromJson(wizardData.getPagedata(),
					ExtraPageModel.class);

		}
		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return nextPage;
	}

	@RequestMapping(value = "/savePlanBExcelPage", method = RequestMethod.POST)
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
		wizardData.setPagename(PageNameEnum.PlanBExcelPage.toString());
		wizardData.setPagesequence(Pages.PlanBExcelPage.getPageSequence());
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

	@RequestMapping(value = "/savePlanAExcelPage", method = RequestMethod.POST)
	public String savePlanAFlightDatesPage(@RequestParam String wizardId,
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
		wizardData.setPagename(PageNameEnum.PlanAExcelPage.toString());
		wizardData.setPagesequence(Pages.PlanAExcelPage.getPageSequence());
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
