package web.page;



public enum Pages {
	
	
	 StrategicMarketingOne(PageNameEnum.StrategicMarketingPageOne, PageSequenceEnum.StrategicMarketingPageOne_Sequence.getDatabaseValue())
	,ConfidentialClientEvaluationOnePage(PageNameEnum.ConfidentialClientEvaluationOnePage, PageSequenceEnum.ConfidentialClientEvaluationOnePage_Sequence.getDatabaseValue())
	,PlanADigitalROICalculatorPage(PageNameEnum.PlanADigitalROICalculatorPage, PageSequenceEnum.PlanADigitalROICalculatorPage_Sequence.getDatabaseValue())
	,PlanBDigitalROICalculatorPage(PageNameEnum.PlanBDigitalROICalculatorPage, PageSequenceEnum.PlanBDigitalROICalculatorPage_Sequence.getDatabaseValue())
	,PlanAProposedPage(PageNameEnum.PlanAProposedPage, PageSequenceEnum.PlanAProposedPage_Sequence.getDatabaseValue())
	,PlanBProposedPage(PageNameEnum.PlanBProposedPage, PageSequenceEnum.PlanBProposedPage_Sequence.getDatabaseValue())
	,PlanAMediaPage(PageNameEnum.PlanAMediaPage, PageSequenceEnum.PlanAMediaPage_Sequence.getDatabaseValue())
	,PlanALifetimeValuedPage(PageNameEnum.PlanALifetimeValuedPage, PageSequenceEnum.PlanALifetimeValuedPage_Sequence.getDatabaseValue())
	,PlanBLifetimeValuedPage(PageNameEnum.PlanBLifetimeValuedPage, PageSequenceEnum.PlanBLifetimeValuedPage_Sequence.getDatabaseValue())
	,PlanABEPPage(PageNameEnum.PlanABEPPage, PageSequenceEnum.PlanABEPPage_Sequence.getDatabaseValue())
	,PlanBBEPPage(PageNameEnum.PlanBBEPPage, PageSequenceEnum.PlanBBEPPage_Sequence.getDatabaseValue())
	,PlanBMediaPage(PageNameEnum.PlanBMediaPage, PageSequenceEnum.PlanBMediaPage_Sequence.getDatabaseValue())
	,StrategicMarketingTwo(PageNameEnum.StrategicMarketingPageTwo, PageSequenceEnum.StrategicMarketingPageTwo_Sequence.getDatabaseValue())
	,StrategicMarketingThree(PageNameEnum.StrategicMarketingPageThree, PageSequenceEnum.StrategicMarketingPageThree_Sequence.getDatabaseValue())
	,PRESENTEDTOPAGE(PageNameEnum.PresentedToPage, PageSequenceEnum.PRESENTEDTOPAGE_SEQUENCE.getDatabaseValue())
	,TEAMCOMMITMENTPAGE(PageNameEnum.TeamCommitmentPage, PageSequenceEnum.TEAMCOMMITMENTPAGE_SEQUENCE.getDatabaseValue())
	,CLIENTOBJECTIVESONEPAGE(PageNameEnum.ClientObjectivesOnePage, PageSequenceEnum.CLIENTOBJECTIVESONEPAGE_SEQUENCE.getDatabaseValue())
	,MARKETPLACECOMPETITIONPAGE(PageNameEnum.MarketPlaceCompetitionPage, PageSequenceEnum.MARKETPLACECOMPETITIONPAGE_SEQUENCE.getDatabaseValue())
	,PlanAFlightDatesPage(PageNameEnum.PlanAFlightDatesPage, PageSequenceEnum.PlanAFlightDatesPage_Sequence.getDatabaseValue())
	,PlanBFlightDatesPage(PageNameEnum.PlanBFlightDatesPage, PageSequenceEnum.PlanBFlightDatesPage_Sequence.getDatabaseValue())
	,PlanConceptOnePage(PageNameEnum.PlanConceptOnePage, PageSequenceEnum.PlanConceptOnePage_Sequence.getDatabaseValue())
	,PlanConceptTwoPage(PageNameEnum.PlanConceptTwoPage, PageSequenceEnum.PlanConceptTwoPage_Sequence.getDatabaseValue())
	,TargetMarketingPage(PageNameEnum.TargetMarketingPage, PageSequenceEnum.TargetMarketingPage_Sequence.getDatabaseValue());
	
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




