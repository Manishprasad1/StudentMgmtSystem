package com.application.studentmgmt;

public abstract class Student_Details {
	
	//declare fields
	private int roll_no;
	private double phone;
	private String Std_first_name,Std_last_name, email, father_name,address;
	
	public Student_Details() {
		// TODO Auto-generated constructor stub
		roll_no=0;
		
		
	}
	
	//read std details
	abstract String find_std_by_roll_no();
	abstract String find_std_by_phone();
	
	//create new student
	abstract void create_std();
	
	//update student details
	abstract void update_student();
	
	//delete student
	abstract void delete_student();
	
	

}
