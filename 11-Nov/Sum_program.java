import java.util.Scanner;
public class Sum_program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1,sum=0;
		System.out.println("Enter the numbers : ");
		int a = sc.nextInt();
		while(i<=a){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of number is : " + sum);
        System.out.println();
	}

}

