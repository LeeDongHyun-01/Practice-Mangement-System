
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;


import log.EventLogger;

public class Menu {
	static EventLogger Logger = new EventLogger("log.txt");

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		MenuManager studentManager = getObject("studentmanager.ser");
		if(studentManager == null) {
			studentManager = new MenuManager(input);
		}
		
		selectMenu(input, studentManager);
		putObject(studentManager, "studentmanager.ser");
		}
	
	
	public static void selectMenu(Scanner input, MenuManager studentManager) {
		int num=-1;
		
		while(num !=5) {
			try {
				
			showMenu();
		
		num = input.nextInt();
		switch(num) {
		case 1:
			studentManager.addStudent();
			Logger.log("add a student");
			break;
		case 2:
			studentManager.deleteStudent();
			Logger.log("delete a student");
			break;
		case 3:
			studentManager.editStudent();
			Logger.log("edit a student");
			break;
		case 4:
			studentManager.viewStudents();
			Logger.log("view a list of student");
			break;
		default:
			continue;
		}
		}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 ~ 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
				
			}
		}
		
	}
	public static void showMenu() {
		System.out.println("1. Add Student");
		System.out.println("2. Delet Student");
		System.out.println("3. Edit Student");
		System.out.println("4. View Student ");
		System.out.println("5. Exit");
		
	}
	public static MenuManager getObject(String filename) {
		MenuManager studentManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			studentManager = (MenuManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return studentManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentManager;
	}
	public static void putObject(MenuManager studentManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(studentManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	