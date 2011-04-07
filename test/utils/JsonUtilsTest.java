package utils;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonUtilsTest {

	@Test
	public void testGetElementWithOttbjectArrayGson() throws IOException {
		JsonParser jsonParser = new JsonParser();
//		InputStream resourceAsStream = this.getClass().getResourceAsStream("/models/Nodes.js");
		StringReader r = new StringReader(this.jsonSrc);
		JsonObject res = (JsonObject) jsonParser.parse(r); // this is slow

		long t = System.currentTimeMillis();
		int p = 100;
		while (p-- > 0) {
			r = new StringReader(this.jsonSrc);
			res = (JsonObject) jsonParser.parse(r); // this is slow

			JsonElement element = JsonUtils.getElement(res, new Object[] { "ack" });
			assertEquals("Success", element.getAsString());

			element = JsonUtils.getElement(res, new Object[] { "nodes", 0, "details", 1, "d2" });
			assertEquals("d2", element.getAsString());
		}
		System.out.println("took: " + (System.currentTimeMillis() - t));
	}

	@Test
	public void testGetElementPath() throws IOException {
		JsonObject res = getJson();

		JsonElement element = JsonUtils.getElement(res, "ack");
		assertEquals("Success", element.getAsString());

		element = JsonUtils.getElement(res, "nodes/0/details/1/d2");
		assertEquals("d2", element.getAsString());

	}

	@Test
	public void testGetArrayPath() throws IOException {
		JsonObject res = getJson();

		JsonArray a = JsonUtils.getArray(res, "nodes");
		assertEquals(3, a.size());

		JsonElement e = JsonUtils.getElement(a.get(0), "details/1/d2");
		assertEquals("d2", e.getAsString());

	}

	@Test
	public void testGetString() throws IOException {
		JsonObject res = getJson();

		JsonArray a = JsonUtils.getArray(res, "nodes");
		assertEquals(3, a.size());

		String e = JsonUtils.getString(a.get(0), "details/1/d2");
		assertEquals("d2", e);

	}

	/**
	 * @return
	 * @throws IOException
	 */
	private JsonObject getJson() throws IOException {
		InputStream resourceAsStream = this.getClass().getResourceAsStream("/models/Nodes.js");
		BufferedReader r = new BufferedReader(new InputStreamReader(resourceAsStream));
		JsonObject res = (JsonObject) new JsonParser().parse(r); // this is slow
		r.close();
		return res;
	}

	/**
	 * Jackson parser seems a lot slower!
	 * 
	 * @throws IOException
	 */
	@Test
	public void testGetElementWithObjectArrayJackson() throws IOException {
		InputStream resourceAsStream = this.getClass().getResourceAsStream("/models/Nodes.js");
		BufferedReader r = new BufferedReader(new InputStreamReader(resourceAsStream));
		ObjectMapper m = new ObjectMapper();
		m.configure(org.codehaus.jackson.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		m.configure(org.codehaus.jackson.JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);

		JsonNode res = m.readValue(r, JsonNode.class);
		res = m.readValue(r, JsonNode.class);
		// JsonNode res = m.readTree(r); // the same
		r.close();

		JsonNode element = JsonUtilsJackson.getElement(res, new Object[] { "ack" });
		assertEquals("Success", element.getTextValue());

		element = JsonUtilsJackson.getElement(res, new Object[] { "nodes", 0, "details", 1, "d2" });
		assertEquals("d2", element.getTextValue());

	}

	@Test
	public void testJackdonPerf() throws IOException {
		StringReader r = new StringReader(jsonSrc);
		JsonNode res = m.readValue(r, JsonNode.class);
		// JsonNode res = m.readTree(r); // the same
		long t = System.currentTimeMillis();
		int p = 100;
		while (p-- > 0) {
			 r = new StringReader(jsonSrc);
			 res = m.readValue(r, JsonNode.class);
			// System.out.print(p);
			// res = m.readValue(r, JsonNode.class);

			JsonNode element = JsonUtilsJackson.getElement(res, new Object[] { "ack" });
			assertEquals("Success", element.getTextValue());

			element = JsonUtilsJackson.getElem(res, "nodes", 0, "details", 1, "d2");
			// element = JsonUtilsJackson.getElement(res, "nodes.0.details.1.d2"
			// );

			assertEquals("d2", element.getTextValue());
		}
		System.out.println();
		System.out.println(System.currentTimeMillis() - t);

	}

	@Before
	public void init() throws JsonParseException, JsonMappingException, IOException {
		m = new ObjectMapper();
		m.configure(org.codehaus.jackson.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		m.configure(org.codehaus.jackson.JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		StringReader r = new StringReader(j);
		JsonNode res = m.readValue(r, JsonNode.class);
	}

	ObjectMapper m;
	JsonParser p;

	static String jsonSrc = "{\n" +
			"	ack : \"Success\",\n" +
			"	nodes: [ {\n" +
			"		item1 : 'value1a',\n" +
			"		item2 : 'value2a',\n" +
			"		details: [\n" +
			"		             {d1:\"d1\", d2:\"d2\"},\n" +
			"		             {d1:\"d1\", d2:\"d2\"}\n" +
			"		             ]\n" +
			"	}, {\n" +
			"		item1 : 'value1b',\n" +
			"		item2 : 'value2b',\n" +
			"		details: [\n" +
			"		             {d1:\"d1\", d2:\"d2\"},\n" +
			"		             {d1:\"d1\", d2:\"d2\"}\n" +
			"		             ]\n" +
			"	}, {\n" +
			"		item1 : 'value1c',\n" +
			"		item2 : 'value2c',\n" +
			"		details: [\n" +
			"		             {d1:\"d1\", d2:\"d2\"},\n" +
			"		             {d1:\"d1\", d2:\"d2\"}\n" +
			"		             ]\n" +
			"	} \n" +
			"	]\n" +
			"}";

	static String j = "{ack : \"Success\"}";

	@Test
	public void testConvertPathStack() {
		String path = "names/0/firstName";
		Object[] stack = JsonUtils.convertPathStack(path);
		assertEquals(3, stack.length);
		assertEquals("names", stack[0]);
		assertEquals(0, stack[1]);
		assertEquals("firstName", stack[2]);

		path = "names";
		stack = JsonUtils.convertPathStack(path);
		assertEquals(1, stack.length);
	}

}
