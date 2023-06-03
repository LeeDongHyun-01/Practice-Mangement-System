import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		try {
			int num =readNum();
		}catch(MyException a) {
			System.out.printf("Error, the number %d is odd!", a.getNum());
			
		}

	}
	public static int readNum() throws MyException{
		Scanner b = new Scanner(System.in);
		int num = b.nextInt();
		if (num %2 != 0) {
			throw new MyException(num);//
		}
		return num;
	}

}
