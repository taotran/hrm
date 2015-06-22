package vn.com.ecopharma.hrm.util;

import java.io.PrintWriter;
import java.util.Map;

import org.json.JSONObject;

import com.google.gson.Gson;

public class JSONServiceUtil {

	public static void writeJSON(PrintWriter writer, Map<String, Object> map) {
		Gson gson = new Gson();
		
		if (writer == null) {
			return;
		}
		String jsonString = gson.toJson(map);
		System.out.println("JSON STRING: "+jsonString);
		writer.print(jsonString);
		writer.flush();
	}
	
	public static void writeJSON(PrintWriter writer, JSONObject object) {
		writer.print(object);
		writer.close();
	}
}
