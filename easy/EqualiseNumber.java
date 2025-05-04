import java.util.*;
public class EqualiseNumber {
    public static int makeEqual(int a, int b, int c){
        if(a == b && b == c){
            return 0;
        }

        int sum = a + b + c;
        if(sum % 3 == 0){
            return -1;
        }

        int target = sum/3;
        int operations = Math.abs(a-target) + Math.abs(b-target) + Math.abs(c-target);
        return operations/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();   
        int c = sc.nextInt();
        sc.close();

        int result = makeEqual(a, b, c);    
        System.out.println(result);
    }
}