import java.util.Scanner;

public class Problem_02 {
    static float franhaiteeCalcious(float f){
        return (5.0f/9.0f)*(f-32);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the faranhatee: ");
        float f=Sc.nextFloat();
        System.out.println("result:"+ franhaiteeCalcious(f));

  
        Sc.close();
    }
    
}
