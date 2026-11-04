/*
Question_1
    print *****
          *****
          *****
          *****
          *****
 */
import java.util.Scanner;
public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter your number");
        int n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}
