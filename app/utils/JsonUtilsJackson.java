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
		return getElement(json, convertPathStack(path));
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
