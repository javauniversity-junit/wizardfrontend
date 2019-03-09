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
			@RequestParam boolean poorestJanuary, @RequestParam boolean poorestFebruary,
			@RequestParam boolean poorestMarch, @RequestParam boolean poorestApril, @RequestParam boolean poorestMay,
			@RequestParam boolean poorestJune, @RequestParam boolean poorestJuly, @RequestParam boolean poorestAugust,
			@RequestParam boolean poorestSeptember, @RequestParam boolean poorestOctober,
			@RequestParam boolean poorestNovember, @RequestParam boolean poorestDecember,
			@RequestParam boolean bestJanuary, @RequestParam boolean bestFebruary, @RequestParam boolean bestMarch,
			@RequestParam boolean bestApril, @RequestParam boolean bestMay, @RequestParam boolean bestJune,
			@RequestParam boolean bestJuly, @RequestParam boolean bestAugust, @RequestParam boolean bestSeptember,
			@RequestParam boolean bestOctober, @RequestParam boolean bestNovember, @RequestParam boolean bestDecember,
			@RequestParam boolean bestMonday, @RequestParam boolean bestTuesday, @RequestParam boolean bestWednesday,
			@RequestParam boolean bestThursday, @RequestParam boolean bestFriday, @RequestParam boolean bestSaturday,		
		@RequestParam boolean bestSunday, @RequestParam String nextPage, @RequestParam String publishPage,
		@RequestParam(required=false, value="") String compliments
		,@RequestParam(required=false, value="") String complaint
		,@RequestParam(required=false, value="") String marketingStrategy
		,@RequestParam(required=false, value="") String socialStrategy,
		@RequestParam(required = false, value = "next") String next,
			@RequestParam(required = false, value = "publish") String publish) {
		mLog.info("starting save");

		// internal next page or publish
		String internalNextPage = nextPage;
		if (publish != null) {
			internalNextPage = publishPage;
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
		StrategicMarketingPageThreeModel pageModel = new StrategicMarketingPageThreeModel(poorestJanuary,poorestFebruary, poorestMarch,
				 poorestApril,  poorestMay, poorestJune, poorestJuly,  poorestAugust,
			 poorestSeptember,  poorestOctober,  poorestNovember,  poorestDecember,
				 bestJanuary,  bestFebruary, bestMarch,  bestApril,  bestMay,
				 bestJune,  bestJuly,  bestAugust, bestSeptember,  bestOctober,
			 bestNovember,  bestDecember,  bestMonday,  bestTuesday,  bestWednesday,
				 bestThursday,  bestFriday,  bestSaturday,  bestSunday, compliments,complaint,marketingStrategy,socialStrategy);
		
		
		String pageData = JSONManager.convertToJson(pageModel);

		wizardData.setPagedata(pageData);
		wizardDataRepository.save(wizardData);
		// model.addAttribute("wizard", wizard);
		return internalNextPage;
	}
}
