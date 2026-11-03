
class Callphone{
    public void ringPhone(){
        System.out.println("Ring your phone...");
    }
    public void viBrateing(){
        System.out.println("Vibrat your phone...");
    }
    public void callFriend(){
        System.out.println("Calling friend...");
    }
}
public class EC_Problem_02 {
    public static void main(String[] args) {
        Callphone plabanika = new Callphone();
        plabanika.ringPhone();
        plabanika.viBrateing();
        plabanika.callFriend();
        
    }
}
