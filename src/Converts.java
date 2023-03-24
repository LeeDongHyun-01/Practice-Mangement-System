import java.util.Scanner;

public class Converts {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("초를 입력하시오:");
		int S = input.nextInt();
		
		double Seconds;
		Seconds = S/1;
		System.out.println(Seconds + "초");
		double Minutes;
		Minutes = S/60;
		System.out.println(Minutes + "분");
		double Hour;
		Hour = S/(60*60);
		System.out.println(Hour + "시간");
		double Day;
		Day = S/(60*60*24);
		System.out.println(Day + "일");
		
		

	}

}
