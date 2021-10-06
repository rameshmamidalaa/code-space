/**
 * 
 */
package com.practice.examples;

import java.util.Comparator;

/**
 * @author Ramesh_Mamidala
 *
 *
 */
public class FruitItemsComparator {
	
	private String fruitName;
	private Double fruitPrice;
	
	public FruitItemsComparator(String fruitName, Double fruitPrice) {
		this.fruitName = fruitName;
		this.fruitPrice = fruitPrice;
	}

	/**
	 * @return the fruitName
	 */
	public String getFruitName() {
		return fruitName;
	}

	/**
	 * @param fruitName the fruitName to set
	 */
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	/**
	 * @return the fruitPrice
	 */
	public Double getFruitPrice() {
		return fruitPrice;
	}

	/**
	 * @param fruitPrice the fruitPrice to set
	 */
	public void setFruitPrice(Double fruitPrice) {
		this.fruitPrice = fruitPrice;
	}
	
	public static Comparator<FruitItemsComparator> fruitNameComparator = new Comparator<FruitItemsComparator>() {
		public int compare(FruitItemsComparator fFruitItCom, FruitItemsComparator sFruitItCom) {
			String fFruitName = fFruitItCom.getFruitName().toUpperCase();
			String sFruitName = sFruitItCom.getFruitName().toUpperCase();
			return fFruitName.compareTo(sFruitName);
		}
	};
	
	public static Comparator<FruitItemsComparator> fruitPriceComparator = new Comparator<FruitItemsComparator>() {
		public int compare(FruitItemsComparator fFruitItCom, FruitItemsComparator sFruitItCom) {
			Double fFruitPrice = fFruitItCom.getFruitPrice();
			Double sFruitPrice = sFruitItCom.getFruitPrice();
			return fFruitPrice > sFruitPrice ? 1 : fFruitPrice < sFruitPrice ? -1 : 0;
			
		}
	};

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FruitItems [fruitName=" + fruitName + ", fruitPrice=" + fruitPrice + "]";
	}


}
