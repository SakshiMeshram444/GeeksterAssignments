import java.util.Scanner;
public class SumOfElements {
public static void main(String[] args) {
	int ele[] = new int[10];
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter ten elements : ");
	for(int i=0; i<ele.length; i++) {
		ele[i] = sc.nextInt();
	}
	
	for(int i=0; i<ele.length; i++) {
		sum = sum + ele[i];
	}
		System.out.println("Sum of all elements in array : "+sum);	
	}
}

