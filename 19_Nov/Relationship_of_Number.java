import java.util.Scanner;
public class Relationship_of_Number {
	static void relationwithnumber(int a, int b) {
        if (a > b)
            System.out.println(a + " is greater");
        else if (a < b)
            System.out.println(b + " is greater");
        else
            System.out.println("Both the number is equal");
    }

    public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        relationwithnumber(a, b);
       
    }
}

