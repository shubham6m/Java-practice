import java.util.*;
public class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        //isEmpty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push elemnts 
        public static void push(int ele){
            list.add(ele);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int ele = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return ele;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            return top;
        }
        // add element at bottom
        public static void addBottom(Stack<Integer> s, int data){
            if(s.empty()){
                s.add(data);
                return;
            }
            int ele = s.pop();
            addBottom(s, data);
            s.push(ele);
        }
        public static String reverse(String str){
            Stack<Character> s = new Stack<>();
            int idx = 0;
            while(idx < str.length()){
                s.push(str.charAt(idx));
                idx++;
            }
            StringBuilder res = new StringBuilder("");
            while(!s.isEmpty()){
                char ele = s.pop();
                res.append(ele);
            }
            return res.toString();
        }
        public static void main(String[] args) {
        // stackB s = new stackB();
        //this is now implement by java collection framework
        // Stack <Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // // addBottom(s, 4);
        // reverse(s);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

// code for reverse string 
      String st = "shubham";
      String res = reverse(st);
      System.out.println(res);
    }
}
