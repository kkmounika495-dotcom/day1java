import java.util.TreeMap;
import java.util.Scanner;
public class Booktreemap{
    public static void main(String[] args){
        TreeMap<Integer,String>book=new TreeMap<>();
        TreeMap<Integer,String>history=new TreeMap<>();
        int BookId;
        String BookName,stuid,stuname;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the option to perform:");
        System.out.println("1.Add a new book");
        System.out.println("2. display history");
        System.out.println("3.issue abook");
        System.out.println("4.return a book");
        System.out.println("5.display all book");
        System.out.println("6.exit the application");
        System.out.println("enter a choice:");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("enter a book:");
            BookId=sc.nextInt();
            sc.nextLine();
            System.out.println("enetr book name:");
            BookName=sc.nextLine();
            book.put(BookId,BookName);
         }
        else if(choice==2){
            
        }
        else if(choice==3){
            System.out.println("eneter book id:");
            

        }
        else if(choice==4){

        }
        else if(choice==5){
            
        }

     }
}