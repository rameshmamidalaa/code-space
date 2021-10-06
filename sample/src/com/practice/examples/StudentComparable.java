/**
 * 
 */
package com.practice.examples;

/**
 * @author Ramesh_Mamidala
 *Example: Sorting Custom object by implementing Comparable interface
 */
public class StudentComparable implements Comparable<StudentComparable> {
	
	private String studentName;
	private int rollNo;
	private int studentAge;
	
	/**
	 * @param studentName
	 * @param rollNo
	 * @param studentAge
	 */
	public StudentComparable(String studentName, int rollNo, int studentAge) {
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



	@Override
	public int compareTo(StudentComparable compareStu) {
		//int compareAge = compareStu.getStudentAge();
		//For Ascending Order:: based on the studentage
		//return this.studentAge - compareAge;
		//or 
		//return this.studentAge > compareStu.getStudentAge() ? 1 : this.studentAge < compareStu.getStudentAge() ? -1 : 0;
				
		// For Descending Order:: based on the studentage
		//return compareAge - this.studentAge; 
		//or
		return compareStu.getStudentAge() > this.studentAge ? 1 : compareStu.getStudentAge() < this.getStudentAge() ? -1 : 0;
		
		// Based on studentname sorting in the natural order
		//int name = this.studentName.compareTo(compareStu.getStudentName());
		//return name;
		
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNo=" + rollNo + ", studentAge=" + studentAge + "]";
	}

}
