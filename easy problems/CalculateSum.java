import java.util.Scanner;

public class CalculateSum {
    public static int calculate (int a, int b){
      //get the sum value in range from a to b
      int n = b-a;
      int sum = (n*(n+1))/2;
      if(a > 1){
        sum *= a;
      }
      return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculate(a, b));
        sc.close();
    }
}