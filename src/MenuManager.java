import java.util.ArrayList;
import java.util.Scanner;

import Student.Student;

public class MenuManager {
	ArrayList<Student> students = new ArrayList<Student>();
	
	Scanner input;
	
	MenuManager(Scanner input){
		this.input = input;
	}
	public void addStudent() {
		int kind = 0;
		Student student;
		while(kind != 1 && kind != 2) {
			System.out.print("1 for University:");
			System.out.print("2 for High School:");
			System.out.print("Select num for Student Kind between 1 ~ 2:");
			kind = input.nextInt();
			if (kind == 1) {
				student = new Student();
				student.getUserInput(input);
				students.add(student);
				break;
			}
			else if (kind ==2) {
				student = new HighSchoolStudent();
				student.getUserInput(input);
				students.add(student);
				break;
			}
			else {
				System.out.print("Select num for Student Kind:");
			}
		}
		
	}
	public void deleteStudent() {
		System.out.print("student ID :");
		int studentId = input.nextInt();
		int index = -1;
		for (int i =0; i<students.size(); i++) {
			if( students.get(i).getId() == studentId) {
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
	if(student.getId() == studentId) {
		int num=-1;
		
		while(num != 5) {
			System.out.println("1. Edit Id");
			System.out.println("2. Edit Name");
			System.out.println("3. Edit Email");
			System.out.println("4. Edit Phone");
			System.out.println("5. Exit");
			num = input.nextInt();
			if(num == 1) {
				System.out.print("Student Id:");
				int id = input.nextInt();
				student.setId(id);
			}
			else if (num == 2) {
				System.out.print("student Name:");
				String name = input.next();
				student.setName(name);
			}
			else if (num == 3) {
				System.out.print("Email address:");
				String email = input.next();
				student.setEmail(email);
			}
			else if (num == 4) {
				System.out.print("Phone number:");
				String phone = input.next();
				student.setPhone(phone);
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