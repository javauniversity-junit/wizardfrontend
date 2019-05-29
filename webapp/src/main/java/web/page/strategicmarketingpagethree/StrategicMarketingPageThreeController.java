package web.page.strategicmarketingpagethree;

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

@Controller // This means that this class is a Controller
public class StrategicMarketingPageThreeController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardRepository wizardRepository;

	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardDataRepository wizardDataRepository;

	private static final Logger mLog = Logger.getLogger(StrategicMarketingPageThreeController.class.getName());

	@RequestMapping(value = "/StrategicMarketingPageThree", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		// get wizard header
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository
				.findByPagesequenceAndWizardid(Pages.StrategicMarketingThree.getPageSequence(), wizard.getWizardid());
		StrategicMarketingPageThreeModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel = (StrategicMarketingPageThreeModel) JSONManager.convertFromJson(wizardData.getPagedata(),
					StrategicMarketingPageThreeModel.class);

		}
		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return "pages/StrategicMarketingPageThree";
	}

	@RequestMapping(value = "/saveStrategicMarketingPageThree", method = RequestMethod.POST)
	public String save(@RequestParam String wizardId, @RequestParam String wizarddataid,
			@RequestParam(value = "poorestJanuary", required = false, defaultValue = "false") boolean poorestJanuary,
			@RequestParam(value = "poorestFebruary", required = false, defaultValue = "false") boolean poorestFebruary,
			@RequestParam(value = "poorestMarch", required = false, defaultValue = "false") boolean poorestMarch,
			@RequestParam(value = "poorestApril", required = false, defaultValue = "false") boolean poorestApril,
			@RequestParam(value = "poorestMay", required = false, defaultValue = "false") boolean poorestMay,
			@RequestParam(value = "poorestJune", required = false, defaultValue = "false") boolean poorestJune,
			@RequestParam(value = "poorestJuly", required = false, defaultValue = "false") boolean poorestJuly,
			@RequestParam(value = "poorestAugust", required = false, defaultValue = "false") boolean poorestAugust,
			@RequestParam(value = "poorestSeptember", required = false, defaultValue = "false") boolean poorestSeptember,
			@RequestParam(value = "poorestOctober", required = false, defaultValue = "false") boolean poorestOctober,
			@RequestParam(value = "poorestNovember", required = false, defaultValue = "false") boolean poorestNovember,
			@RequestParam(value = "poorestDecember", required = false, defaultValue = "false") boolean poorestDecember,
			@RequestParam(value = "bestJanuary", required = false, defaultValue = "false") boolean bestJanuary,
			@RequestParam(value = "bestFebruary", required = false, defaultValue = "false") boolean bestFebruary,
			@RequestParam(value = "bestMarch", required = false, defaultValue = "false") boolean bestMarch,
			@RequestParam(value = "bestApril", required = false, defaultValue = "false") boolean bestApril,
			@RequestParam(value = "bestMay", required = false, defaultValue = "false") boolean bestMay,
			@RequestParam(value = "bestJune", required = false, defaultValue = "false") boolean bestJune,
			@RequestParam(value = "bestJuly", required = false, defaultValue = "false") boolean bestJuly,
			@RequestParam(value = "bestAugust", required = false, defaultValue = "false") boolean bestAugust,
			@RequestParam(value = "bestSeptember", required = false, defaultValue = "false") boolean bestSeptember,
			@RequestParam(value = "bestOctober", required = false, defaultValue = "false") boolean bestOctober,
			@RequestParam(value = "bestNovember", required = false, defaultValue = "false") boolean bestNovember,
			@RequestParam(value = "bestDecember", required = false, defaultValue = "false") boolean bestDecember,
			@RequestParam(value = "bestMonday", required = false, defaultValue = "false") boolean bestMonday,
			@RequestParam(value = "bestTuesday", required = false, defaultValue = "false") boolean bestTuesday,
			@RequestParam(value = "bestWednesday", required = false, defaultValue = "false") boolean bestWednesday,
			@RequestParam(value = "bestThursday", required = false, defaultValue = "false") boolean bestThursday,
			@RequestParam(value = "bestFriday", required = false, defaultValue = "false") boolean bestFriday,
			@RequestParam(value = "bestSaturday", required = false, defaultValue = "false") boolean bestSaturday,
			@RequestParam(value = "bestSunday", required = false, defaultValue = "false") boolean bestSunday,
			@RequestParam String nextPage, @RequestParam String publishPage,
			@RequestParam(required = false, value = "") String compliments,
			@RequestParam(required = false, value = "") String complaint,
			@RequestParam(required = false, value = "") String marketingStrategy,
			@RequestParam(required = false, value = "") String socialStrategy,

			@RequestParam String previousPage

			, @RequestParam(required = false, value = "previous") String previous,
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
		wizardData.setPagename(PageNameEnum.StrategicMarketingPageThree.toString());
		wizardData.setPagesequence(Pages.StrategicMarketingThree.getPageSequence());
		if (wizarddataid != null && wizarddataid.trim().length() > 0) {
			Integer wizardDataInt = Integer.valueOf(wizarddataid);
			wizardData.setWizarddataid(wizardDataInt);
		}
		Integer wizardIdInt = Integer.valueOf(wizardId);
		wizardData.setWizardid(wizardIdInt);
		StrategicMarketingPageThreeModel pageModel = new StrategicMarketingPageThreeModel(poorestJanuary,
				poorestFebruary, poorestMarch, poorestApril, poorestMay, poorestJune, poorestJuly, poorestAugust,
				poorestSeptember, poorestOctober, poorestNovember, poorestDecember, bestJanuary, bestFebruary,
				bestMarch, bestApril, bestMay, bestJune, bestJuly, bestAugust, bestSeptember, bestOctober, bestNovember,
				bestDecember, bestMonday, bestTuesday, bestWednesday, bestThursday, bestFriday, bestSaturday,
				bestSunday, compliments, complaint, marketingStrategy, socialStrategy);

		String pageData = JSONManager.convertToJson(pageModel);

		wizardData.setPagedata(pageData);
		wizardDataRepository.save(wizardData);
		// model.addAttribute("wizard", wizard);
		return internalNextPage;
	}
}
