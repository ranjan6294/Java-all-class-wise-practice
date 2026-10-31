
import java.util.Scanner;
public class FC_Problem_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter th sub1 mark: ");
        double Sub1 = scn.nextDouble();
        double gp1 = Sub1/10;
    
        System.out.println("Enter th sub2 mark: ");
        double Sub2 = scn.nextDouble();
        double gp2 = Sub2/10;
    
        System.out.println("Enter th sub3 mark: ");
        double Sub3 = scn.nextDouble();
        double gp3 = Sub3/10;
        double TotalCgpa= (gp1 + gp2 + gp3)/3;
        System.out.println("Total Cgpa is: "+TotalCgpa);
        scn.close();
    }
}
