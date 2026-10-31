import java.util.Scanner;
public class FC_problem_01{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of A: ");
        int numberA = scn.nextInt();
        
        System.out.println("Enter the number of B: ");
        int numberB = scn.nextInt();
        
        System.out.println("Enter the number of C: ");
        int numberC = scn.nextInt();
        
        int sum = numberA + numberB + numberC;
        System.out.println("Total result: "+sum);
        scn.close();



    }
}
