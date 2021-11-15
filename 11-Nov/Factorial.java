import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int fact = 1;
	System.out.println("Enter the number : ");
	int n = sc.nextInt();
	int a = n;
    while(a>=1){
        fact = fact * a;
        a--;
    }
    System.out.println("Factorial of n Number is :- "+fact);
    
    	}
    }