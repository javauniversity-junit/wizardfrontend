package web.page.demographic;
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
import web.repository.WizardDataRepository;
import web.repository.WizardRepository;


@Controller    // This means that this class is a Controller
public class DemograhicController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardRepository wizardRepository;
	
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardDataRepository wizardDataRepository;

	private static final Logger mLog = Logger.getLogger(DemograhicController.class.getName());
	@RequestMapping(value = "/wizardDemographic", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		//get wizard header 
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository.findByPagesequenceAndWizardid(Pages.DEMOGRAPHIC.getPageSequence(), wizard.getWizardid());
		Demographic demographic = null;
		if (wizardData != null) {
			demographic = DemographicManager.convertFromJson(wizardData.getPagedata());
		}
		//DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("demographic", demographic);
		model.addAttribute("wizard", wizard);
		return "pages/Demographic";
	}
	
	@RequestMapping(value = "/saveDemographic", method = RequestMethod.POST)
	public String save(@RequestParam String wizardId
			,@RequestParam String presentedtoId
			,@RequestParam String presentedBusinessId
			,@RequestParam String presentedById
			,@RequestParam String wizarddataid
			,@RequestParam String nextPage) {
		mLog.info("starting save");
		 
		WizardData wizardData = new WizardData();
		wizardData.setPagename(Pages.DEMOGRAPHIC.getPageName());
		wizardData.setPagesequence(Pages.DEMOGRAPHIC.getPageSequence());
		if (wizarddataid != null && wizarddataid.trim().length() > 0 ) {
			Integer wizardDataInt = Integer.valueOf(wizarddataid);
			wizardData.setWizarddataid(wizardDataInt);
		}
		Integer wizardIdInt = Integer.valueOf(wizardId);
		wizardData.setWizardid(wizardIdInt);
		Demographic demographic  = new Demographic(presentedtoId,presentedBusinessId, presentedById);
		String pageData = DemographicManager.convertToJson(demographic);
		wizardData.setPagedata(pageData);
		wizardDataRepository.save(wizardData);
		//model.addAttribute("wizard", wizard);
		return nextPage;
	}
	
}
