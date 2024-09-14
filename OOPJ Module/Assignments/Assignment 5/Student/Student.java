// 4) Build a class Student which contains details about the Student and compile and run its instance.

package com.student;

public class Student {

	private String name;
	private int id;
	private String address;
	private String course;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public void StudentDetails() {
		System.out.println("Student Details: " +name+" "+id+" " +address+" " +course);
	}
	
	public static void main(String[] args) {
		Student stud = new Student();
		stud.setName("Farah");
		
		stud.setId(24);
		stud.getId();
		
		stud.setAddress("Ujjain(M.P.)");
		stud.getAddress();
		
		stud.setCourse("Cdac");
		stud.getCourse();
		
		stud.StudentDetails();
	}
}
