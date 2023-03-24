import java.util.Scanner;

public class Foo {

	public static void main(String[] args) {
		System.out.print("x =");
		Scanner input;
		input = new Scanner(System.in);
		int x = input.nextInt();
		
		
		int i = 0;
		while (i < 10) {
			if (i%2 == 1) {
			System.out.println("i");
			i = i + 1;
		}
		}
		

	}

}
