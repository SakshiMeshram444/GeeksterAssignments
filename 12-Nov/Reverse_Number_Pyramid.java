import java.util.Scanner;
public class Reverse_Number_Pyramid {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();

        int star=5;
        int space=0;
        for(int i=1;i<=n;i++){

            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print(i+" ");
            }
            space=space+1;
            star=star-1;
            System.out.println();

        }

    }


}

