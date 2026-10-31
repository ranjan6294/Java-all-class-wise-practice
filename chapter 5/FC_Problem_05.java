import java.util.Scanner;
public class FC_Problem_05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no: ");
        int s=1, i, no = sc.nextInt();
        for(i=1;i<=no;i++)
        {
            s=s*i;

        }
        System.out.println("Factorial of the no is: "+s);
        sc.close();
    }
    
}
