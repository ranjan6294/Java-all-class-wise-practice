import java.util.Scanner;
public class FC_Problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N th no: ");
        int i, no = sc.nextInt();
       for(i=10;i>=1;i--)
       {
        System.out.printf("%d X %d = %d\n",no, i, no*i);
       }
        sc.close();
        
    }
}
