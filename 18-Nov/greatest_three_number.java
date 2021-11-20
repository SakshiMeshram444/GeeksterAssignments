import java.util.Scanner;
public class greatest_three_number {
static int GreatestThreeNumber(int a, int b, int c) {
	int z = (a>b) ? ((b>c) ? a : c) : ((b > a) ? ((b > c) ? b : c) : c);
	return z;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the three numbers : ");
	int a = sc.nextInt(); 
	int b = sc.nextInt(); 
	int c = sc.nextInt(); 
	int x = GreatestThreeNumber(a, b, c); 
     System.out.println("Greatest of three number = " + x);
}

}
