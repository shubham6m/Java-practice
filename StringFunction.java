import java.util.Scanner;

public class StringFunction{
    public static void main(String[] args) {
    // this is a string comparison function whether they are equals or not in boolean    
        String st1 = "Hello World";
        String st2 = new String("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string (Hello World)");
        String st3 = sc.nextLine();        
        boolean res1 = st1.equals(st2);
        boolean res2 = st1.equals(st3);
        System.out.println(res1);
        System.out.println(res2);
    
    //this is a string function for getting a substring from a given string 
   String newsubString = st1.substring(3, 7);
   System.out.println(newsubString);
   }
}