import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager {
	ArrayList<Student> students = new ArrayList<Student>();
	
	Scanner input;
	
	MenuManager(Scanner input){
		this.input = input;
	}
	public void addStudent() {
		Student student = new Student();
		System.out.print("Student ID:");
		student.id = input.nextInt();
		System.out.print("Student name:");
		student.name = input.next();
		System.out.print("Emailaddress:");
		student.email = input.next();
		System.out.print("Phone Number:");
		student.phone = input.next();
		System.out.print("Exercise:");
		student.exercise = input.next();
		students.add(student);
	}
	public void deleteStudent() {
		System.out.print("student ID :");
		int studentId = input.nextInt();
		int index = -1;
		for (int i =0; i<students.size(); i++) {
			if( students.get(i).id == studentId) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			students.remove(index);
			System.out.println("the student" + studentId + "is deleted");
		}
		else {
			System.out.println("the student has been registered");
			return;
		}
	}
public void editStudent() {
	System.out.print("Student ID :");
	int studentId = input.nextInt();
	for(int i=0; i<students.size(); i++) {
		Student student = students.get(i);
	if(student.id == studentId) {
		int num=-1;
		
		while(num != 5) {
			System.out.println("1. Edit Id");
			System.out.println("1. Edit Name");
			System.out.println("1. Edit Email");
			System.out.println("1. Edit Phone");
			System.out.println("1. Exit");
			num = input.nextInt();
			if(num == 1) {
				System.out.print("Student Id:");
				student.id = input.nextInt();
			}
			else if (num == 2) {
				System.out.print("student Name:");
				student.name = input.next();
			}
			else if (num == 3) {
				System.out.print("Email address:");
				student.email = input.next();
			}
			else if (num == 4) {
				System.out.print("Phone number:");
				student.phone = input.next();
			}
			else {
				continue;
			}
		}
		break;
	}
	}
}
public void viewStudents() {
	for(int i=0; i<students.size(); i++) {
		students.get(i).printInfo();
	}
}
	
}