import java.util.Scanner; 
class Fibonacci {
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
  
        // Recursive call
        return fib(n - 1)+ fib(n - 2);
            
    }
  
    // Driver Code
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of N :");
        int N = sc.nextInt();
        // Print the first N numbers
        for (int i = 1; i <= N; i++) {
  
            System.out.print(fib(i) + " ");
        }
    }
} 
  

