import java.util.Scanner;
public class grade {
	public static String Grade(int m) {
		String g = " ";
		if((m>=90)&&(m<=100))
		{
			g="A+";
		}
		else if((m>=80)&&(m<=89))
		{
			g="A";
		}
		else if((m>=70)&&(m<=79))
		{
			g="B";
		}
		else if((m>=60)&&(m<=69))
		{
			g="C";		
		}
		else if((m>=50)&&(m<=59))
		{
			g="D";		
		}
		else if(m<50)
		{
			g="FAIL :(";
		}
		else
		{
			g="Invalid";
		}
		return g;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int m;
		String grd;
		System.out.println("Enter the marks:");
		m=sc.nextInt();
		grd = Grade(m);
		System.out.println("Your grade : "+grd);
	}


	}


