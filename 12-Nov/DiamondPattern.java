import java.util.Scanner;
public class DiamondPattern {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star=1;
        int space=n-1;
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("* ");
            }
            space=space-1;
            star=star+1;
            System.out.println();
        }
        space=0;
        star=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("* ");
            }
            space=space+1;
            star=star-1;
            System.out.println();
        }
    }


}

