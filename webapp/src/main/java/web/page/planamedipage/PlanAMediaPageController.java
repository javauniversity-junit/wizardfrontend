package web.page.planamedipage;

import java.util.List;
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
public class PlanAMediaPageController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardRepository wizardRepository;

	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardDataRepository wizardDataRepository;

	private static final Logger mLog = Logger.getLogger(PlanAMediaPageController.class.getName());

	@RequestMapping(value = "/PlanAMediaPage", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID, HttpSession session) {
		mLog.info("starting detail");
		String decryptID = session.getAttribute("ID").toString();
		mLog.info("decryptID " + decryptID);
		// get wizard header
		Optional<Wizard> wizardOpt = wizardRepository.findById(Integer.valueOf(decryptID));
	
		Wizard wizard = wizardOpt.orElse(null);
		WizardData wizardData = wizardDataRepository
				.findByPagesequenceAndWizardid(Pages.PlanAMediaPage.getPageSequence(), wizard.getWizardid());
		PlanMediaPageModel dataPageModel = null;
		if (wizardData != null) {
			dataPageModel = (PlanMediaPageModel) JSONManager.convertFromJson(wizardData.getPagedata(),
					PlanMediaPageModel.class);

		}
		// DemographicManager.convertFromJson(json)
		model.addAttribute("wizardData", wizardData);
		model.addAttribute("dataPageModel", dataPageModel);
		model.addAttribute("wizard", wizard);
		return "pages/PlanAMediaPage";
	}

	@RequestMapping(value = "/savePlanAMediaPage", method = RequestMethod.POST)
	public String save(@RequestParam String wizardId, @RequestParam String wizarddataid,
			@RequestParam(required = false, value = "") String jantype,
			@RequestParam(required = false, value = "") String febtype,
			@RequestParam(required = false, value = "") String martype,
			@RequestParam(required = false, value = "") String aprtype,
			@RequestParam(required = false, value = "") String maytype,
			@RequestParam(required = false, value = "") String juntype,
			@RequestParam(required = false, value = "") String jultype,
			@RequestParam(required = false, value = "") String augtype,
			@RequestParam(required = false, value = "") String septype,
			@RequestParam(required = false, value = "") String octtype,
			@RequestParam(required = false, value = "") String novtype,
			@RequestParam(required = false, value = "") String dectype,
			@RequestParam(required = false, value = "") String mediarows, @RequestParam String previousPage,
			@RequestParam String publishPage, @RequestParam(required = false, value = "next") String next,
			@RequestParam(required = false, value = "publish") String publish,
			@RequestParam(required = false, value = "previous") String previous, @RequestParam String nextPage, HttpSession session) {
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
		wizardData.setPagename(PageNameEnum.PlanAMediaPage.toString());
		wizardData.setPagesequence(Pages.PlanAMediaPage.getPageSequence());
		if (wizarddataid != null && wizarddataid.trim().length() > 0) {
			Integer wizardDataInt = Integer.valueOf(wizarddataid);
			wizardData.setWizarddataid(wizardDataInt);
		}
		wizardId = session.getAttribute("ID").toString();
		Integer wizardIdInt = Integer.valueOf(wizardId);
		wizardData.setWizardid(wizardIdInt);
		List<MediaRow> mediaRowList = null;
		PlanMediaPageModel pageModel = new PlanMediaPageModel(jantype, febtype, martype, aprtype, maytype, juntype,
				jultype, augtype, septype, octtype, novtype, dectype, mediarows, mediaRowList);
		String pageData = JSONManager.convertToJson(pageModel);

		wizardData.setPagedata(pageData);
		wizardDataRepository.save(wizardData);
		// model.addAttribute("wizard", wizard);
		return internalNextPage;
	}
}
