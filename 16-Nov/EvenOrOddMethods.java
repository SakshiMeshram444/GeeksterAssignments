import java.util.Scanner;
public class EvenOrOddMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		EvenOdd(num);
	}
		  static void EvenOdd(int num) {
		if(num%2==0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
			
		}
	

}
}



