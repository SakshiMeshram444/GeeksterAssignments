package Assignment_27;
import java.util.Scanner;

public class finonacci {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int N, sum = 0;
        N = sc.nextInt();
        for(int i=1; i<=N; i++){
            if(i%2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    
}

