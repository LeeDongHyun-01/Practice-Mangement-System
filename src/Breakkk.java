
public class Breakkk {
	
	public static void main(String[] args) {
		for (int i = 0; i<100; i++) {
			System.out.println(); // if 구간에 공백을 만들기 위해서는 if구간 위에 System.out.println();을 사용하면 된다.
			if(i == 50)
				continue;
			System.out.print("Rule #" + i);
		}
	}

}
