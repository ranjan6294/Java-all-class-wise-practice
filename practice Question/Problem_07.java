import java.util.Scanner;

public class Problem_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no u want to print the value off series: ");
        int n= sc.nextInt();
        int s=0;
        int i=1;
        while (i<=n) {
            s=s+i;
            i++;
            
        }
        System.out.println("Result is: "+s);
        sc.close();
    }
}