import java.util.Scanner;
public class CS_Problem_03 {
    static int SumofNo(int x){
        if(x==0||x==1){
            return x;
        }
        else
            return x + SumofNo(x-1);
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the series of no : ");
        int no = sc.nextInt();
        System.out.println("your Result is: "+SumofNo(no));
        sc.close();
    }
}
