import java.util.Scanner;
public class CS_Problem_05 {
    static int FibonikiSer(int x){
        if(x==0)
        {
            return 0;
        }
        if(x==1)
        {
            return 1;
        }
        return FibonikiSer(x-1)+FibonikiSer(x-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth term of no: ");
        int n =sc.nextInt();
        int result = FibonikiSer(n);
        System.out.println("the nth term"+n+" result is: "+result);
        for(int i=1;i<=n;i++)
        {
            System.out.print(FibonikiSer(i)+" \n");
        }
        sc.close();
    }
}