package com.task;

public class MainClass {

	public static void main(String[] args) {
		
		
		
		Employee e = new Employee();
		e.setemp_ID(123);
		e.setgender("Male");
		e.setcompany_name("xyz");
		e.setemp_Age(23);
		e.setemp_adharNo(1313123213l);
		e.setemail("ram@gmail.com");
		e.setdesignation("HR");
		e.setemp_City("Pune");
		e.setemp_Dept("HR");
		e.setemp_location("Pune");
		e.setemp_Name("Ram");
		e.setemp_salary(45000.00);
		e.setexperience(5);
		e.setemp_type("Full Time");
		e.setemp_MobNo(762674326);
		e.setjoining_Date("null");
		
		System.out.println("Employee Id    -->"  +e.getemp_ID());
		System.out.println("Employee Name    -->"  +e.getemp_Name());
		System.out.println("Company Name     -->"  +e.getcompany_name());
		System.out.println("Employee Experience    -->"  +e.getexperience());
	    System.out.println("Employee Gender   -->"  +e.getgender());
	    System.out.println("Employee Age   -->"  +e.getemp_Age());
	    System.out.println("Adhar No   -->"  +e.getemp_adharNo());
	    System.out.println("Company Location   -->"  +e.getemp_location());
	    System.out.println("Employee City   -->"  +e.getemp_City());
	    System.out.println("Employee Designation   -->"  +e.getdesignation());
	    System.out.println("Employee Department   -->"  +e.getemp_Dept());
	    System.out.println("Employee MobNo    -->"   +e.getemp_MobNo());
	    System.out.println("Employee Salary    -->"   +e.getemp_salary());
	    System.out.println("Employee Type    -->"   +e.getemp_type());
	    System.out.println("Joining Date    -->"   +e.getjoining_Date());
		
		
	}
}
