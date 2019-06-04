package web.page;

public enum PageSequenceEnum {
	
	PRESENTEDTOPAGE_SEQUENCE(1)
	,TEAMCOMMITMENTPAGE_SEQUENCE(2)
	,MARKETPLACECOMPETITIONPAGE_SEQUENCE(3)
	,CLIENTOBJECTIVESONEPAGE_SEQUENCE(4)
	,StrategicMarketingPageOne_Sequence(5)
	,StrategicMarketingPageTwo_Sequence(6)
	,StrategicMarketingPageThree_Sequence(7)
	,ConfidentialClientEvaluationOnePage_Sequence(9)
	,TargetMarketingPage_Sequence(11)
	,PlanAProposedPage_Sequence(12)
	,PlanABEPPage_Sequence(13)
	,PlanBProposedPage_Sequence(14)
	,PlanALifetimeValuedPage_Sequence(15)
	,PlanBBEPPage_Sequence(16)
	,PlanBLifetimeValuedPage_Sequence(17)
	,PlanAMediaPage_Sequence(18)
	,PlanBMediaPage_Sequence(19)
	,PlanADigitalROICalculatorPage_Sequence(21)
	,PlanBDigitalROICalculatorPage_Sequence(22);


	
	private int databaseValue;
    private PageSequenceEnum(int databaseValue) {
        this.databaseValue = databaseValue;
    }

    public int getDatabaseValue() {
        return databaseValue;
    }
}
