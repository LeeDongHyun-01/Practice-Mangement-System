import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Student.ElementarySchoolStudent;
import Student.StudentInput;
import Student.StudentKind;
import Student.UniversityStudent;

public class MenuManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7833492398666257821L;

	ArrayList<StudentInput> students = new ArrayList<StudentInput>();
	
	transient Scanner input;
	
	MenuManager(Scanner input){
		this.input = input;
	}
	public void addStudent() {
		int kind = 0;
		StudentInput studentInput;
		while(kind != 1 && kind != 2 && kind != 3) {
			try {
			System.out.println("1 for University:");
			System.out.println("2 for High School:");
			System.out.println("3 for elementary School:");
			System.out.print("Select num for Student Kind between 1 ~ 3:");
			kind = input.nextInt();
			if (kind == 1){
				
				studentInput = new UniversityStudent(StudentKind.University);
				studentInput.getUserInput(input);
				students.add(studentInput);
				break;
			}
			else if (kind ==2) {
				studentInput = new HighSchoolStudent(StudentKind.HighSchool);
				studentInput.getUserInput(input);
				students.add(studentInput);
				break;
			}
			else if (kind ==3) {
				studentInput = new ElementarySchoolStudent(StudentKind.ElementarySchool);
				studentInput.getUserInput(input);
				students.add(studentInput);
				break;
			}
			else {
				System.out.print("Select num for Student Kind 1 ~ 3:");
			}
		}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 ~ 3!");
				if(input.hasNext()) {
					input.next();
			}
				kind = -1;
			}
		}
		
	}
	public void deleteStudent() {
		System.out.print("student ID :");
		int studentId = input.nextInt();
		int index = findIndex(studentId);
		removefromStudents(index, studentId);
	}
	public int findIndex(int studentId) {
		int index = -1;
		for (int i =0; i<students.size(); i++) {
			if( students.get(i).getId() == studentId) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromStudents(int index, int studentId) {
		if (index >= 0) {
			students.remove(index);
			System.out.println("the student" + studentId + "is deleted");
			return 1;
		}
		else {
			System.out.println("the student has been registered");
			return -1;
		}
		
	}
	public void editStudent() {
		System.out.print("Student ID :");
		int studentId = input.nextInt();
		for(int i=0; i<students.size(); i++) {
			StudentInput student = students.get(i);
		if(student.getId() == studentId) {
			int num=-1;
			
			while(num != 5) {
				showEditMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					student.setStudentID(input);
					break;
				case 2:
					student.setStudentName(input);
					break;
				case 3:
					student.setStudentEmail(input);
					break;
				case 4:
					student.setStudentPhone(input);
					break;
				default:
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
	
	public void showEditMenu() {
		System.out.println("1. Edit Id");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Email");
		System.out.println("4. Edit Phone");
		System.out.println("5. Exit");
		
	}
		
}