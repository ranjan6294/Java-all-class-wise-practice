import java.util.Scanner;

public class CS_Problem_04 {
    static void DrowPartan(int x){
        for(int i=x;i>=1;i--){
            for(int j=1;j<=i;j++){
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
