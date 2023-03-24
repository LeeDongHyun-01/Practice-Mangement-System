import java.util.Scanner;

public class ExIf {

	public static void main(String[] args) {
		System.out.print("Input Number:");
		Scanner input;
		input = new Scanner(System.in);
		int num = input.nextInt();
		
		if (num > 0) {
			System.out.println("positive nember");
		}
		else if (num < 0){
			System.out.println("negative number");
		}
		else {
			System.out.println("zero");
		}
		System.out.println("End!");

	}

}
