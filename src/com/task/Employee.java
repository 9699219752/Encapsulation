package com.task;

public class Employee {

	private int emp_ID;
	private String emp_Name;
	private String email;
	private int emp_MobNo;
	private int emp_Age;
	private String gender;
	private String emp_City;
	private long emp_adharNo;
	private String emp_Dept;
	private String designation;
	private double emp_salary;
	private int experience;
	private String joining_Date;
	private String company_name;
	private String emp_location;
	private String emp_type;

	public void setemp_ID(int id) {
		emp_ID = id;

	}

	public int getemp_ID() {
		return emp_ID;
	}

	public void setemp_Name(String name) {
		emp_Name = name;
	}

	public String getemp_Name() {
		return emp_Name;
	}

	public void setemail(String mail) {
		email = mail;

	}

	public String getemail() {
		return email;
	}

	public void setemp_MobNo(int MobNo) {
		emp_MobNo = MobNo;
	}

	public int getemp_MobNo() {
		return emp_MobNo;
	}

	public void setemp_Age(int age) {
		emp_Age = age;
	}

	public int getemp_Age() {
		return emp_Age;
	}

	public void setgender(String gen) {
		gender = gen;
	}

	public String getgender() {
		return gender;
	}

	public void setemp_City(String City) {
		emp_City = City;
	}

	public String getemp_City() {
		return emp_City;
	}

	public void setemp_adharNo(long AdharNo) {
		emp_adharNo = AdharNo;
	}

	public long getemp_adharNo() {
		return emp_adharNo;
	}

	public void setemp_Dept(String Department) {
		emp_Dept = Department;
	}

	public String getemp_Dept() {
		return emp_Dept;
	}

	public void setdesignation(String Desig) {
		designation = Desig;
	}

	public String getdesignation() {
		return designation;
	}

	public void setemp_salary(double salary) {
		emp_salary = salary;
	}

	public double getemp_salary() {
		return emp_salary;
	}

	public void setexperience(int exp) {
		experience = exp;
	}

	public int getexperience() {
		return experience;
	}

	public void setjoining_Date(String joinDate) {
		joining_Date = joinDate;

	}

	public String getjoining_Date() {
		return joining_Date;
	}

	public void setcompany_name(String C_Name) {
		company_name = C_Name;
	}

	public String getcompany_name() {
		return company_name;
	}

	public void setemp_location(String location) {
		emp_location = location;
	}

	public String getemp_location() {
		return emp_location;

	}

	public void setemp_type(String type) {
		emp_type = type;
	}

	public String getemp_type() {
		return emp_type;
	}

}
