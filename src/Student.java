package Student;

import java.util.Scanner;

public class Student {
	protected StudentKind kind = StudentKind.University;
	
	protected String name;
	protected int id;
	protected String email;
	protected String phone;
	protected String exercise;
	
	public Student() {
		
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
	public void setEmail(String email) {
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
	public void printInfo() {
		System.out.println("name: "+ name +" "+ "id: "+id+" "+ "email: " +email +" "+ "phone:" +phone +" "+"exercise: "+ exercise);
	}
	public void getUserInput(Scanner input) {
		System.out.print("Student ID:");
		int id = input.nextInt();
		this.setId(id);
		System.out.print("Student name:");
		String name = input.next();
		this.setName(name);
		System.out.print("Emailaddress:");
		String email = input.next();
		this.setEmail(email);
		System.out.print("Phone Number:");
		String phone = input.next();
		this.setPhone(phone);
		System.out.print("Exercise:");
		String exercise = input.next();
		this.setExercise(exercise);
		
	}

}