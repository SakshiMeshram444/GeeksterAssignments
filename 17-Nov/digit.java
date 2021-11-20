import java.util.Scanner;
public class digit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n, digit;
	char ch;
	do {
		digit = 0;
		System.out.println("Enter the number : ");
		 n = sc.nextInt();
		do
		{
			digit++;
			n/=10;
		}while(n!=0);
		if(digit==1)
		{
           System.out.println("The number is a one digit number");	
		}
		else if(digit==2)
		{
			System.out.println("The number is a two digit number");
		}
		else if(digit==3)
		{
			System.out.println("The number is a three digit number");
		}
		else if(digit==4)
		{
			System.out.println("The number is a four digit number");
		}
		else if(digit==5)
		{
			System.out.println("The number is a five digit number");
		}
		else
		{
			System.out.println("The number has more than five digits !!!");
		}
		
		System.out.println("Do you want to continue(yes/no)");
		ch=sc.next().charAt(0);
	}while(ch=='y');

}
}
	
	

