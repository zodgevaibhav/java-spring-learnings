package com.openvz.spring_learn.springlearn.services;

public class StudentServiceImpl {

	private int studentId;
	private String firstName;
	private String lastName;	
	private String email;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentID(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userid=" + studentId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email="
				+ email + "]";
	}
	
	public static StudentServiceImpl getSampleResponse()
	{
		StudentServiceImpl st = new StudentServiceImpl();
		st.setEmail("zodgevaibhav@gmail.com");
		st.setFirstName("Vaibhav");
		st.setLastName("Zodge");
		st.setStudentID(12);
		
		return st;
	}
}
