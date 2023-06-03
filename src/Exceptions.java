import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		try {
			Scanner a = new Scanner(System.in);
			Scanner b = new Scanner(System.in);
			int x = a.nextInt();
			int y = b.nextInt();
			int z = x + y;	
			System.out.println(z);
		}
		catch(InputMismatchException e){
			System.out.println("Error : Input Mismatch!");
			e.printStackTrace();		
		}
		finally {
			System.out.println("The End!!");
		}
	}

}
