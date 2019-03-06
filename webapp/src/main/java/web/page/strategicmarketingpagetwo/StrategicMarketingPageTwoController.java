package web.page.strategicmarketingpagetwo;
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


@Controller    // This means that this class is a Controller
public class StrategicMarketingPageTwoController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardRepository wizardRepository;
	
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardDataRepository wizardDataRepository;

	private static final Logger mLog = Logger.getLogger(StrategicMarketingPageTwoController.class.getName());
	@RequestMapping(value = "/StrategicMarketingPageTwo", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		//get wizard header 
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository.findByPagesequenceAndWizardid(Pages.StrategicMarketingTwo.getPageSequence(), wizard.getWizardid());
		StrategicMarketingPageTwoModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel =(StrategicMarketingPageTwoModel)JSONManager.convertFromJson(wizardData.getPagedata(), StrategicMarketingPageTwoModel.class);
			
		}
		//DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return "pages/StrategicMarketingPage";
	}
	
	@RequestMapping(value = "/saveStrategicMarketingPageTwo", method = RequestMethod.POST)
	public String save(@RequestParam String wizardId
			,@RequestParam String wizarddataid
			,@RequestParam(required=false, value="") String competitionA
			,@RequestParam(required=false, value="") String competitionB
			,@RequestParam(required=false, value="") String currentCompanySlogan
			,@RequestParam(required=false, value="") String competitionWeaknessA
			,@RequestParam(required=false, value="") String competitionWeaknessB
			,@RequestParam(required=false, value="") String competitionStrengthA
			,@RequestParam(required=false, value="") String competitionStrengthB
			,@RequestParam(required=false, value="") String companyNameProjectImage
			,@RequestParam boolean companySloganProjectImage
			,@RequestParam String nextPage
			,@RequestParam String publishPage
			,@RequestParam(required=false, value="next") String next
	        ,@RequestParam(required=false, value="publish") String publish){
		mLog.info("starting save");
		
		
		
		
		
		
		
		
		//internal next page or publish
		String internalNextPage = nextPage;
		if (publish != null) {
			internalNextPage= publishPage;
		}
		
		WizardData wizardData = new WizardData();
	    wizardData.setPagename(PageNameEnum.StrategicMarketingPageOne.toString());
		wizardData.setPagesequence(Pages.StrategicMarketingOne.getPageSequence());
		if (wizarddataid != null && wizarddataid.trim().length() > 0 ) {
			Integer wizardDataInt = Integer.valueOf(wizarddataid);
			wizardData.setWizarddataid(wizardDataInt);
		}
		Integer wizardIdInt = Integer.valueOf(wizardId);
		wizardData.setWizardid(wizardIdInt);
		StrategicMarketingPageTwoModel pageModel  = new StrategicMarketingPageTwoModel( competitionA, competitionB,competitionStrengthA,
				 competitionStrengthB,  competitionWeaknessA, competitionWeaknessB,
				companyNameProjectImage, currentCompanySlogan,companySloganProjectImage);
		String pageData = JSONManager.convertToJson(pageModel);
		
		wizardData.setPagedata(pageData);
		wizardDataRepository.save(wizardData);
		//model.addAttribute("wizard", wizard);
		return internalNextPage;
	}
}
