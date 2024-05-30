// implemention of both queue & stack using deque
import java.util.*;
public class deque1 {
    //approach for stack
    /*either push -> addFirst
             pop -> removeFirst
        or   push -> addLast
             pop -> removeLast*/
    static class Stack{
        Deque<Integer> s = new LinkedList<>(); 
        //push element
        public void push(int ele){
            s.addFirst(ele);  
        }
        //pop element
        public int pop(){
            // s.removeFirst();
            return s.removeLast();
        }
        //peek element
        public int peek(){
            return s.getFirst();
        }
    }
    
    static class Queue{
        Deque<Integer> q = new LinkedList<>();
        //enqueue element
        public void enqueue(int ele){
            q.addFirst(ele);
        }
        //dequeue element
        public int dequeue(){
            return q.removeLast();
        }
        //peek element
        public int peek(){
            return q.getFirst();
        }
    }

    public static void main(String[] args) {
        //for stack
        Stack st = new Stack();
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.pop());

        //for queue
        Queue qu = new Queue();
        qu.enqueue(2);
        qu.enqueue(3);
        System.out.println(qu.dequeue());
        System.out.println(qu.peek());
    }
}