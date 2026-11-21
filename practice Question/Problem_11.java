import java.util.Scanner;

public class Problem_11 {
    static int fibonici(int k){
        if(k<=1){
            return k;
        }
        return fibonici(k-1)+fibonici(k-2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no: ");
        int no = sc.nextInt();
        System.out.println("Result: "+fibonici(no));
         System.out.print("Series: ");
        for (int i = 0; i < no; i++) {
            System.out.print(fibonici(i) + " ");
        }
        sc.close();
    }
}
