import java.util.Map;

import org.nutz.json.Json;


public class JsonTest {
	
	public static void main(String[] args) {
		String resp = "{\"xmlns:soap\":\"http://www.w3.org/2003/05/soap-envelope\",\"tagName\":\"soap:Envelope\",\"childNodes\":[{\"tagName\":\"soap:Header\"},{\"tagName\":\"soap:Body\",\"childNodes\":[{\"tagName\":\"ws:listProducts\",\"childNodes\":[{\"tagName\":\"ws:delay\",\"childNodes\":[1]}]}]}],\"xmlns:ws\":\"http://warehouse.acme.com/ws\"}";
//		 // 解码JSON
//        JSONObject jo = null;
//        try 
//        {
//        	Json.fromJsonAsMap(Map.class, resp);
//            jo = new JSONObject(resp);
//        } 
//        catch (JSONException e) 
//        {
//        } 
//
//        // 检测ret值
//        int rc = jo.optInt("ret", 0);
//        System.out.println(rc);
		
		Map<String, Object> map = Json.fromJsonAsMap(Object.class, resp);
		System.out.println(map.get("childNodes"));
	}

}
