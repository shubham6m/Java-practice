//factorial of a number
import java.util.*;
class Factorial{
public static int fact(int n){

/*if(n==1)
{return 1;}
else
{return n*fact(n-1);}*/

int f =1; 
for(int i=1;i<=n;i++)
f= f*i;
//System.out.println(f);
return f;
}

public static int ncr(int n, int r){
int n_fact = fact(n);
int r_fact = fact(r);
int ncr = fact(n-r);
int res = (n_fact/(r_fact*ncr));
System.out.print("Binomial coefficient is "+ res);
return res;
}

public static void main(String args[]){
System.out.print("Enter value of n: ");
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
System.out.print("Enter value of r: ");
int num2 = sc.nextInt();
//fact(num);
ncr(num1, num2);
}
}
