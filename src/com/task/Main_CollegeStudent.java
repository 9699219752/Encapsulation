package com.task;

public class Main_CollegeStudent {

	
	public static void main(String[] args) {
		
		
		College_student cc= new College_student();
		cc.setage(21);
		cc.setname("Samarth");
		cc.setprnNo("36837827K");
		cc.setrollNo(578);
		cc.setstudentId(171682);
		
		
		
		System.out.println("Student Id -->"+cc.getstudentId());
		System.out.println("Student Name -->"+(cc.getname()));
        System.out.println("Student Age -->"+cc.getage());
        System.out.println("Student Marks -->"+cc.getmarks());
        System.out.println("Student PRN Number -->"+cc.getprnNo());
		
	
	}
}
