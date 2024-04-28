import java.util.*;
class Biswa{
    String name;
    int age;
    String guno;
    Biswa(String name,int age,String guno){
        this.age=age;
        this.guno=guno;
        this.name=name;
    }
    
     public void show(){
        System.out.println(name+" "+guno+" "+age);
    }
}
public class Basicprogram {
    public static void main(String[] args) {
        Biswa b=new Biswa("Tripath", 20,"harami");
        b.show();
    }
}
