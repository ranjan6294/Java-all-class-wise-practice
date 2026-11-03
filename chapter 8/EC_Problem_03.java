class Squar{
    int side;
    public int area(){
        return side*side;
    }
    public int praMiter(){
        return 4*side;
    }

}
public class EC_Problem_03 {
    public static void main(String[] args) {
        Squar p = new Squar();
        p.side=3;
        System.out.println(p.area());
        System.out.println(p.praMiter());

        
    }    
}
