package com.task;

public class College_student {

	private int studentId;
	private String name;
	private int age;
	private int rollNo;
	private int marks;
	private String prnNO;

	public void setstudentId(int StudId) {

		studentId = StudId;

	}

	public int getstudentId() {

		return studentId;

	}
	
	
	public  void setname(String studName) {

		name = studName;

	}

	public String getname() {

		return name;

	}
	public void setage(int studAge) {

		age = studAge;

	}

	public int getage() {

		return age;

	}
	public void setrollNo(int studRollNo) {

		 rollNo = studRollNo;

	}
	public int getrollNo() {

		 return rollNo;

	}
	

	public int getmarks() {

		return marks;

	}
	public void setprnNo(String studprnNo) {

		prnNO= studprnNo;

	}

	public String getprnNo() {

		return prnNO;

	}

}
