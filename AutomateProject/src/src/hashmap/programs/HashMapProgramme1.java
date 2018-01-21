package src.hashmap.programs;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgramme1 {
	
	public static void main(String[] args) {
		
		String[] accArrary = "Automotive_101343048 (Cleveland, US)".split("\\(");
		
		System.out.println(accArrary[0].trim());
		
		
		HashMap<String, String> valueMap = new HashMap<String, String>();
		valueMap.put("SalesAccount", "SalesAccountValue ");
		try {
			EditOpty(valueMap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static String EditOpty(Map<String, String> valueMap) throws Exception{

		if (valueMap.containsKey("NavigateToEdit") ){
			System.out.println("Hello Navi");
		}	

		if (valueMap.containsKey("SalesAccount")) {
			System.out.println("Hello Sales ");
		}
		return null;
	}

}
