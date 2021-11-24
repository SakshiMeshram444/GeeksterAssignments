//program
import java.util.Scanner;
public class MiddleEleOfArray {
public static void main(String[] args) {
	int arr[] = new int[10];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the ten elements of array : ");
	for(int i=0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	int mid = (arr.length)/2;
	if(arr.length%2!=0)
	{
		System.out.println("Middle Element in the array : "+arr[mid]);
	}
	else
	{
		System.out.println("Middle Elements in the array : "+arr[mid-1]+" & "+arr[mid]);
	}
}
	
}

