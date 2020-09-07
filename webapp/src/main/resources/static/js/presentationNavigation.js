let navigationMap = new Map();
//load map
navigationMap.set(1,"PresentedToPage");
navigationMap.set(2,"TeamCommitmentPage");
navigationMap.set(3,"MarketPlaceCompetitionPage");
navigationMap.set(4,"ClientObjectivesPage");
navigationMap.set(5,"StrategicMarketingPageTwo");
navigationMap.set(6,"TargetMarketingPage");
navigationMap.set(7,"ConfidentialClientEvaluationPageData");
navigationMap.set(14,"ClientObjectivesPage");
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

