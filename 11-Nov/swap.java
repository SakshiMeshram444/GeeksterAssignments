import java.util.Scanner;
public class swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd Number : ");
        int b = sc.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swaping value of a : "+a);
        System.out.println("After Swaping value of b : "+b);
        System.out.println();
	}

}
