import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int big;
        if(a>b){
            if(a>c)
                big =a;
            else
                big=c;
        }
        else if(b>c)
                big =b;
            else
                big=c;
        
        System.out.println("highest no is: "+big);
        sc.close();
        
    }
}
