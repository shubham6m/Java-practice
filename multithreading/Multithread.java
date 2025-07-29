// public class Multithread extends Thread{
//   private int threadName;

//   public Multithread(int threadName){
//     this.threadName = threadName;
//   }
  
//   @Override
//   public void run(){
//     for(int i = 1; i<=5; i++ ){
//       System.out.println(i + " from thread " + threadName);

//       try {
//         Thread.sleep(1000);
//       } catch (InterruptedException e) {
//         e.printStackTrace();
//       }
//     }
//   }

//   public static void main(String args[]){
//       Multithread thread1 = new Multithread(1);
//       Multithread thread2 = new Multithread(2);

//       // Difference between start() and run():
//       // run() method: If you call run() directly, it executes in the current/main thread.
//       // So thread1.run() finishes completely before thread2.run() starts.
//       // No actual multithreading happens, both run sequentially.

//       thread1.run();
//       thread2.run();

//       // start() method: If you call start(), it creates a new thread and calls run() in that new thread.
//       // Both thread1 and thread2 run concurrently (in parallel), utilizing true multithreading.
//       // Uncomment below lines to see concurrent execution:
//       // thread1.start();
//       // thread2.start();
//   }
// }

//using runnable interface

public class Multithread implements Runnable{

  @Override
  public void run(){
    for(int i = 1; i<=5; i++ ){
      System.out.print(i + " ");
      try{
        Thread.sleep(1000);
      }catch(InterruptedException e){
          e.printStackTrace();
      }
    }
  }
  public static void main(String args[]){
      Multithread thread = new Multithread();
      Thread thread1 = new Thread(thread);
      Thread thread2 = new Thread(thread);
      // thread1.start();
      // thread2.start();
      // although 
      start() method run both thread concurrently, but after using join() it runs current thread completely then start new thread
      thread1.start();
      try{
        thread1.join();
      }catch(InterruptedException e){
        e.printStackTrace();
      }
      // thread1.join();
      thread2.start();
      try{
        thread2.join();
      }catch(InterruptedException e){
        e.printStackTrace();
      }
  }
}
