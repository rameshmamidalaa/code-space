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
public class FruitComparatorInterfaceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<FruitItemsComparator> fruitItemsList = new ArrayList<FruitItemsComparator>();
		fruitItemsList.add(new FruitItemsComparator("Oranges", 14.0));
		fruitItemsList.add(new FruitItemsComparator("Apples", 13.0));
		fruitItemsList.add(new FruitItemsComparator("Lemon", 11.0));
		fruitItemsList.add(new FruitItemsComparator("Cherry", 16.0));
		fruitItemsList.add(new FruitItemsComparator("Pear", 13.0));
		fruitItemsList.add(new FruitItemsComparator("Peach", 15.0));
		fruitItemsList.add(new FruitItemsComparator("Banana", 14.0));
		fruitItemsList.add(new FruitItemsComparator("Strawberry", 12.0));
		fruitItemsList.add(new FruitItemsComparator("Melon", 9.0));
		// In Java7
		//Collections.sort(fruitItemsList, FruitItemsComparator.fruitNameComparator);
		
		// In Java8 :: Method Reference
		Collections.sort(fruitItemsList, FruitItemsComparator.fruitNameComparator::compare);
		
		// In Java8 :: Lambda Expression
		Collections.sort(fruitItemsList, (fFruitItCom, sFruitItCom) -> fFruitItCom.getFruitName().compareTo(sFruitItCom.getFruitName()));
		// In Java7
		/*for(FruitItemsComparator fruitName: fruitItemsList ) {
			System.out.println(fruitName);
		}*/
		fruitItemsList.forEach((fruitName) -> System.out.println(fruitName));
		System.out.println("-----------------------------------------------\n");
		Collections.sort(fruitItemsList, FruitItemsComparator.fruitPriceComparator);
		/*for(FruitItemsComparator fruitPrice: fruitItemsList) {
			System.out.println(fruitPrice);
			
		}*/
		fruitItemsList.forEach(fruitPrice -> System.out.println(fruitPrice));
	}

}
