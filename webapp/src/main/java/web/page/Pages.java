package web.page;



public enum Pages {
	
	
	
	PRESENTEDTOPAGE(PageNameEnum.PresentedToPage, PageSequenceEnum.PRESENTEDTOPAGE_SEQUENCE.getDatabaseValue())
	,TEAMCOMMITMENTPAGE(PageNameEnum.TeamCommitmentPage, PageSequenceEnum.TEAMCOMMITMENTPAGE_SEQUENCE.getDatabaseValue())
	,CLIENTOBJECTIVESONEPAGE(PageNameEnum.ClientObjectivesOnePage, PageSequenceEnum.CLIENTOBJECTIVESONEPAGE_SEQUENCE.getDatabaseValue())
	,MARKETPLACECOMPETITIONPAGE(PageNameEnum.MarketPlaceCompetitionPage
			, PageSequenceEnum.MARKETPLACECOMPETITIONPAGE_SEQUENCE.getDatabaseValue());
	
	private PageNameEnum pageName;
	private Integer pageSequence;
	
	
	private Pages(PageNameEnum pageName, Integer pageSequence) {
		this.pageName = pageName;
		this.pageSequence = pageSequence;
	}
	public PageNameEnum getPageName() {
		return pageName;
	}
	public void setPageName(PageNameEnum pageName) {
		this.pageName = pageName;
	}
	public Integer getPageSequence() {
		return pageSequence;
	}
	public void setPageSequence(Integer pageSequence) {
		this.pageSequence = pageSequence;
	}
	
	

	
	
}


