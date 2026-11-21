import java.util.Scanner;

public class Problem_09 {
    static int sumofNum(int k){
        if(k==0){
            return 0;
        }
        return (k%10+sumofNum(k/10));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no: ");
        int n=sc.nextInt();
        System.out.println("Result is: "+sumofNum(n));
        sc.close();
    }
}
