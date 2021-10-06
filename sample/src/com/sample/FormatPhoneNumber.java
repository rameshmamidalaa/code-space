/**
 * 
 */
package com.sample;

/**
 * @author Ramesh_Mamidala
 *
 */
public class FormatPhoneNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String phoneNoStr = "00-44  48 5555 8361"; // 022-198-53-24
		System.out.println(reformatPhoneNumber(phoneNoStr));
		phoneNoStr = "0 - 22 1985--324";
		System.out.println(reformatPhoneNumber(phoneNoStr));
		phoneNoStr = "555372654";
		System.out.println(reformatPhoneNumber(phoneNoStr));

	}

	private static String reformatPhoneNumber(String phoneNoStr) {
		String reformatPhoneNoStr = null;
		try {
			reformatPhoneNoStr = phoneNoStr.replaceAll("[^0-9]", "");
			int lengthCheck = reformatPhoneNoStr.length();
			System.out.println("After replacing with the space:::::" + reformatPhoneNoStr);
			reformatPhoneNoStr = reformatPhoneNoStr.replaceAll("(?<=\\G\\d{3})(?!$)", "-");
			System.out.println("After replacing with the hypen:::::::" + reformatPhoneNoStr);
			if (lengthCheck % 3 != 0) {
				reformatPhoneNoStr = reformatPhoneNoStr.replaceAll("\\b(\\d{2})(\\d+)-(\\d)$", "$1-$2$3");
				System.out.println("Final Result after separating as per the requirement:::::::" + reformatPhoneNoStr);
			}
		} catch (Exception exp) {
			exp.printStackTrace();
		}
		return reformatPhoneNoStr;
	}

}
