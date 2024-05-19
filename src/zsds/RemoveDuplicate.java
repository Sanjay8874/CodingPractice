package zsds;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//welcome in java world 
public class RemoveDuplicate {
	
	public String removeDuplicate(String str) {
		
		Map<Character, Integer> strMap  = new ConcurrentHashMap<Character, Integer>();
		
		for(char chr: str.toCharArray()) {
			strMap.put(chr, strMap.getOrDefault(chr, 0) +1);
		}
		
		/*
		 * for(Map.Entry<Character, Integer> entry:strMap.entrySet()) {
		 * if(entry.getValue()>1) { strMap.remove(entry.getKey()); } }
		 */
		
		StringBuilder stringBuilder = new StringBuilder();
		for(Character ch: str.toCharArray()) {
			if(strMap.get(ch)>1) {
				stringBuilder.append(ch);
			}
		}
		return stringBuilder.toString();
	}

}
