/**
 * 
 */
package com.sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Ramesh_Mamidala
 *
 */
public class ReadingValidIntegersFromFile implements Iterable<Integer> {

	private List<Integer> intList;

	public ReadingValidIntegersFromFile(final Reader inp) {
		final BufferedReader bufferedReader = new BufferedReader(inp);
		String inputLine;
		intList = new ArrayList<Integer>();
		try {
			while ((inputLine = bufferedReader.readLine()) != null) {
				Integer intValue = null;
				try {
					intValue = Integer.parseInt(inputLine.trim());
					if (intValue < -1000000000 || intValue > 1000000000) {
						continue;
					}
				} catch (NumberFormatException nfe) {
					continue;
				}

				intList.add(intValue);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Integer> iterator() {
		return intList.iterator();
	}

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("D:\\Softwares\\data\\integer.txt");
        for (Integer integer : new ReadingValidIntegersFromFile(fr)) {
               System.out.println(integer);
        }
	}

}
