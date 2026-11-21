import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        double x=Sc.nextDouble(),y;
        System.out.println("Enter the no of n: ");
        double n =Sc.nextFloat();
        if(n==1){
            y=1+x;
        }
        else if(n==2){
            y=1+x/n;
        }
        else if(n==3){
            y=1+Math.pow(x, n);
        }
        else{
            y=1+n*x;
        }
        System.out.println("result is: "+y);

        Sc.close();
    }
}
