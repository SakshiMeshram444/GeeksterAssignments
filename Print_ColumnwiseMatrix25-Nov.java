import java.util.Scanner;
public class Print_ColumnwiseMatrix {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[][] mat = new int[3][3];
			int row=mat.length;
	int cols=mat[0].length;
	//taking user input for matrix 
	System.out.print("enter elements of matrix 1: ");
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < cols; j++) {
			mat[i][j]=sc.nextInt();
		}
	}
	
	//displaying  matrix columns wise
	System.out.println("displaying  matrix elements columns wise" );
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < cols; j++) {
			System.out.print( mat[i][j]+" ");
		}
	}
}
}

	



