package web.page;



public enum Pages {
	
	
	
	DEMOGRAPHIC(WebURLConstants.WEBURL_DEMOGRAPHIC_VALUE, InternalURLConstants.INTERNAL_DEMOGRAPHIC_VALUE, DatabaseConstants.DATABASE_DEMOGRAPHIC_VALUE);
	
	private String webURL;
	private String interalURL;
	private String databaseType;
	public String getInteralURL() {
		return interalURL;
	}
	public String getDatabaseType() {
		return databaseType;
	}
	public String getWebURL() {
		return webURL;
	}
	Pages(String webURL, String internalURL, String databaseType ) {
		this.webURL = webURL;
		this.interalURL = internalURL;
		this.databaseType = databaseType;
    }
	
	
	
	
	public static class WebURLConstants {
        public static final String WEBURL_DEMOGRAPHIC_VALUE = "/wizard/demographic";
      
    }
	
	public static class Next_Internal_URL_Constants {
        public static final String WEBURL_DEMOGRAPHIC_VALUE = "/wizard/demographic";
      
    }
	public static class InternalURLConstants {
        public static final String INTERNAL_DEMOGRAPHIC_VALUE = "wizard/demographic";
      
    }
	public static class DatabaseConstants {
        public static final String DATABASE_DEMOGRAPHIC_VALUE = "demographic";
      
    }
	
}


