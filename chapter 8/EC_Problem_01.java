class Employ {
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName (String n){
        name = n;
    }

    
}

public class EC_Problem_01 {
    public static void main(String[] args) {
        Employ ranjan = new Employ();
        ranjan.setName("Ranjan jana + plabanika das");
        ranjan.salary=230;
        System.out.println(ranjan.getSalary());
        System.out.println(ranjan.getName());
        
    }
}
