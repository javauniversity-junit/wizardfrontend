package web.page;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.logging.Logger;
import web.page.*;
import web.page.marketplacecompetitionpage.MarketPlaceCompetitionPageModel;
import web.model.WizardData;
import web.page.presentedtopage.PresentedToPageController;
import web.page.presentedtopage.PresentedToPageModel;
import web.page.strategicmarketingpageone.StrategicMarketingPageOneModel;
import web.page.teamcommitmentpage.TeamCommitmentPageModel;
import web.repository.WizardDataRepository;

@Controller // This means that this class is a Controller
public class PublishController {
	private static final Logger mLog = Logger.getLogger(PresentedToPageController.class.getName());
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private WizardDataRepository wizardDataRepository;

	@RequestMapping(value = "/Publish", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam String ID) {
		Integer idInt = Integer.parseInt(ID);
		// get all pages
		Iterable<WizardData> dataPages = wizardDataRepository.findByWizardid(idInt);
		for (WizardData data : dataPages) {
			// pull of data model
			PageNameEnum pageName = null;
			try {
				pageName = PageNameEnum.valueOf(data.getPagename());
			} catch (Exception ex) {
				mLog.severe("error " + ex.getMessage());
				continue;
			}
			mLog.info("page name = " + pageName);
			switch (pageName) {
			case PresentedToPage:
				PresentedToPageModel presentedToPageModel = null;

				presentedToPageModel = (PresentedToPageModel) JSONManager.convertFromJson(data.getPagedata(),
						PresentedToPageModel.class);
				model.addAttribute("PresentedToPage", presentedToPageModel);

				mLog.info("found page PresentedToPage");
				break;
			case TeamCommitmentPage:
				TeamCommitmentPageModel teamCommitmentPageModel = null;

				teamCommitmentPageModel = (TeamCommitmentPageModel) JSONManager.convertFromJson(data.getPagedata(),
						TeamCommitmentPageModel.class);
				model.addAttribute("TeamCommitmentPage", teamCommitmentPageModel);
				mLog.info("found page TeamCommitmentPage");
				break;
			case StrategicMarketingPageOne:
				StrategicMarketingPageOneModel strategicMarketingPageOneModel = null;

				strategicMarketingPageOneModel = (StrategicMarketingPageOneModel) JSONManager.convertFromJson(data.getPagedata(),
						StrategicMarketingPageOneModel.class);
				model.addAttribute("StrategicMarketingPageOne", strategicMarketingPageOneModel);
				mLog.info("found page StrategicMarketingPageOne");
				mLog.info("value found page StrategicMarketingPageOne " + strategicMarketingPageOneModel.getYearsInBusiness());
				break;				
			case MarketPlaceCompetitionPage:
				MarketPlaceCompetitionPageModel marketPlaceCompetitionPageModel = null;

				marketPlaceCompetitionPageModel = (MarketPlaceCompetitionPageModel) JSONManager
						.convertFromJson(data.getPagedata(), MarketPlaceCompetitionPageModel.class);
				model.addAttribute("MarketPlaceCompetitionPageModel", marketPlaceCompetitionPageModel);
				mLog.info("found page MarketPlaceCompetitionPageModel");
				break;
			}

		}

		return "publish";
	}

}
