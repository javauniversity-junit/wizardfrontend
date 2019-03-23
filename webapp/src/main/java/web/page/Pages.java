package web.page;



public enum Pages {
	
	
	StrategicMarketingOne(PageNameEnum.StrategicMarketingPageOne, PageSequenceEnum.StrategicMarketingPageOne_Sequence.getDatabaseValue())
	,PlanAMediaPage(PageNameEnum.PlanAMediaPage, PageSequenceEnum.PlanAMediaPage_Sequence.getDatabaseValue())
	,PlanBMediaPage(PageNameEnum.PlanBMediaPage, PageSequenceEnum.PlanBMediaPage_Sequence.getDatabaseValue())
	,StrategicMarketingTwo(PageNameEnum.StrategicMarketingPageTwo, PageSequenceEnum.StrategicMarketingPageTwo_Sequence.getDatabaseValue())
	,StrategicMarketingThree(PageNameEnum.StrategicMarketingPageThree, PageSequenceEnum.StrategicMarketingPageThree_Sequence.getDatabaseValue())
	,PRESENTEDTOPAGE(PageNameEnum.PresentedToPage, PageSequenceEnum.PRESENTEDTOPAGE_SEQUENCE.getDatabaseValue())
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




