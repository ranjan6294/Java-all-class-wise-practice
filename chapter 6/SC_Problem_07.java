public class SC_Problem_07 {
    public static void main(String[] args) {
        int [] arr={1,2,3,5,6,4,7};
        int maxEle=arr[0];
        for(int element:arr)
        {
            if(element>=maxEle){
                maxEle=element;
            }
        }
        System.out.println("maximum element is: "+maxEle);
    }
}