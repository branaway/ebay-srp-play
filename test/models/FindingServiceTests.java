package models;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import org.junit.Test;

import utils.Ebay;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class FindingServiceTests {
//	@Test
//	public void testFindByKeys() {
//		FindingServicePortType port = new FindingService().getFindingServiceSOAPPort();
//		FindItemsByKeywordsRequest k = new FindItemsByKeywordsRequest();
//		k.setKeywords("GH2");
//		PaginationInput paging = new PaginationInput();
//		paging.pageNumber = 1;
//		paging.entriesPerPage = 10;
//		k.setPaginationInput(paging);
//
//		Map<String, List<String>> headers = new HashMap<String, List<String>>();
//		headers.put("X-EBAY-SOA-SERVICE-NAME", Collections.singletonList("FindingService"));
//		headers.put("X-EBAY-SOA-OPERATION-NAME", Collections.singletonList("findItemsByKeywords"));
//		headers.put("X-EBAY-SOA-SERVICE-VERSION", Collections.singletonList("1.8.0"));
//		// headers.put("X-EBAY-SOA-GLOBAL-ID",
//		// Collections.singletonList("EBAY-US");
//		headers.put("X-EBAY-SOA-SECURITY-APPNAME", Collections.singletonList("Foobat96e-1d23-4ae7-8e15-e5874c9cd58"));
//		headers.put("X-EBAY-SOA-REQUEST-DATA-FORMAT", Collections.singletonList("XML"));
//		headers.put("X-EBAY-SOA-MESSAGE-PROTOCOL", Collections.singletonList("SOAP12"));
//
//		((BindingProvider) port).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);
//
//		FindItemsByKeywordsResponse found = port.findItemsByKeywords(k);
//		assertEquals(10, found.getSearchResult().getCount());
//	}
//
//	@Test
//	public void testGsonDeserialization() throws IOException {
//		JsonElement res = Ebay.getFromFile();
//		
//		JsonArray allRes = (JsonArray)((JsonObject) res).get("findItemsByKeywordsResponse");
//		JsonObject theRes = (JsonObject) allRes.get(0);
//		
//		Gson gson = new Gson();
//		FindItemsByKeywordsResponse fromJson = gson.fromJson(theRes, FindItemsByKeywordsResponse.class);
//		assertEquals(50, fromJson.getSearchResult().getCount());
//	}
//
//	@Test
//	public void testContainer() throws IOException {
//		InputStream resourceAsStream = this.getClass().getResourceAsStream("/models/Nodes.js");
//		InputStreamReader r = new InputStreamReader(resourceAsStream);
////		BufferedReader br = new BufferedReader(r);
////		StringBuilder sb = new StringBuilder();
////		String line = "";
////		while ((line = br.readLine()) != null) {
////			sb.append(line);
////		}
////		br.close();
//		JsonObject res = (JsonObject) new JsonParser().parse(r);
//		r.close();
//
//		Gson gson = new Gson();
//		Container fromJson = gson.fromJson(res, Container.class);
//		assertEquals(3, fromJson.getNodes().size());
//	}
//	
	
}
