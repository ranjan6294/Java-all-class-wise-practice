class Squar{
    int lan;
    int wid;
    public int area(){
        return lan*wid;
    }
    public int praMiter(){
        return 2*(lan+wid);
    }

}
public class EC_Problem_04 {
    public static void main(String[] args) {
        Squar p = new Squar();
        p.lan=3;
        p.wid=5;
        System.out.println(p.area());
        System.out.println(p.praMiter());

        
    }    
}
