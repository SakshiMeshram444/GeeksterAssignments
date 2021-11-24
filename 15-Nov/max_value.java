//MAX Value
import java.util.Scanner;
public class max_value {
	//two integer argument
	public static int max(int n1, int n2) {
		int m = Math.max(n1, n2);
		return m;
		}
	//three integer argument
public static int max(int n1, int n2, int n3) {
	int m = Math.max(Math.max(n1, n2),n3);
	return m;
}
//four integer argument
public static int max(int n1, int n2, int n3, int n4) {
	int m = Math.max(Math.max(Math.max(n1,n2),n3),n4);
	return m;
}
public static void main(String[] args) {
	int maximum;
	System.out.println("Maximum\n");
	maximum=max(400,200);
	System.out.println("Maximum = "+maximum);
}
}
