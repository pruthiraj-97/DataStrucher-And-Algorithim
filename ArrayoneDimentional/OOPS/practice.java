import java.util.*;
class student{
    Scanner sc=new Scanner(System.in);
    int hour;
    int min;
    void setters(){
       int hr=sc.nextInt();
       int mi=sc.nextInt();
       hour=hr;
       min=mi;
    }

    void getters(){
        System.out.println("hour id "+hour+"minute "+min);
    }
}
public class practice {
    public static student setData(student st1,student st2){
          student s=new student();
          s.hour=Math.abs(st1.hour-st2.hour);
          s.min=Math.abs(st1.min-st2.min);
          return s;
    }
    public static void main(String[] args) {
        student st1=new student();
        st1.setters();
        student st2=new student();
        st2.setters();
        student st3=new student();
        st3=setData(st1,st2);
        st3.getters();
         
    }
}
