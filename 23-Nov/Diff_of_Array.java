import java.util.Scanner;
public class Diff_of_Array {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.println("Enter the array size:");
		n=sc.nextInt();
		int arr1[] = new int[n];//for array 1
		int arr2[] = new int[n];//for array 2
		int sum[] = new int[n];//resultant array
		System.out.println("Enter elements of 1st array :");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of 2nd array :");
		for(int i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("Sum of two array elements :");
		for(int i=0;i<n;i++)
		{
			sum[i]=arr1[i]-arr2[i];
			System.out.println(sum[i]);
		}
	}
}

