package web.page;



public enum Pages {
	
	
	
	DEMOGRAPHIC(DatabaseConstants.DATABASE_DEMOGRAPHIC_VALUE, PageSequence.DEMOGRAPHIC_SEQUENCE);
	
	
	private String pageName;
	private Integer pageSequence;
	
	
	private Pages(String pageName, Integer pageSequence) {
		this.pageName = pageName;
		this.pageSequence = pageSequence;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public Integer getPageSequence() {
		return pageSequence;
	}
	public void setPageSequence(Integer pageSequence) {
		this.pageSequence = pageSequence;
	}
	public static class PageSequence {
        public static final Integer DEMOGRAPHIC_SEQUENCE = 1;
      
    }
	

	public static class DatabaseConstants {
        public static final String DATABASE_DEMOGRAPHIC_VALUE = "demographic";
      
    }
	
}


