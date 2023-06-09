package Student;

import java.util.Scanner;

import exception.EmailFormatException;

public interface StudentInput {
	public int getId();
	public void setId(int id);
	public void setEmail(String email) throws EmailFormatException;
	public void setName(String name);
	public void setPhone(String phone);
	public void setExercise(String exercise);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setStudentID(Scanner input);
	public void setStudentName(Scanner input);
	public void setStudentEmail(Scanner input);
	public void setStudentPhone(Scanner input);

}
