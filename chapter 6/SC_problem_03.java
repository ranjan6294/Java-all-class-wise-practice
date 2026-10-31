import java.util.Scanner;

public class SC_problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size:");
        int size = sc.nextInt();
        int[] mark = new int[size];
       System.out.println("Enter the element: ");
        for (int i = 0; i < size; i++) {
            mark[i] = sc.nextInt();

        }
        System.out.println("Enter the finding roll no: ");
        int Rno = sc.nextInt();
        boolean ifArray = false;
        for (int i = 0; i < size; i++) {
            System.out.print(mark[i]+" ");
            if (Rno == mark[i]) {
                ifArray = true;
                break;
            }
        }
        if (ifArray == true) {
            System.out.println("\nYes this roll_no is present in array");
        } else {
            System.out.println("\nThis roll_no is not presnt in array");
        }

        sc.close();
    }
}
