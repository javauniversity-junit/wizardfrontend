package web.page.planbLifetimevaluedpage;
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
import web.repository.WizardDataRepository;
import web.repository.WizardRepository;


@Controller    // This means that this class is a Controller
public class PlanBLifetimeValuedPageController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardRepository wizardRepository;
	
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardDataRepository wizardDataRepository;

	private static final Logger mLog = Logger.getLogger(PlanBLifetimeValuedPageController.class.getName());
	@RequestMapping(value = "/PlanBLifetimeValuedPage", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		//get wizard header 
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository.findByPagesequenceAndWizardid(Pages.PlanBLifetimeValuedPage.getPageSequence(), wizard.getWizardid());
		PlanBLifetimeValuedPageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel =(PlanBLifetimeValuedPageModel)JSONManager.convertFromJson(wizardData.getPagedata(),PlanBLifetimeValuedPageModel.class);
			
		}
		//DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return "pages/PlanBLifetimeValuedPage";
	}
	
	@RequestMapping(value = "/savePlanBLifetimeValuedPage", method = RequestMethod.POST)
	public String save(@RequestParam String wizardId
			,@RequestParam String wizarddataid
			,@RequestParam String averageSale
			,@RequestParam Integer averageRepeatSales
			,@RequestParam Integer grossProfitMargin
			,@RequestParam Integer yearsOfPatronage
			,@RequestParam String grossProfitPerSale
			,@RequestParam String averageCustomerValue
			,@RequestParam String lifetimeValuePerCustomer
			,@RequestParam String monthlyInvestmentAverage
			,@RequestParam String prospectsNeededToBreakEven
			,@RequestParam String previousPage
			,@RequestParam String publishPage
			,@RequestParam(required=false, value="next") String next
	        ,@RequestParam(required=false, value="publish") String publish
	        ,@RequestParam(required=false, value="previous") String previous
	        ,@RequestParam String nextPage)
	{
		mLog.info("starting save");
		//internal next page or publish
		if (averageRepeatSales == null) {
			averageRepeatSales= 0;
		}
		if (grossProfitMargin == null) {
			grossProfitMargin= 0;
		}
		if (yearsOfPatronage == null) {
			yearsOfPatronage= 0;
		}
//internal next page or publish
	
		String internalNextPage = nextPage;
		if (publish != null) {
			internalNextPage= publishPage;
		}
		if (previous != null) {
			internalNextPage= previousPage;
        }
		
		WizardData wizardData = new WizardData();
	    wizardData.setPagename(PageNameEnum.PlanBLifetimeValuedPage.toString());
		wizardData.setPagesequence(Pages.PlanBLifetimeValuedPage.getPageSequence());
		if (wizarddataid != null && wizarddataid.trim().length() > 0 ) {
			Integer wizardDataInt = Integer.valueOf(wizarddataid);
			wizardData.setWizarddataid(wizardDataInt);
		}
		Integer wizardIdInt = Integer.valueOf(wizardId);
		wizardData.setWizardid(wizardIdInt);
		
		PlanBLifetimeValuedPageModel pageModel  = new PlanBLifetimeValuedPageModel(averageSale, grossProfitMargin,  averageRepeatSales,
				yearsOfPatronage,  grossProfitPerSale, averageCustomerValue,
				lifetimeValuePerCustomer, monthlyInvestmentAverage, prospectsNeededToBreakEven);
		String pageData = JSONManager.convertToJson(pageModel);
		
		wizardData.setPagedata(pageData);
		wizardDataRepository.save(wizardData);
		//model.addAttribute("wizard", wizard);
		return internalNextPage;
	}
}
