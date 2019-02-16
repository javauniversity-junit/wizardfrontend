const map = new Map();
map.set('introduceNewDepartmentLabel', 'Introduce New Department/Products/Services');
map.set('featureSpecificProductsLabel', 'Feature Specific Products/Services');
map.set('callAttentiontoBrandsPrivateLabelsCarriedLabel', 'Call Attention to Brands/Private Labels Carried');
map.set('promoteOffPriceItemsServicesLabel', 'Promote Off-price Items/Services');


map.set('utilizeCoopVendorDollarsLabel', 'Utilize Co-op/Vendor Dollars');
map.set('retainCurrentConsumersLabel', 'Retain/Recapture Consumers');

map.set('increaseCustomerVisitsLabel', 'Increase Frequency of Customer Visits');
map.set('increaseTrafficLeadCallsLabel', 'Grow New Traffic/Lead Calls');
map.set('expandTargetConsumersLabel', 'Expand Target Consumers (by age, sex, geography)');
map.set('changeConsumerAttitudesLabel', 'Change Consumer Attitudes');
map.set('makePromotionalEventsStrongerLabel', 'Make Promotional Events Stronger');
map.set('increaseDigitalMobileOnlineResponseLabel', 'Develop Digital/Mobile/Social Strategies');
map.set('developDatabaseMarketingLabel', 'Develop Database Marketing (Email and Text)');
map.set('initiateCauseMarketingProgramLabel', 'Initiate Cause Marketing Programs');
map.set('developSpeciallyStagedEventLabel', 'Develop Specially Staged Events');
map.set('maintainMarketDominanceLabel', 'Maintain Market Dominance');
map.set('improveBusinessNameBrandLabel', 'Elevate Business Brand/Image');
map.set('establishorReestablishBusinessImageLabel', 'Improve Reputation and Listing Management');
map.set('createPentUpDemandLabel', 'Enhance Website (Mobile, Response, SEO, SEM)');
map.set('increaseMarketShareLabel', 'Increase Market Share');
map.set('otherLabel', 'Other:');


function addLabel(key) {
	
	var keyvalue = map.get(key);
	document.getElementById(key).innerHTML = keyvalue;
	
}