//program to find a number is prime or not
import java.util.*;
public class Prime{
//function to calculate whether a number is prime or not
public static void prime(int n)
{   
if (n==2){
System.out.println("prime number.");
}
  for(int i=2;i<=n-1;i++)
   {
if(n%i==0){
 System.out.println("not prime number.");
break;}
else{
 System.out.println("prime number");
break;} 
 }
}

 public static void main(String args[])
{
System.out.println("enter any number: ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
prime(num);
}
}