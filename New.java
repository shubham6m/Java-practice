import java.util.*;
public class New{
   public static boolean findnum(int num){
      if(num%2==0)
         return true;
      else
         return false;
   }
public static void main(String args[]){
      System.out.println("enter any num: ");
      Scanner sc = new Scanner(System.in);
      int number  = sc.nextInt();
      boolean res = findnum(number);
      if(res == true ){
         System.out.println("even number");
      }
      else{
         System.out.println("odd number");
      }
   }
}