package com.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
		/*
		 * Map<String, Integer> hsTable = new Hashtable<>(); hsTable.put("a", 1);
		 * hsTable.put("b", 2); hsTable.put("c", 3);
		 * 
		 * Iterator<String> itr = hsTable.keySet().iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); hsTable.put("d", 4); }
		 */

		/*
		 * Map<String, Integer> hsTable = new HashMap<>(); hsTable.put("a", 1);
		 * hsTable.put("b", 2); hsTable.put("c", 3);
		 * 
		 * Iterator<String> itr = hsTable.keySet().iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); hsTable.put("d", 4); }
		 */

		//Map<String, Integer> hsTable = new ConcurrentHashMap<>();
		// Map<String, Integer> hsTable = new Hashtable<>();
		//Map<String, Integer> hsTable = new HashMap<>();
//		Map<String, Integer> hsTable = new TreeMap<>();
//		hsTable.put("a", 1);
//		System.out.println(hsTable.hashCode());
//		hsTable.put("b", 2);
//		System.out.println(hsTable.hashCode());
//		hsTable.put(null, 3); // Nullpointer Exception with TreeMap & Hashtable
//		System.out.println(hsTable.hashCode());
//
//		Iterator<String> itr = hsTable.keySet().iterator();
//		while (itr.hasNext()) {
//			System.out.println(hsTable.get(itr.next()));
//			//hsTable.put("a", 5); // Updating of the value so it won't throw concurrentmodification exception
//			hsTable.put("d", 6); // In this case it will throw concurrentmodification exception
//			//hsTable.remove("b"); // In this case it will throw concurrentmodification exception
//			//System.out.println(hsTable.get("a"));
//		}
		
		
		//Set<String> treeSet = new TreeSet<>();
		Set<String> treeSet = new HashSet<>();
		treeSet.add("a");
		System.out.println(treeSet.hashCode());
		treeSet.add("b");
		System.out.println(treeSet.hashCode());
		treeSet.add("c");
		System.out.println(treeSet.hashCode());

		Iterator<String> itr = treeSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			treeSet.add("d");
			
			//System.out.println(hsTable.get("a"));
		}
		
		List<Integer> list = new ArrayList<>();
		/*List<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.forEach(intr -> {
			System.out.println(intr);
			list.add(4);
			});
		for(Integer intr : list) {
			System.out.println(intr);
			//list.add(4);
		}*/
		/*Iterator<Integer> itrList = list.iterator();
		while(itrList.hasNext()) {
			System.out.println(itrList.next());
			list.add(4);
		}*/
		
		// Creating a ConcurrentHashMap 
        /*ConcurrentHashMap<String, Integer> map 
            = new ConcurrentHashMap<String, Integer>(); 
  
        map.put("ONE", 1); 
        map.put("TWO", 2); 
        map.put("THREE", 3); 
        map.put("FOUR", 4); 
  
        // Getting an Iterator from map 
        Iterator it = map.keySet().iterator(); 
  
        while (it.hasNext()) { 
            String key = (String)it.next(); 
            System.out.println(key + " : " + map.get(key)); 
  
            // This will reflect in iterator. 
            // Hence, it has not created separate copy 
            map.put("SEVEN", 7); 
		
	}*/

}
}
