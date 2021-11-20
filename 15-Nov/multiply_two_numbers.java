import java.util.Scanner;
public class multiply_two_numbers {
	public static int mul(int n1, int n2) {
		int res = n1*n2;
		return res;
	}
		public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
	int n1,n2,res;
	System.out.println("Enter the numbers :");
	n1=sc.nextInt();
	n2=sc.nextInt();
	res=mul(n1,n2);
	System.out.println(n1+"*"+n2+"="+res);

}
}

	


