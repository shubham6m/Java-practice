import java.util.Scanner;
public class Primerange{

public static void isprime(int a){
boolean res = true; 
for (int i=2;i<=Math.sqrt(a);i++)
if (a%i==0)
res = false;
if(res == true)
System.out.println(i);
}
 public static void main(String args[]){
System.out.println("enter the range: ");
System.out.println("ending digit: ");
Scanner sc = new Scanner(System.in);
int r1 = sc.nextInt();
isprime(r1);
}
}