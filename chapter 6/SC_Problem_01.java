import java.util.Scanner;
public class SC_Problem_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Array element: ");
        int size = scn.nextInt();
        System.out.println("Your Array: ");
        int [] mark = new int[size];
        for(int i=0;i<size;i++){
            mark[i]=scn.nextInt();
        }
        System.out.println("Display the array: ");
        for(int i=0;i<size;i++){
            System.out.print(mark[i]+" ");
        }
        scn.close();
    }
}
