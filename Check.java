import java.lang.*;
import java.util.*;
class Check{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=10,b=20,c=50;
    if(a>b && a>c){
        System.out.println("A is big");
    }
    if(a<b && a<c){
      System.out.println("A is small");   
    }
    if(b>a && b>c){
        System.out.println("b is big");
    }
    if(b<a && b<c){
      System.out.println("A is small");   
    }
    if(c>a && c>b){
        System.out.println("c is big");
    }
    if(c<a && c<b){
      System.out.println("c is small");   
    }
}
}
