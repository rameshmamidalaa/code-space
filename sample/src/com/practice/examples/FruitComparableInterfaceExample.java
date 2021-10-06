/**
 * 
 */
package com.practice.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ramesh_Mamidala
 *
 */
public class FruitComparableInterfaceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<FruitItemsComparable> fruitItemsList = new ArrayList<FruitItemsComparable>();
		fruitItemsList.add(new FruitItemsComparable("Oranges", 14.0));
		fruitItemsList.add(new FruitItemsComparable("Apples", 13.0));
		fruitItemsList.add(new FruitItemsComparable("Lemon", 11.0));
		fruitItemsList.add(new FruitItemsComparable("Cherry", 16.0));
		fruitItemsList.add(new FruitItemsComparable("Pear", 13.0));
		fruitItemsList.add(new FruitItemsComparable("Peach", 15.0));
		fruitItemsList.add(new FruitItemsComparable("Banana", 13.0));
		fruitItemsList.add(new FruitItemsComparable("Strawberry", 12.0));
		fruitItemsList.add(new FruitItemsComparable("Melon", 9.0));
		Collections.sort(fruitItemsList);
		/*for(FruitItemsComparable fruitItem: fruitItemsList ) {
			System.out.println(fruitItem);
		}*/
		fruitItemsList.forEach((fruitItem) -> System.out.println(fruitItem));
		System.out.println("-----------------------------------\n");
		//System.out.println("Fruits with the 3rd Highest cost:::" +fruitItemsList.get(fruitItemsList.size()-3));
		//find the MAX element.
		//System.out.println(Collections.max(fruitItemsList));
		int index = 2; // As per the requirement checking 3rd highest cost, but in list of inxex it is 2.  
		List<FruitItemsComparable> finalList = new ArrayList<FruitItemsComparable>();
		finalList.add(fruitItemsList.get(index));
		for(int i = index; i < fruitItemsList.size(); i++) {
			if(fruitItemsList.get(i).getFruitPrice().equals(fruitItemsList.get(i+1).getFruitPrice())) {
				finalList.add(fruitItemsList.get(i+1));
			} else {
				break;
			}
		}
		System.out.println(finalList.toString());
	}

}
