import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MenuManager studentManager = new MenuManager(input);
		int num=-1;
		
		
		
	
		while(num !=6) {
		System.out.println("1. Add Student");
		System.out.println("2. Delet Student");
		System.out.println("3. Edit Student");
		System.out.println("4. View Student ");
		System.out.println("5. Exit");
		num = input.nextInt();
		if(num==1) {
			studentManager.addStudent();
		}
		else if (num ==2) {
			studentManager.deleteStudent();
		}
		else if (num ==3) {
			studentManager.editStudent();
		}
		else if (num ==4) {
			studentManager.viewStudents();
	}
		else {
			continue;
		}
		}
		}
}
	