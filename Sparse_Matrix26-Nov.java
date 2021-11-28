import java.util.Scanner;
public class Sparse_Matrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] matrix=new int[3][3];
		int row=matrix.length;
		int cols=matrix[0].length;
        int count=0;//to count nos of zeros present in matrix	
		
		System.out.println("Enter elements in matrix: ");
		//taking user input for matrix
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < cols; j++) {
			matrix[i][j]=sc.nextInt();		
			}
	}
	
	
	//size of 2d matrix
	int size=row*cols;
	
	//counting all zeros element present in  matrix
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < cols; j++) {
			if(matrix[i][j]==0) {
				count++;}
			}
		}
	
	if(count>(size/2)) {//conditon to check sparse
		System.out.println("Given matrix is sparse matrix");
	}else {
		System.out.println("Given matrix is not sparse matrix");
	}

	}
	}

