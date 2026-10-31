import java.util.Scanner;
public class FC_Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N th no: ");
        int i, no = sc.nextInt();
        int sum=0;
        for(i=0;i<no;i++){
            if(i%2==0){
                System.out.println("Even no is : "+i);
                sum=i+sum;
            }

        }
        System.out.println("Total sum of Even no is: "+sum);
        sc.close();
        
    }
}
