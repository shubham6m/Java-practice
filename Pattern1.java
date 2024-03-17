import java.util.*;

public class Pattern1 {
   //print square/rectangle type structure
   /*
    * public static void shape(int row, int col) {
    * for (int i = 1; i <= row; i++) {
    * for (int j = 1; j <= col; j++) {
    * if (i == row || j == col || i == 1 || j == 1)
    * 
    * {
    * System.out.print("* ");
    * } else {
    * System.out.print("  ");
    * }
    * }
    * System.out.println();
    * }
    * 
    * }
    */
   public static void triangle(int row) {
      for (int i = 1; i <= row; i++) {
         // for space
         for (int j = 1; j <= row - i; j++) {
            System.out.print("   ");
         }
         // for stars
         for (int j = 1; j <= row; j++) {
            // for(int j=1;j<=i;j++)--- for inverted triangle
            //for hollow
            /*if (i == 1 || j == 1 || i == 4 || j == 4) {
               System.out.print(" * ");
            } else {
               System.out.print("   ");
            }*/
            System.out.print(" * ");
         }
         System.out.println();
      }

   }

   public static void main(String args[]) {
      // shape(4, 5);
      triangle(4);
   }
}
