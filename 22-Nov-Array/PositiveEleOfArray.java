import java.util.Scanner;
public class PositiveEleOfArray {
public static void main(String[] args) {
	int arr[] = new int[10];
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter ten elements of array : ");
	for(int i=0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	
	}
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>0)
		{
			System.out.println("Positive elements present in the array : "+ arr[i]);
		}
	}
	
}	
}

