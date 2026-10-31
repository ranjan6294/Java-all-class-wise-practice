public class SC_Problem_04 {
    public static void main(String[] args) {
        float [] mark = {23.0f,56.02f,98.02f,46.02f,65.02f};
        float avg=0;
        float sum=0;
        for(float elment: mark)
        {
            sum=sum+elment;
        }
        avg=sum/mark.length;
        System.out.println("Total avrage of mark : "+avg);
    }
}
