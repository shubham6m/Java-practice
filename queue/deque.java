// deque.java
// implemention of deque using java collection framework
import java.util.*;
public class deque {
    public static void main(String[] args) {
        //create deque
        // Deque <Integer> dq = new LinkedList<>();
        Deque <Integer> dq = new ArrayDeque<>();
        dq.addFirst(2);//[2]
        dq.addFirst(3);//[3,2]
        dq.removeFirst();//[2]
        dq.addLast(4);//[2,4]
        dq.addLast(5);//[2,4,5]
        dq.removeLast();//[2,4]
        System.out.println("first element is: "+ dq.getFirst());
        System.out.println("last element is: "+ dq.getLast());
        System.out.println(dq);
    } 
}