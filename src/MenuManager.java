import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
		System.out.println("1. Add Students");
		System.out.println("2. Delete Students");
		System.out.println("3. Edit Students");
		System.out.println("4. View Students");
		System.out.println("5. Show a Menu");
		System.out.println("5. Exist");
		System.out.println("6. Select one number between 1 ~ 6:");
		num = input.nextInt();
		if (num == 1) {
			System.out.print("Student Id:");
			int StudentId = input.nextInt();
			System.out.print("student Name:");
			String studentName = input.next();
		}
		else if (num == 2) {
			System.out.print("Student Id:");
			int StudentId = input.nextInt();
			System.out.print("student Name:");
			String studentName = input.next();
		}
		else if (num == 3) {
			System.out.print("Student Id:");
			int StudentId = input.nextInt();
			System.out.print("student Name:");
			String studentName = input.next();
		}
		else if (num == 4){
			System.out.println("Show a Menu");
		}
		else if (num == 5){
			System.out.println("Exist");
		}
		else {
			System.out.println();
		}
		}
	}
 }
