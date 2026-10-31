import java.util.Scanner;

public class Sc_Problem_02 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your arry size: ");
        int size = Sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = Sc.nextInt();
            sum=sum+arr[i];

        }
        System.out.println("Your entered Arry elementis: ");
         for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+"\t");

        }
        System.out.println("\ntotal sum of array is: " + sum);
         Sc.close();
    }
   
}
