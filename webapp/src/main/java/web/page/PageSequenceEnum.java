package web.page;

public enum PageSequenceEnum {
	
	PRESENTEDTOPAGE_SEQUENCE(1)
	, TEAMCOMMITMENTPAGE_SEQUENCE(2)
	, MARKETPLACECOMPETITIONPAGE_SEQUENCE(3)
	, CLIENTOBJECTIVESONEPAGE_SEQUENCE(4)
	, StrategicMarketingPageOne_Sequence(5)
	,StrategicMarketingPageTwo_Sequence(6)
	,StrategicMarketingPageThree_Sequence(7)
	,PlanAProposedPage_Sequence(12)
	,PlanAMediaPage_Sequence(18)
	,PlanBMediaPage_Sequence(19)
	,PlanALifetimeValuedPage_Sequence(16);
	
	private int databaseValue;
    private PageSequenceEnum(int databaseValue) {
        this.databaseValue = databaseValue;
    }

    public int getDatabaseValue() {
        return databaseValue;
    }
}
