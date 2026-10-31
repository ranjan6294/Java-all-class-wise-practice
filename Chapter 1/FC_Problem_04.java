import java.util.Scanner;
public class FC_Problem_04{
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        System.out.println("Enter the kilomitar: ");
        double kiloMitar = Scn.nextDouble();
        double miles = (kiloMitar * 0.621371);
        System.out.println("Miles= "+miles);
        Scn.close();

        
    }

}