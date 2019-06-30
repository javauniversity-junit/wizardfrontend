package web.page.planABEPPage;
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
public class PlanABEPPageController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardRepository wizardRepository;
	
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardDataRepository wizardDataRepository;

	private static final Logger mLog = Logger.getLogger(PlanABEPPageController.class.getName());
	@RequestMapping(value = "/PlanABEPPage", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID) {
		mLog.info("starting detail");
		//get wizard header 
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(ID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository.findByPagesequenceAndWizardid(Pages.PlanABEPPage.getPageSequence(), wizard.getWizardid());
		PlanABEPPageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel =(PlanABEPPageModel)JSONManager.convertFromJson(wizardData.getPagedata(),PlanABEPPageModel.class);
			
		}
		//DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return "pages/PlanABEPPage";
	}
	
	@RequestMapping(value = "/savePlanABEPPage", method = RequestMethod.POST)
	public String save(@RequestParam String wizardId
			,@RequestParam String wizarddataid
			,@RequestParam (defaultValue ="", name="planAAverageSale") String planAAverageSale
			,@RequestParam (defaultValue ="", name="planAGrossMargin") String planAGrossMargin
			,@RequestParam (defaultValue ="", name="planAClosingPct") String  planAClosingPct
			,@RequestParam (defaultValue ="", name="planAProspectValue") String planAProspectValue
			,@RequestParam (defaultValue ="", name="planAInvestment") String planAInvestment
			,@RequestParam (defaultValue ="", name="planAProspectsNeeded") String planAProspectsNeeded
			,@RequestParam (defaultValue ="", name="planAProspectSales") String planAProspectSalesNeeded
			,@RequestParam (defaultValue ="", name="planAGrossProfitOnSales") String planAGrossProfitOnSales
			,@RequestParam (defaultValue ="", name="planAMonths") String planAMonths
			,@RequestParam (defaultValue ="", name="planAAdditionalGrossSales") String planAAdditionalGrossSales			
			,@RequestParam String previousPage
			,@RequestParam String publishPage
			,@RequestParam(required=false, value="next") String next
	        ,@RequestParam(required=false, value="publish") String publish
	        ,@RequestParam(required=false, value="previous") String previous
	        ,@RequestParam String nextPage){
		mLog.info("starting save");
		//internal next page or publish
		//internal next page or publish
		String internalNextPage = nextPage;
		if (publish != null) {
			internalNextPage= publishPage;
		}
		if (previous != null) {
			internalNextPage= previousPage;
        }
		
	

		
		WizardData wizardData = new WizardData();
	    wizardData.setPagename(PageNameEnum.PlanABEPPage.toString());
		wizardData.setPagesequence(Pages.PlanABEPPage.getPageSequence());
		if (wizarddataid != null && wizarddataid.trim().length() > 0 ) {
			Integer wizardDataInt = Integer.valueOf(wizarddataid);
			wizardData.setWizarddataid(wizardDataInt);
		}
		Integer wizardIdInt = Integer.valueOf(wizardId);
		wizardData.setWizardid(wizardIdInt);
		
		PlanABEPPageModel pageModel  = new PlanABEPPageModel(planAAverageSale,
				planAGrossMargin, planAClosingPct,
				planAProspectValue, planAInvestment, planAProspectsNeeded,
				planAProspectSalesNeeded, planAGrossProfitOnSales
				, planAMonths,
				planAAdditionalGrossSales);
		String pageData = JSONManager.convertToJson(pageModel);
		
		wizardData.setPagedata(pageData);
		wizardDataRepository.save(wizardData);
		//model.addAttribute("wizard", wizard);
		return internalNextPage;
	}
}
