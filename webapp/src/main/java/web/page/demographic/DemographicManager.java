package web.page.demographic;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class DemographicManager {
	private static Gson gson = new Gson();
	
public static String convertToJson(Demographic demo) {
		
		String json = null;
		 // convert map to JSON String
		//.json.gson.
		json = gson.toJson(demo);
		return json;
	}
    public static Demographic convertFromJson(String json) {
		
         
    	 Gson gson = new GsonBuilder().create();
    	
		 // convert map to JSON String
    	 Demographic demo = gson.fromJson(json,Demographic.class);
		return demo;
	}

}
