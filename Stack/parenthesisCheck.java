import java.util.*;

class parenthesisCheck {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String k = "({[[]}])";
        for (int i = 0; i < k.length(); i++) {
            char ch = k.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    System.out.println("invalid");
                    return;
                }
                char top = s.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    System.out.println("invalid");
                    return;
                }
            }
        }
        if (s.isEmpty()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}
