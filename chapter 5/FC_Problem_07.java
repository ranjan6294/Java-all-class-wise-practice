import java.util.Scanner;
public class FC_Problem_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N th no: ");
        int sum=0, i, no = sc.nextInt();
       for(i=0;i<=10;i++)
       {
        System.out.printf("%d X %d = %d\n",no, i, no*i);
        int result= no*i;
        sum = sum+result;
       }
       System.out.println(sum);
        sc.close();
        
    }
}
