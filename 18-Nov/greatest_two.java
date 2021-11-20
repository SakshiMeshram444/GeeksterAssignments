import java.util.Scanner;
public class greatest_two {
	public static int greatestNumber(int a, int b) {
		int z = (a>b) ? a : b ;
		return z;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x = sc.nextInt();
		System.out.println("Enter the second number : ");
		int y = sc.nextInt();
		int c = greatestNumber(x, y);
        System.out.println("Greatest of two number = " + c);
        
	}
	}


