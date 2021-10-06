/**
 * 
 */
package com.practice.examples;

/**
 * @author Ramesh_Mamidala
 *
 *
 */
public class FruitItemsComparable implements Comparable<FruitItemsComparable> {
	
	private String fruitName;
	private Double fruitPrice;
	
	public FruitItemsComparable(String fruitName, Double fruitPrice) {
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FruitItems [fruitName=" + fruitName + ", fruitPrice=" + fruitPrice + "]";
	}

	@Override
	public int compareTo(FruitItemsComparable fruitItems) {
		return fruitItems.getFruitPrice() > this.fruitPrice ? 1 : fruitItems.getFruitPrice() < this.fruitPrice ? -1 :0;
	}
}
