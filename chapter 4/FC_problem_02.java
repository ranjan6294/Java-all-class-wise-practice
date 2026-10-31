import java.util.Scanner;
public class FC_problem_02 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your search number(1-7): ");
      int No = sc.nextInt();
      switch (No) {
        case 1 -> System.out.println("Sunday");
        case 2 -> System.out.println("Monday");
        case 3 -> System.out.println("Tuisday");
        case 4 -> System.out.println("Wednusday");
        case 5 -> System.out.println("Thousday");
        case 6 -> System.out.println("Friday");
        case 7 -> System.out.println("Suterday");
        default -> System.out.println("Your number is not exist");
    }  
    sc.close();
    }
}
