import java.util.*;
public class Bintodec{

public static void bintodec(){
System.out.println("Enter any binary number: ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
//my num = num;
int dec = 0;
int pow = 0;
while(num>0){
 
int lastdigit = num%10;
dec = dec + (lastdigit*(int)Math.pow(2,pow));
pow++;
num=num/10;
}
System.out.println(dec);

}

 public static void main(String args[]){
 bintodec();


 }
}
