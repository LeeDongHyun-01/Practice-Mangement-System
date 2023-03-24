
public class Break {

	public static void main(String[] args) {
		for (int i=2; i<10; i++){
			System.out.println();
			if(i==5)
				continue;
			for(int j = 1; j < 10; j++) {
			System.out.print(i +"*" + j + "=" + i*j);
			System.out.print(" ");
			}
			// System.out.println();
		}
	}

}
