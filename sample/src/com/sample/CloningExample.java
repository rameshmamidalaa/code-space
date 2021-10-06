/**
 * 
 */
package com.sample;

/**
 * @author Ramesh_Mamidala
 *
 */
public class CloningExample implements Cloneable {
	
	private String cloneEx;
	
	public CloningExample(String cloneEx) {
		this.cloneEx = cloneEx;
	}
	
	public String getCloneEx() {
		return cloneEx;
	}

	public Object clone() throws CloneNotSupportedException {
		return (CloningExample)super.clone();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CloningExample cloneEx1 = new CloningExample("CloningEx1");
		try {
			CloningExample cloneEx2 = (CloningExample)cloneEx1.clone();
			System.out.println(cloneEx2.getCloneEx());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
