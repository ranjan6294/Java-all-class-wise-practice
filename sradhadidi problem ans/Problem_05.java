public class Problem_05 {
    public static void main(String[] args) {
        int i,j,k,n=5;
        for(i=1; i<=n; i++)
        {
            for(j=i; j<=n-1; j++)
            {
                System.out.print(" ");
            }
            for(k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
