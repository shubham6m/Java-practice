import java.util.*;
public class Input{
       public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
          System.out.println("Write your name....");
//nextLine is use to take paragraph with space
          String name  = sc.nextLine();
          int num = sc.nextInt();
           System.out.println("Welcome "+name+"!!"+num); 
       }
}