import java.util.Scanner;
public class Assignment_14_Nov {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		char c;
		System.out.print("Enter the character :");
		c=sc.next().charAt(0);
		int ch=(int)c;
		System.out.println(ch);
	
    {
        char a;
		int b,s;
		System.out.print("Enter the character :");
		a=sc.next().charAt(0);
		b=(int)a;
		s=b+3;
		System.out.println((char)s);
    }
    
    {
        double e,d;
		System.out.print("Enter the temperature in degree Fahrenheit:");
		e=sc.nextDouble();
		d=((e-32)*5)/9;
		System.out.println(d);
    }
    {
        
        double i,m;
		System.out.println("Enter the length in inches:");
		i=sc.nextDouble();
	    m=i*0.0254;
		System.out.println(m+"m");
    }


    System.out.print(" program to print the product of the decimal and int numbers");
    double n1,pro;
		int n2;
		System.out.println("Enter the decimal number :");
		n1=sc.nextDouble();
		System.out.println("Enter the integer number :");
		n2=sc.nextInt();
		pro=n1*n2;
		//double p=Math.round(pro);
		System.out.println(n1+"*"+n2+"="+pro);
    
    }
}

