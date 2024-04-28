import java.util.*;
class node{
    node link[]=new node[26];
    boolean flag=false;
    public node(){

    }
    boolean containsKey(char ch){
        return link[ch-'a']!=null;
    }
    void put(char ch,node temp){
        link[ch-'a']=temp;
    }
    node get(char ch){
        return link[ch-'a'];
    }
    void EndAt(){
       flag=true;
    }
}
public class insertandimplementationtrie {
       insertandimplementationtrie(){
           root=new node();
       }
    public static node root;
    public static void insert(String word){
        node temp=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(!temp.containsKey(ch)){
               temp.put(ch,new node());
            }
            temp=temp.get(ch);
        }
        temp.EndAt();
        
    }
    public static boolean search(String word){
        node temp=root;
        for(int i=0;i<word.length();i++){
            if(!temp.containsKey(word.charAt(i))){
                return false;
            }else{
                temp=temp.get(word.charAt(i));
            }
        }
        return true;
    }
    public static void main(String[] args) {
       insert("hello");
        //insert("happy");
        //System.out.println(search("happy"));
    }
}
