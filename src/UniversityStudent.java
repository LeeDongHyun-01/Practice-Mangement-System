package Student;

import java.util.Scanner;

public class UniversityStudent extends Student{
	
	public UniversityStudent(StudentKind kind) {
		super(kind);
		}
	
	public void getUserInput(Scanner input) {
		setStudentID(input);
		setStudentName(input);
		setStudentEmail(input);
		setStudentPhone(input);
		System.out.print("Exercise:");
		String exercise = input.next();
		this.setExercise(exercise);
		
	}
	public void printInfo() {
		String skind = getKindStirng();
		System.out.println("kind:" + skind + "name: "+ name +" "+ "id: "+id+" "+ "email: " +email +" "+ "phone:" +phone +" "+"exercise: "+ exercise);
	}

}
