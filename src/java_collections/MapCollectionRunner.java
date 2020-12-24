package java_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollectionRunner {

	public static void main(String[] args) {

		Map<String,String> map=Map.of("D","Dinesh","S","Sam","J","Jill");
		System.out.println(" Map "+map);
		
		System.out.println(" Map valuf for D: "+map.get("D"));
		
		Map<String,String> hashMap=new HashMap<String,String>(map);

		hashMap.put("W", "Wills Smith");
		hashMap.put("A", "Anna");
		System.out.println(" Hash Map "+hashMap);
		
		Map<String,String> linkedHashMap=new LinkedHashMap<String,String>(hashMap);
		
		System.out.println(" Hash Map "+linkedHashMap);
		
		Map<String,String> treeMap=new TreeMap<String,String>(hashMap);
		
		System.out.println(" Hash Map "+treeMap);
	}

}
