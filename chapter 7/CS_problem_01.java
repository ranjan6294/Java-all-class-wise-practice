import java.util.Scanner;
public class CS_problem_01 {
    static void MultiplexTable (int x){
        for(int i=1;i<=10;i++){
           System.out.printf("%d X %d = %d\n",x,i,x*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Wnat no: ");
        int no =sc.nextInt();
        int no2 =sc.nextInt();
        MultiplexTable(no);
        System.out.println();
        MultiplexTable(no2);

       sc.close();
    }
    
    
}
