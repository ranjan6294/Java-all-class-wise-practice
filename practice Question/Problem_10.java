import java.util.Scanner;

public class Problem_10 {
    static int revercrNum(int k, int m){
        if(k<=0){
            return m;
        }
        return revercrNum(k/10, m*10+(k%10));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=sc.nextInt();
        int Result=revercrNum(n, 0);
        System.out.println("Result is: "+Result);
        sc.close();
    }
}
