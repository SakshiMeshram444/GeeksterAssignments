import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = "";
	System.out.println("Enter the word :");
	str = sc.nextLine();
	char[] arr = str.toCharArray();
	//s to store the reverse string
	String s = "";
	//to reverse the given string
	for(int i=(arr.length)-1; i>=0; i--) {
		s = s + arr[i];
	}
	System.out.println("Reverse string :"+s);
	
}

}
