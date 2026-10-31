import java.util.Scanner;
public class CS_problem_02 {
    static void DrowPartan(int x){
        for(int i=0;i<=x;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no: ");
        int no = sc.nextInt();
        DrowPartan(no);

        sc.close();
    }
}