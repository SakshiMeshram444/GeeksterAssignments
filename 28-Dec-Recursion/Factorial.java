import java.util.Scanner;
public class Factorial {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number:");
       
       int num = sc.nextInt();
       
       int factorial = fact(num);
       System.out.println("Factorial of entered number is: "+factorial);
    }
    static int fact(int n)
    {
        
        if(n==1 || n==0){
          return 1;
        }
        else
        return fact(n-1)* n;
    
    }
 }
   

