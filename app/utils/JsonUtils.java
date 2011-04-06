package utils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonUtils {
	/**
	 * 
	 * @param json
	 * @param pathStack the path stack as an array of String or Integer or the mix. Example: {"name", 2, "address", 1}
	 * @return
	 */
	public static JsonElement getElement(JsonElement json, Object[] pathStack) {
		JsonElement ret = json;
		for (Object p : pathStack) {
			if (p instanceof String) {
				ret = ((JsonObject) ret).get((String) p);
			} else if (p instanceof Integer) {
				ret = ((JsonArray) ret).get((Integer) p);
			} else {
				throw new RuntimeException("The path e" +
						"lements can only be either String or Integer: " + p.getClass());
			}
		}
		return ret;
	}
	
	public static JsonElement getElement(JsonElement json, String path) {
		return getElement(json, convertPathStack(path));
//		return onePassGet(json, path);
	}

	/**
	 * @param json
	 * @param path
	 * @return
	 */
	private static JsonElement onePassGet(JsonElement json, String path) {
		JsonElement ret = json;
		int current = 0;
		for (int p = 0; p < path.length(); p++) {
			char charAt = path.charAt(p);
			if (charAt == '.' || charAt == '/') {
				String token = path.substring(current, p);
				current = p + 1;
				try {
					int parseInt = Integer.parseInt(token);
					ret = ((JsonArray) ret).get(parseInt);
				} catch (NumberFormatException e) {
					ret = ((JsonObject) ret).get(token);
				}
			}
		}
		// the last one
		String token = path.substring(current);
		try {
			int parseInt = Integer.parseInt(token);
			ret = ((JsonArray) ret).get(parseInt);
		} catch (NumberFormatException e) {
			ret = ((JsonObject) ret).get(token);
		}
		return ret;
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	static Object[] convertPathStack(String path) {
		List<Object> tokens = new LinkedList<Object>();
		
		int current = 0;
		for (int p = 0; p < path.length(); p++) {
			char charAt = path.charAt(p);
			if (charAt == '.' || charAt == '/') {
				String token = path.substring(current, p);
				current = p + 1;
				try {
					int parseInt = Integer.parseInt(token);
					tokens.add(parseInt);
				} catch (NumberFormatException e) {
					tokens.add(token);
				}
			}
		}
		// the last one
		String token = path.substring(current);
		try {
			int parseInt = Integer.parseInt(token);
			tokens.add(parseInt);
		} catch (NumberFormatException e) {
			tokens.add(token);
		}
		return tokens.toArray(new Object[tokens.size()]);
//		
//		String[] split = path.split("[\\./]");
//		Object[] result = new Object[split.length];
//		int i = 0; 
//		for (String segment: split) {
//			try {
//				int parseInt = Integer.parseInt(segment);
//				result[i++] = parseInt;
//			} catch (NumberFormatException e) {
//				result[i++] = segment;
//			}
//		}
//		return result;
	}

	public static JsonArray getArray(JsonElement res, String path) {
		return (JsonArray) getElement(res, path);
	}

	public static String getString(JsonElement res, String path) {
		JsonElement element = getElement(res, path);
		if (element != null)
			return element.getAsString();
		else
			return null;
//			throw new RuntimeException("path was not found in the JsonElement: " + path);
	}

	public static Boolean getBoolean(JsonElement res, String path) {
		JsonElement element = getElement(res, path);
		if (element != null)
			return element.getAsBoolean();
		else
			return false;
//			throw new RuntimeException("path was not found in the JsonElement: " + path);
	}
}
