import java.util.*;
public class priorityQ {
    //how priority queue works on objects & priotise them
    static class student implements Comparable<student>{
        String name; 
        int rank;

        student(String name , int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        //by default pq remocve the element in ascending order
    PriorityQueue<student> pq = new PriorityQueue<>(Comparator.reverseOrder());
    //add element
    pq.add(new student("a",7));
    pq.add(new student("b", 4));
    pq.add(new student("c", 9));
    pq.add(new student("d", 1));
   
    while(!pq.isEmpty()){
        //peek element
        System.out.println(pq.peek().name + " -> "+ pq.peek().rank);
        //remove element
        pq.remove();
    }
}
}