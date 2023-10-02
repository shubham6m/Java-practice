import java.util.*;

public class Butterfly {
   public static void Butterfly(int row) {
      for (int i = 1; i <= row; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print(" * ");
         }
         //for space
         for (int j = 1; j <= row - i; j++) {
            System.out.print("   ");
         }
         //for space
         for (int j = 1; j <= row - i; j++) {
            System.out.print("   ");
         }
         // for stars
         for (int j = 1; j <= i; j++) {
            System.out.print(" * ");
         }
         System.out.println();
      }
      //for inverted pattern
      for (int i = 1; i <= row; i++) {
         for (int j = 1; j <= row-i; j++) {
            System.out.print(" * ");
         }
         //for space
         for (int j = 1; j <=i; j++) {
            System.out.print("   ");
         }
         //for space
         for (int j = 1; j <= i; j++) {
            System.out.print("   ");
         }
         // for stars
         for (int j = 1; j <=row-i; j++) {
            System.out.print(" * ");
         }
         System.out.println();
      }
   }
   public static void main(String args[]) {
      Butterfly(4);
   }
}