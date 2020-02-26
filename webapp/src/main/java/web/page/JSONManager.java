package web.page;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONManager {
	private static Gson gson = new Gson();

	public static String convertToJson(Object pageModel) {

		String json = null;
		// convert map to JSON String
		// .json.gson.
		json = gson.toJson(pageModel);
		return json;
	}

	public static Object convertFromJson(String json, Class pageModelClass) {

		Gson gson = new GsonBuilder().create();

		// convert map to JSON String
		Object pageModelObject = gson.fromJson(json, pageModelClass);
		return pageModelObject;
	}

}
