import java.util.Scanner;

public class Problem_06 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your Salse: ");
        float comm,s=Sc.nextFloat();
        if(s<0){
            comm=0;
        }
        else if(s<=500){
            comm=s*0.05f;

        }
        else if(s>500&&s<=2000){
            comm =35+(s-500)*0.10f;
        }
        else if(s>2000&&s<=5000){
            comm=185+(s-2000)*0.12f;
        }
        else{
            comm=s*.125f;
        }
        System.out.println("total commision is: "+comm);
        Sc.close();
    }
}
