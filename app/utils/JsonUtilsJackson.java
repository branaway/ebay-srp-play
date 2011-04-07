package utils;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;



public class JsonUtilsJackson {
	/**
	 * 
	 * @param json
	 * @param pathStack the path stack as an array of String or Integer or the mix. Example: {"name", 2, "address", 1}
	 * @return
	 */
	public static JsonNode getElement(JsonNode json, Object[] pathStack) {
		JsonNode ret = json;
		for (Object p : pathStack) {
			if (p instanceof String) {
				ret = ((ObjectNode) ret).get((String) p);
			} else if (p instanceof Integer) {
				ret = ((ArrayNode) ret).get((Integer) p);
			} else {
				throw new RuntimeException("The path elements can only be either String or Integer: " + p.getClass());
			}
		}
		return ret;
	}
	
	public static JsonNode getElement(JsonNode json, String path) {
//		return getElement(json, convertPathStack(path));
		return onePassGet(json, path);
	}

	public static JsonNode getElem(JsonNode json, Object... path) {
//		return getElement(json, convertPathStack(path));
		return getElement(json, path);
	}

	/**
	 * @param json
	 * @param path
	 * @return
	 */
	private static JsonNode onePassGet(JsonNode json, String path) {
		JsonNode ret = json;
		int current = 0;
		for (int p = 0; p < path.length(); p++) {
			char charAt = path.charAt(p);
			if (charAt == '.' || charAt == '/') {
				String token = path.substring(current, p);
				current = p + 1;
				try {
					int parseInt = Integer.parseInt(token);
					ret = ((ArrayNode) ret).get(parseInt);
				} catch (NumberFormatException e) {
					ret = ((ObjectNode) ret).get(token);
				}
			}
		}
		// the last one
		String token = path.substring(current);
		try {
			int parseInt = Integer.parseInt(token);
			ret = ((ArrayNode) ret).get(parseInt);
		} catch (NumberFormatException e) {
			ret = ((ObjectNode) ret).get(token);
		}
		return ret;
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	static Object[] convertPathStack(String path) {
		String[] split = path.split("[\\./]");
		Object[] result = new Object[split.length];
		int i = 0; 
		for (String segment: split) {
			try {
				int parseInt = Integer.parseInt(segment);
				result[i++] = parseInt;
			} catch (NumberFormatException e) {
				result[i++] = segment;
			}
		}
		return result;
	}
}
