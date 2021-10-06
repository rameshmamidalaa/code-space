/**
 * 
 */
package com.practice.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Ramesh_Mamidala
 *
 */
public class FindThreeBiggestNumbersExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Double> fruitsMap = new HashMap<String, Double>();
		fruitsMap.put("Oranges", 14.0);
		fruitsMap.put("Apples", 13.0);
		fruitsMap.put("Lemon", 11.0);
		fruitsMap.put("Cherry", 16.0);
		fruitsMap.put("Pear", 13.0);
		fruitsMap.put("Peach", 15.0);
		fruitsMap.put("Banana", 14.0);
		fruitsMap.put("Strawberry", 9.0);
		fruitsMap.put("Melon", 9.0);
		int index = 2;
		List<Map.Entry<String, Double>> fruitsList = new LinkedList<Map.Entry<String, Double>>(fruitsMap.entrySet());
		try {
			Collections.sort(fruitsList, new Comparator<Map.Entry<String, Double>>() {
				public int compare(Entry<String, Double> fEntrySet, Entry<String, Double> sEntryset) {
					return sEntryset.getValue().compareTo(fEntrySet.getValue());
				}
			});
			for (Map.Entry<String, Double> entryValue : fruitsList) {
				System.out.println("fruitPrice:::" + entryValue.getValue() + " fruitName::: " + entryValue.getKey());
			}
			System.out.println(fruitsList.subList(0, 3)); // top 3 greatest numbers.
			// Below code used to find the 3rd Highest costs.
			List<Entry<String, Double>> finalList = new ArrayList<Entry<String, Double>>();
			finalList.add(fruitsList.get(index));
			if(fruitsList.size() -1 > index) {
				for (int i = index; i < fruitsList.size(); i++) {
					if (fruitsList.get(i).getValue().equals(fruitsList.get(i + 1).getValue())) {
						finalList.add(fruitsList.get(i + 1));
					} else {
						break;
					}
				}
			}
			System.out.println(finalList.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
