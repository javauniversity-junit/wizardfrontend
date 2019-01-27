package web.page.teamcommitmentpage;
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
import web.page.presentedtopage.PresentedToPageModel;
import web.repository.WizardDataRepository;
import web.repository.WizardRepository;


@Controller    // This means that this class is a Controller
public class TeamCommitmentPageController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardRepository wizardRepository;
	
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardDataRepository wizardDataRepository;

	private static final Logger mLog = Logger.getLogger(TeamCommitmentPageController.class.getName());
	@RequestMapping(value = "/TeamCommitmentPage", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		//get wizard header 
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository.findByPagesequenceAndWizardid(Pages.TEAMCOMMITMENTPAGE.getPageSequence(), wizard.getWizardid());
		TeamCommitmentPageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel =(TeamCommitmentPageModel) JSONManager.convertFromJson(wizardData.getPagedata(),TeamCommitmentPageModel.class);
		}
		//DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return "pages/TeamCommitmentPage";
	}
	/*
	 * ivate String ;
	private String ;
	private String ;
	private String ;
	private String thirdLevelName;
	private String ;
	private String ;
	private String fourthLevelTitle;
	 */
	@RequestMapping(value = "/saveTeamCommitmentPage", method = RequestMethod.POST)
	public String save(@RequestParam String wizardId
			,@RequestParam String topLevelName
			,@RequestParam String topLevelTitle
			,@RequestParam String secondLevelName
			,@RequestParam String secondLevelTitle
			,@RequestParam String thirdLevelName
			,@RequestParam String thirdLevelTitle
			,@RequestParam String fourthLevelName
			,@RequestParam String fourthLevelTitle
			,@RequestParam String wizarddataid
			,@RequestParam String nextPage) {
		mLog.info("starting save");
		 
		WizardData wizardData = new WizardData();
		wizardData.setPagename(Pages.TEAMCOMMITMENTPAGE.getPageName());
		wizardData.setPagesequence(Pages.TEAMCOMMITMENTPAGE.getPageSequence());
		if (wizarddataid != null && wizarddataid.trim().length() > 0 ) {
			Integer wizardDataInt = Integer.valueOf(wizarddataid);
			wizardData.setWizarddataid(wizardDataInt);
		}
		Integer wizardIdInt = Integer.valueOf(wizardId);
		wizardData.setWizardid(wizardIdInt);
		TeamCommitmentPageModel demographic  = new TeamCommitmentPageModel(topLevelName, topLevelTitle, secondLevelName,
				secondLevelTitle, thirdLevelName, thirdLevelTitle, fourthLevelName,
				fourthLevelTitle);
		String pageData = JSONManager.convertToJson(demographic);
		wizardData.setPagedata(pageData);
		wizardDataRepository.save(wizardData);
		//model.addAttribute("wizard", wizard);
		return nextPage;
	}
	
}
