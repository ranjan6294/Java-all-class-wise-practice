import java.util.Scanner;

public class Problem_13 {
    static int armStronnum(int k ,int m){
        if(k==0){
            return m;
        }
        int digit=k%10;
        return armStronnum(k/10,m+(digit*digit*digit));
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int no =sc.nextInt();
        if(armStronnum(no,0)==no){
            System.out.println("no is armstrong");

        }
        else{
            System.out.println("no is not armstrong");

        }
        sc.close();
    }
}
