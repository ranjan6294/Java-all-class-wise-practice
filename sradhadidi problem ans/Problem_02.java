/*
Question_1
    print *****
          *   *
          *   *
          *****
 */
import java.util.Scanner;
public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter your number n = ");
        int n=sc.nextInt();
        System.out.println("Enter your number m= ");
        int m=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
               if(i == 1 || j == 1 || i == n || j == m){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
        sc.close();

    }
}
