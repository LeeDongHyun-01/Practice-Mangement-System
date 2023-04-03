import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
			
		
		
		while (num != 6) {
		System.out.println("1. Add PracticeNote");
		System.out.println("2. Delete PracticeNote");
		System.out.println("3. Edit PracticeNote");
		System.out.println("4. View PracticeNote");
		System.out.println("5. Show a Menu");
		System.out.println("6. Exist");
		System.out.println("Select one number between 1 ~ 6:");
		num = input.nextInt();
		if (num == 1) {
			addNote();
		
		}
		else if (num == 2) {
			deleteNote();
		}
		else if (num == 3) {
			editNote();
		}
		else if (num == 4){
			veiwNote();
		}
		
		else {
			continue;
			
		}
		}
		
		}
		public static void addNote() {
			Scanner input = new Scanner(System.in);
			System.out.print("Note Number:");
			int noteNumber = input.nextInt();
			System.out.print("Note Name:");
			String noteName = input.next();
			System.out.print("Note Color:");
			String notecolor = input.next();
			System.out.println(notecolor);
			System.out.print("Note Type:");
			String noteType = input.next();
			System.out.println(noteType);
	}
		public static void deleteNote() {
			Scanner input = new Scanner(System.in);
			System.out.print("Note Number:");
			int studentId = input.nextInt();
			
	}
		public static void editNote() {
			Scanner input = new Scanner(System.in);
			System.out.print("Note Number:");
			int studentId = input.nextInt();
			
	}
		public static void veiwNote() {
			Scanner input = new Scanner(System.in);
			System.out.print("Note Number:");
			int studentId = input.nextInt();
			
	}
}
