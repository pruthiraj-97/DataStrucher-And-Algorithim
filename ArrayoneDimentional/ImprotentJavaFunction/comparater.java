import java.util.*;
class student{
    String name;
    int mark;
    student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
}
public class comparater {
    public static void main(String[] args) {
        // Comparator<Integer> com=new Comparator<Integer>() { // aninimus class
        //     public int compare(Integer i,Integer j){ // sort on basic of bubble sort
        //         if(i<j) return 1;
        //         else return -1;
        //     }
        // };
        // List<Integer> arr=new ArrayList<>();
        // arr.add(56);
        // arr.add(78);
        // arr.add(4);
        // Collections.sort(arr,com);
        // System.out.println(arr);
        Comparator<student>com=new Comparator<student>() {
            public int compare(student s1,student s2){
                if(s1.mark<s2.mark) return 1;
                return -1;
            }
        };
        student s1=new student("Rahul", 30);
        student s2=new student("Raghav", 45);
        student s3=new student("pruthi", 95);
        student s4=new student("jony", 35);
        List<student> ls=new ArrayList<>();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);
       Collections.sort(ls,com);
       for(int i=0;i<ls.size();i++){
        System.out.print(ls.get(i).mark+" "+ls.get(i).name+" ");
       }
    }
}
