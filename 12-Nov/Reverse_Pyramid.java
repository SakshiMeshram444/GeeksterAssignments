import java.util.Scanner;
public class Reverse_Pyramid {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int star =n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("* ");
			}
			System.out.println();
			star--;
	}

}
}



