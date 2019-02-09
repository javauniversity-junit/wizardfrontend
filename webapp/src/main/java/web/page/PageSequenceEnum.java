package web.page;

public enum PageSequenceEnum {
	
	PRESENTEDTOPAGE_SEQUENCE(1)
	, TEAMCOMMITMENTPAGE_SEQUENCE(2)
	, MARKETPLACECOMPETITIONPAGE_SEQUENCE(3)
	, CLIENTOBJECTIVESONEPAGE_SEQUENCE(4);
	
	private int databaseValue;
    private PageSequenceEnum(int databaseValue) {
        this.databaseValue = databaseValue;
    }

    public int getDatabaseValue() {
        return databaseValue;
    }
}
