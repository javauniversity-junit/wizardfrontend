package web.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class WebClientHeader implements  java.io.Serializable{
	
	private HeaderMaster mHeaderMaster = new HeaderMaster();

	private Gson gson = new Gson();
	
	public void add(String headerKey, String headerValue) {
		Header header = new Header(headerKey, headerValue);
		mHeaderMaster.getHeaderList().add(header);
		
	}
	
	
	public String convertToJson() {
		
		String json = null;
		 // convert map to JSON String
		//.json.gson.
		json = gson.toJson(mHeaderMaster);
		return json;
	}
    public static HeaderMaster convertFromJson(String json) {
		
         
    	 Gson gson = new GsonBuilder().create();
    	
		 // convert map to JSON String
    	 HeaderMaster header = gson.fromJson(json,HeaderMaster.class);
		return header;
	}
	

}
