package web.page.presentedtopage;

import java.util.Optional;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

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
public class PresentedToPageController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardRepository wizardRepository;

	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardDataRepository wizardDataRepository;

	private static final Logger mLog = Logger.getLogger(PresentedToPageController.class.getName());

	@RequestMapping(value = "/PresentedToPage", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID,HttpSession session) {
		mLog.info("starting detail");
		mLog.info("ID [" + ID + "]");
		

		// get wizard header
		String decryptID = EncryptionDecryptionManager.decrypt(ID);
		mLog.info("decryptID [" + decryptID + "]");
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(decryptID));
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository
				.findByPagesequenceAndWizardid(Pages.PRESENTEDTOPAGE.getPageSequence(), wizard.getWizardid());
		PresentedToPageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel = (PresentedToPageModel) JSONManager.convertFromJson(wizardData.getPagedata(),
					PresentedToPageModel.class);

		}
		session.setAttribute("ID", decryptID);
		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return "pages/PresentedToPage";
	}

	@RequestMapping(value = "/savePresentedToPage", method = RequestMethod.POST)
	public String save(@RequestParam String wizardId, @RequestParam(defaultValue = "") String portfolioPhoneNumber,
			@RequestParam(defaultValue = "") String portfolioManagerName,
			@RequestParam(value = "excluded", required = false) String excluded,
			@RequestParam(defaultValue = "") String clientBusinessName,
			@RequestParam(defaultValue = "") String clientContactName, @RequestParam(defaultValue = "") String station,
			@RequestParam String wizarddataid, @RequestParam String nextPage, @RequestParam String publishNextPage,
			@RequestParam(required = false, value = "next") String next,
			@RequestParam(required = false, value = "publish") String publish,  HttpSession session) {
		mLog.info("starting save");
		
		wizardId = session.getAttribute("ID").toString();
		// internal next page or publish
		String internalNextPage = nextPage;
		if (publish != null) {
			internalNextPage = publishNextPage;
		}
		boolean shouldExclude = false;
		if(excluded != null)
  		{
    			mLog.info("checkbox is checked");
			shouldExclude = true;
  		}
 		
		
		

		WizardData wizardData = new WizardData();
		wizardData.setExcluded(shouldExclude);
		
		
		wizardData.setPagename(PageNameEnum.PresentedToPage.toString());
		wizardData.setPagesequence(Pages.PRESENTEDTOPAGE.getPageSequence());
		if (wizarddataid != null && wizarddataid.trim().length() > 0) {
			Integer wizardDataInt = Integer.valueOf(wizarddataid);
			wizardData.setWizarddataid(wizardDataInt);
		}
		Integer wizardIdInt = Integer.valueOf(wizardId);
		wizardData.setWizardid(wizardIdInt);
		PresentedToPageModel demographic = new PresentedToPageModel(portfolioPhoneNumber, portfolioManagerName,
				clientBusinessName, clientContactName, station);
		String pageData = JSONManager.convertToJson(demographic);

		wizardData.setPagedata(pageData);
		wizardDataRepository.save(wizardData);
		// model.addAttribute("wizard", wizard);
		return internalNextPage;
	}

}
