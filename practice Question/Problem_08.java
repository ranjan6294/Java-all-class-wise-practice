import java.util.Scanner;

public class Problem_08 {
    static int factorialNum(int k){
        int s=1;
        int i=1;
        while (i<=k) {
            s=s*i;
            i++;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no u want o print her factorial: ");
        int n=sc.nextInt();
        System.out.println("result is: "+factorialNum(n));
        sc.close();
        
    }
}
