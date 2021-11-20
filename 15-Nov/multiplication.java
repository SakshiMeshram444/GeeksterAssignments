import java.util.Scanner;
public class multiplication {
	public static int prod(int n1, int n2) {
		int res = n1*n2;
		return res;
	}
 public static float prod(float n1, float n2) {
	 float res = n1*n2;
	 return res;
 }
 public static long prod(long n1, long n2) {
	 long res = n1*n2;
	 return res;
 }
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int i1,i2,resint;
		float f1,f2,resfloat;
		long l1,l2,reslong;
		System.out.println("Multiplication of numbers\n");
		//Integer
		System.out.println("Enter the integer numbers :");
		i1=sc.nextInt();
		i2=sc.nextInt();
		resint=prod(i1,i2);
		System.out.println("Answer ="+resint);
		//Float
		System.out.println("Enter the float numbers :");
		f1=sc.nextFloat();
		f2=sc.nextFloat();
		resfloat=prod(f1,f2);
		System.out.println("Answer ="+resfloat);
		//Long
		System.out.println("Enter the long numbers :");
		l1=sc.nextLong();
		l2=sc.nextLong();
		reslong=prod(l1,l2);
		System.out.println("Answer ="+reslong);
	}


 }

