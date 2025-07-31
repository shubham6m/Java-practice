import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) throws InterruptedException {
        int size = 1000000; // 1 million

        List<Integer> vector = new Vector<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            vector.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("The time taken by Vector is : " + (end - start));

        List<Integer> arraylist = new ArrayList<>();
        //note the start time
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arraylist.add(i);
        }
        //note the ending time
        end = System.currentTimeMillis();
        System.out.println("The time taken by ArrayList is : " + (end - start));
        
        //but if I use concept of multithreading 
        List<Integer> multithreadedVector = new Vector<>();
        start = System.currentTimeMillis();
        Thread t1 = new Thread(()->{
            for(int i = 0; i<size; i++ ){
                multithreadedVector.add(i);
            }
        });
        Thread t2 = new Thread(() ->{
            for(int i =0; i<size; i++ ){
                multithreadedVector.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        end = System.currentTimeMillis();
        
        System.out.println("The time taken by Multithreaded vector is : " +(end - start)+ " with size of " + multithreadedVector.size());

        //similar in case of multithreaded arraylist 
        // this is old way to use arraylist
        // List<Integer> multithreadedArrrayList = new ArrayList<>();
        // this is synchronized arraylist
        List<Integer> multithreadedArrrayList = Collections.synchronizedList(new ArrayList<>());
        start = System.currentTimeMillis();
        Thread t3 = new Thread(() ->{
            for(int i =0; i<size; i++ ){
                multithreadedArrrayList.add(i);
            }
        });
        Thread t4 = new Thread(() ->{
            for(int i = 0; i<size; i++ ){
                multithreadedArrrayList.add(i);
            }
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();
        end = System.currentTimeMillis();

        System.out.println("The time taken by multithread arraylist is : " + (end-start) + " with size " + multithreadedArrrayList.size());
    }
}    

/* 
difference between arraylist & vectors
1. Performance : arraylist perfomes better than vectors in adding elements in single thread environment
2. But in case of multithreaded vectors behave similar & took almost same time just slight difference in the manipulation time.
*/