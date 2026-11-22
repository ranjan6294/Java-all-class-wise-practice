import java.util.Scanner;

public class Problem_12 {
    static boolean primeNum(int k ,int i){
        if (k <= 1) {
            return false; 
        }
        if (i == k) {
            return true;  
        }
        if (k % i == 0) {
            return false; 
        }
        return primeNum(k, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no you Wnat: ");
        int no=sc.nextInt();
        if(primeNum(no,2)){
            System.out.println("no is prime");
        }
        else{
            System.out.println("no is not prime");
        }

        sc.close();
    }
}
