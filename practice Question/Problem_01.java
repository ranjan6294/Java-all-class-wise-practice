import java.util.Scanner;

public class Problem_01 {
    static boolean LeepearYear(int year){
        return (year% 400 == 0)||(year%100!=0&&year%4==0);
    }
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter the year that u want know given year is leepear or not: ");
        int year =Sc.nextInt();
        if(LeepearYear(year)){
            System.out.println(year+" this year is leepear");
        }else{
            System.out.println(year+"  is not leepear");
        }
        Sc.close();
    }
}
