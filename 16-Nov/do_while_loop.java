import java.util.Scanner;
public class do_while_loop {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	long fact;
	char ch;
	do {
		fact=1;
	System.out.println("Enter the number:");
	n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println(n+"!="+fact);
	System.out.println("Do you want to continue(y/n)");
	ch=sc.next().charAt(0);
}
	while(ch=='y');

}
}
	

	