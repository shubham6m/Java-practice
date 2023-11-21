
//whether the input string is palindrome or not
import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println("enter any string: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean result = isPalindrome(name);
        if (result == false) {
            System.out.println("not palindrome");
        } else {
            System.out.println("palindrome");
        }
    }
}