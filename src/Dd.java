import java.util.Scanner;

public class Dd {

	public static void main(String[] args) {
		char a;
		double number1;
		double number2;
		
		Scanner input = new Scanner(System.in);		
		System.out.print("연산자를 입력하시오:");
		a = input.next().charAt(0);
		
		System.out.print("첫번째 숫자를 입력하시오:");
		number1 = input.nextDouble();
		System.out.print("두번째 숫자를 입력하시오:");
		number2 = input.nextDouble();
		
		switch (a) {
		case '+' :
			System.out.println(number1 + '+' + number2 + '=' + number1+number2);
			break;
		case '-' :
			System.out.println(number1 + '-' + number2 + '=' + number1-number2);
			break;
		case '/' :
			System.out.println(number1 + '/' + number2 + '=' + number1/number2);
			break;
		case '*' :
			System.out.println(number1 + '*' + number2 + '=' + number1*number2);
			break;
		case '%' :
			System.out.println(number1 + '%' + number2 + '=' + number1%number2);
			break;
		default :
			System.out.println("범위를 벗어납니다.");
		}
		
	}
 }
