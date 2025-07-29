/* for the convenience, we are giving you a test server with the following APIs that returns a
     number of a particular type - prime, fibonicci, even & random number.*/

    //  here we write the code or we can say logic to generate all above task

    // currently a bit of idea about react so i can't code in that lang. 

    // for prime

// Write a java program to check given number is prime or not

import java.util.ArrayList;
import java.util.*;

public class prime {
    public static void main(String[] args) {
        System.out.println("enter a number for prime number range: ");
        int lower = 1;
        Scanner sc = new Scanner(System.in);
        int upper = sc.nextInt();
        System.out.println("prime number with range " + upper);
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.print(i+ " ");
            }
        }
        System.out.println();

        //for fibonacii
             System.out.println("enter the fibonacci range : ");
            int n = sc.nextInt();
            System.out.println("Fibonacci series up to term " + n + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(fib(i) + " ");
            }
            System.out.println();
            //for even number 
            int start = 1; // Start of the range
            System.out.println("enter the range for even number : ");\
            
            int end = sc.nextInt();
                System.out.print("Even numbers from " + start + " to " + end + ": ");
                for (int i = start; i <= end; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
                        System.out.print("Enter the number of random integers you want to generate: ");
                        int numIntegers = sc.nextInt();
                
                        // Generate and print the random integers
                        System.out.println("Random integers (" + numIntegers + " numbers):");
                        for (int i = 0; i < numIntegers; i++) {
                            int randomInt = generateRandomInt();
                            System.out.print(randomInt + " ");
                        }
    }

    // Generate a random integer between 1 and 100 (adjust the range as needed)
    public static int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }


    static boolean isPrime(int n) {
        if (n < 2) {
            return false; 
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    //function for fibonacci number
     static int fib(int n) {
            if (n <= 1) {
                return n; // Base case: Fibonacci of 0 and 1 is the number itself
            }
            return fib(n - 1) + fib(n - 2); // Recursive call
        }
       
        
}
    
