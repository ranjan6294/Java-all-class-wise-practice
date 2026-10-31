import java.util.Scanner;
public class FC_Problem_06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no: ");
        int s=1, i=1, no = sc.nextInt();
        while (i<=no)  
        {
            s=s*i;
            i++;

        }
        System.out.println("Factorial of the no is: "+s);
        sc.close();
    }
    
}

