import java.util.Scanner;
public class Count_Digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		count(num);
	}
	static void count(int num) {
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
			} 
			System.out.println("Number of count digits " + count);
		}
	


}

