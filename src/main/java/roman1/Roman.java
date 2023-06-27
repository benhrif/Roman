package roman1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Roman {
	
	public static String arabicToRomanNumber(int arabicNumber) {
		
		String romanNumber = "";
		Map<String, Integer> romanList = new LinkedHashMap<String, Integer>();
		
		romanList.put("M", 1000);
		romanList.put("CM", 900);
		romanList.put("D", 500);
		romanList.put("CD", 400);
		romanList.put("C", 100);
		romanList.put("XC", 90);
		romanList.put("L", 50);
		romanList.put("XL", 40);
		romanList.put("X", 10);
		romanList.put("IX", 9);
		romanList.put("V", 5);
		romanList.put("IV", 4);
		romanList.put("I", 1);
		
		
		for (Map.Entry m : romanList.entrySet()) {
			
			int n = (int) m.getValue();
			
			for (int i =0;i<arabicNumber/n;i++) {
				
				romanNumber+=m.getKey();
				
			}
			arabicNumber = arabicNumber%n;
	    }
		
		return romanNumber;
		
		
	}
	

}
