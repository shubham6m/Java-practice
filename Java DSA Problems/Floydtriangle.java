import java.util.*;

public class Floydtriangle {
   public static void Floydtriangle(int row) {
      int num = 1;
      for (int i = 1; i <= row; i++) {
//int num =1;
//for printing from starting always
         for (int j = 1; j <= i; j++) {
            System.out.print(" "+num);
            num++;
         }
         System.out.println();
      }

   }
   public static void main(String args[]) {
      Floydtriangle(6);
   }
}