import java.util.ArrayList;

public class MatrixCalculator {

	public static void main(String[] args) {
		int[][] values = {{1, 0, 2},{-1, 3, 1}};
		int[][] values2 = {{3, 1}, {2, 1}, {1, 0}};
		int[][] values3 = new int [2][2];
		
		for(int i=0; i< 2; i ++) {
			for(int j=0; j<2; j ++) {
				for(int k = 0; k < 3; k++) {
					values3[i][j] += values[i][k] * values2[k][j];
				}
			}
			
		}
		for(int i = 0; i<2; i ++) {
			for(int j=0; j< 2; j++) {
				System.out.print(values3[i][j] + " ");
			}
			System.out.println();
		}

	}

}
