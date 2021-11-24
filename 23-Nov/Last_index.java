import java.util.Scanner;
public class Last_index {
	public static void lastindex(int arr[],int n)
	{
		int lindex=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
			lindex=i;
			}
		}
		System.out.println("Last Index of "+n+" = "+lindex);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int index;
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the elements of array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
    
	  System.out.println("Enter the element whose index is to be found :");
	  index=sc.nextInt();
	  lastindex(arr,index);
}
}
