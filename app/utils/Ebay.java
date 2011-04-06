package utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import play.libs.WS;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Ebay {

	/**
	 * @param query
	 * @return
	 */
	public static JsonElement getJson(final String query) {
		final String url = "http://svcs.ebay.com/services/search/FindingService/v1?OPERATION-NAME=findItemsByKeywords&" +
				"SERVICE-VERSION=1.8.0&SECURITY-APPNAME=Foobat96e-1d23-4ae7-8e15-e5874c9cd58&" +
				"RESPONSE-DATA-FORMAT=JSON&REST-PAYLOAD&" +
				"keywords=" + query + "&paginationInput.entriesPerPage=50&" +
				"outputSelector%280%29=SellerInfo&outputSelector%281%29=CategoryHistogram";
		final JsonElement results = WS.url(url).get().getJson();
		return results;
	}

	public static JsonElement getJsonLocal() {
		// TODO Auto-generated method stub
		return getFromFile();
	}

	/**
	 * @return
	 * @throws IOException
	 */
	public static JsonElement getFromFile() {
		synchronized (Ebay.class) {
			if (root == null) {
				InputStream resourceAsStream = Ebay.class.getResourceAsStream("/controllers/SearchByKey.js");
				InputStreamReader r = new InputStreamReader(resourceAsStream);
				JsonObject res = (JsonObject) new JsonParser().parse(r);
				try {
					r.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				root = res;
			}
		}
		return root;
	}

	static JsonElement root = null;
}
