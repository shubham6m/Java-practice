// nextgreater.java
import java.util.*;
class nextgreater
{
public static void main(String args[])
{
    int arr[] = {6, 8, 0, 1, 3};
    Stack<Integer> s = new Stack<>();
    int greater[] = new int[arr.length];
    //while loop
    for(int i = arr.length - 1; i>=0; i--){
    while(!s.empty() && arr[s.peek()] <= arr[i]){
        s.pop();
    }

    //if else
    if(s.empty()){
        greater[i] = -1;
    } else {
        greater[i] = arr[s.peek()];
    }

    //push
    s.push(i);
    }
    for(int i = 0; i<greater.length; i++){
        System.out.print(greater[i]+ " ");
    } 
}
//variations in question: 
// 1. next greater at right -> same as above code
// 2. next smaller at right -> change while condition "sign" as arr[s.peek()] >= arr[i]
// 3. next greater at left -> change for loop 
// 4. next smaller at left -> change both for loop & while condition
}
