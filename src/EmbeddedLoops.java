
public class EmbeddedLoops {
	public static void main(String[] args) {
		
		for (int i = 1; i < 7; i++) {
			for(int j = i ; j > 3; --j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}