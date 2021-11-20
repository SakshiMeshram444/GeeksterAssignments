import java.util.Scanner;
public class Operations {
	static int operations(int a, int b, char c) {
		int res = 0;
		{
        if (c == '+')
            res = a + b;
        else if (c == '-')
            res = a - b;
        else if (c == '*')
            res = a * b;
        else if (c == '/')
            return a / b;
        else if (c == '%')
            res =  a % b;
	}
        return (res);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int res;
        System.out.print("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter the operation which you want : Adding(i.e +),Sub(-),mul(*),div(/),modulus(%):");
        char c = sc.next().charAt(0);
        res = operations(a, b, c);
        System.out.printf(a+" "+c+" "+b+" = "+res);
        
    }

}

