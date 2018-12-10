package web.page;



public enum Pages {
	
	
	
	DEMOGRAPHIC(WebURLConstants.WEBURL_DEMOGRAPHIC_VALUE, InternalURLConstants.INTERNAL_DEMOGRAPHIC_VALUE, DatabaseConstants.DATABASE_DEMOGRAPHIC_VALUE);
	
	Pages(String webURL, String internalURL, String databaseType ) {
    }
	
	
	
	
	public static class WebURLConstants {
        public static final String WEBURL_DEMOGRAPHIC_VALUE = "/wizard/demographic";
      
    }
	public static class InternalURLConstants {
        public static final String INTERNAL_DEMOGRAPHIC_VALUE = "wizard/demographic";
      
    }
	public static class DatabaseConstants {
        public static final String DATABASE_DEMOGRAPHIC_VALUE = "demographic";
      
    }
	
}


