/**
 * 
 */
package com.practice.examples;

import java.util.Comparator;

/**
 * @author Ramesh_Mamidala
 * Example: Sorting Custom object by writing the inner class Comparator interface
 */
public class StudentComparator {
	
	private String studentName;
	private int rollNo;
	private int studentAge;
	
	/**
	 * @param studentName
	 * @param rollNo
	 * @param studentAge
	 */
	public StudentComparator(String studentName, int rollNo, int studentAge) {
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.studentAge = studentAge;
		
	}
	
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}



	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}



	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	/**
	 * @return the studentAge
	 */
	public int getStudentAge() {
		return studentAge;
	}



	/**
	 * @param studentAge the studentAge to set
	 */
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	// Comparator for sorting the list by Student Name
	
	public static Comparator<StudentComparator> stuNameComparator = new Comparator<StudentComparator>() {
		public int compare(StudentComparator fStuCom, StudentComparator sStuCom) {
			
			String fStuComStr = fStuCom.getStudentName().toUpperCase();
			String sStuComStr = sStuCom.getStudentName().toUpperCase();
			
			//Asending order
			return fStuComStr.compareTo(sStuComStr);
			
			//Descending Order
			//return sStuComStr.compareTo(fStuComStr);
			
		}
	};

	//Comparator for sorting the list by roll no
	public static Comparator<StudentComparator> rollNoComparator = new Comparator<StudentComparator>() {
		public int compare(StudentComparator fStuRollCom, StudentComparator sStuRollCom) {
			int fSturollNo = fStuRollCom.getRollNo();
			int sSturollNo = sStuRollCom.getRollNo();
			//Asending order
			//return fSturollNo - sSturollNo;
			//or
			return fSturollNo > sSturollNo ? 1 : fSturollNo < sSturollNo ? -1 : 0;
			//Descending Order
			//return sSturollNo - fSturollNo;
			//or
			//return sSturollNo > fSturollNo ? 1 : sSturollNo > fSturollNo ? -1 : 0;
			
		}
	};

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNo=" + rollNo + ", studentAge=" + studentAge + "]";
	}

}
