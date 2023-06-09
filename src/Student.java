package Student;

import java.io.Serializable;
import java.util.Scanner;

import exception.EmailFormatException;

public abstract class Student implements StudentInput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5383155090738508212L;

	protected StudentKind kind = StudentKind.University;
	
	protected String name;
	protected int id;
	protected String email;
	protected String phone;
	protected String exercise;
	
	public Student() {
		
	}
	public Student(StudentKind kind) {
		this.kind = kind;
		
	}
public Student(String name, int id) {
		
		this.name=name;
		this.id=id;
		
}
	
	public Student(String name, int id,String email, String phone, String exercise) {
		this.name=name;
		this.id=id;
		this.email=email;
		this.phone=phone;
		this.exercise=exercise;
		
	}
	
public Student(StudentKind kind, String name, int id,String email, String phone, String exercise) {
		this.kind = kind;
		this.name=name;
		this.id=id;
		this.email=email;
		this.phone=phone;
		this.exercise=exercise;
}
	public StudentKind getKind() {
		return kind;
	}
	public void setKind(StudentKind kind) {
		this.kind = kind;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws EmailFormatException{
		if(!email.contains("@") && !email.equals("")) {
			
			throw new EmailFormatException();
		}
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getExercise() {
		return exercise;
	}
	public void setExercise(String exercise) {
		this.exercise = exercise;
	}
	public abstract void printInfo(); 
	
	public void setStudentID(Scanner input) {
		System.out.print("Student Id:");
		int id = input.nextInt();
		this.setId(id);
	}
	public void setStudentName(Scanner input) {
		System.out.print("student Name:");
		String name = input.next();
		this.setName(name);
	}
	public void setStudentEmail(Scanner input) {
		String email = "";
		while (!email.contains("@")){
		
			System.out.print("Email address:");
			email = input.next();
			try {
				this.setEmail(email);
	}catch(EmailFormatException e) {
		System.out.println("Incorrect Email Format. put the e-mail address that contains!");
	}
		}
	}
	public void setStudentPhone(Scanner input) {
		System.out.print("Phone number:");
		String phone = input.next();
		this.setPhone(phone);
	}
	public String getKindStirng() {
		String skind = "none";
		switch(this.kind) {
		case University:
			skind = "Univ.";
			break;
		case HighSchool:
			skind = "High.";
			break;
		case MiddleSchool:
			skind = "Middle.";
			break;
		case ElementarySchool:
			skind = "Elementary.";
			break;
		default:
			
		}
		return skind;
		
	}

}