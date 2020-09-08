let navigationMap = new Map();
//load map
navigationMap.set(1,"PresentedToPage");
navigationMap.set(2,"TeamCommitmentPage");
navigationMap.set(3,"MarketPlaceCompetitionPage");
navigationMap.set(4,"ClientObjectivesPage");
navigationMap.set(5,"StrategicMarketingPageTwo");
navigationMap.set(6,"TargetMarketingPage");
navigationMap.set(7,"ConfidentialClientEvaluationPageData");
navigationMap.set(8,"ConfidentialClientEvaluationLastYearPage");
navigationMap.set(9,"ConfidentialClientEvaluationProposedPage");
navigationMap.set(10,"ClientObjectivesPage");
navigationMap.set(11,"StrategicMarketingPageTwo");
navigationMap.set(12,"CreateConceptOne");
navigationMap.set(13,"CreateConceptTwo");
navigationMap.set(14,"DigitalMobileSocialStrategies");
navigationMap.set(15,"LongRangeStrategicPlansPage");
navigationMap.set(16,"MarketPlaceCompetitionPage");
navigationMap.set(17,"ClientObjectivesPage");
navigationMap.set(18,"StrategicMarketingPageTwo");
navigationMap.set(19,"TargetMarketingPage");
navigationMap.set(20,"ConfidentialClientEvaluationPageData");
navigationMap.set(21,"AdvantagesLongRange");
navigationMap.set(22,"TeamCommitmentPage");
navigationMap.set(23,"MarketPlaceCompetitionPage");
navigationMap.set(24,"ClientObjectivesPage");
navigationMap.set(25,"StrategicMarketingPageTwo");
navigationMap.set(26,"TargetMarketingPage");
navigationMap.set(27,"ConfidentialClientEvaluationPageData");
navigationMap.set(28,"TeamCommitmentPage");
navigationMap.set(29,"MarketPlaceCompetitionPage");
navigationMap.set(30,"ClientObjectivesPage");
navigationMap.set(31,"ClientPolicyAgreementPage");
navigationMap.set(32,"StrategicMarketingPageTwo");
//navigationMap.set(1,"PresentedToPage");
//navigationMap.set(1,"PresentedToPage");


function gotoAnchor(anchorID,direction) {
	console.group("gotoAnchor");
	var elementToScroll = null;
	
	

	var elmnt = null;
	var found = false;
	
	while(found == false) {
		
		elementToScroll = navigationMap.get(anchorID);
		if (typeof elementToScroll == "undefined"  ) {
			console.log("not found [" + anchorID + "]");
			break;
		}
		console.log("section [" + elementToScroll + "]");
		elmnt = document.getElementById(elementToScroll);
		if (elmnt != null) {
			console.log("found [" + anchorID + "]");
			break;
		} else {
			if (direction == "down") {
				anchorID = anchorID + 1;
				console.log("down [" + anchorID + "]");
				continue;
			} else {
				anchorID = anchorID - 1;
				console.log("up [" + anchorID + "]");
				continue;
			}
		}//outter if
		
		
	}//end of while
	
	if (elmnt != null ) { 
	    elmnt.scrollIntoView();
    }
	console.groupEnd();
}

