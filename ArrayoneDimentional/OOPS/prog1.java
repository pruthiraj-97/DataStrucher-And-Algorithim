import java.util.*;
class student{
    int age;
    String name;
    student(int age,String name){
        this.age=age;
        this.name=name;
    }
}
public class prog1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        student std[]=new student[3];
        std[0]=new student(20,"rahul");
        std[1]=new student(30,"jnfru");
        std[2]=new student(15,"rifji");
        for(int i=1;i<std.length;i++){
            int j=i;
            while(j>0&&std[j].age<std[j-1].age){
                student s;
                s=std[j];
                std[j]=std[j-1];
                std[j-1]=s;
                j--;
            }
        }
        System.out.println();
        for(int i=0;i<std.length;i++){
            student s=std[i];
            System.out.println(s.age+" "+s.name);
        }

    }
}
