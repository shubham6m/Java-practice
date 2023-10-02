public class Override {
 public static void main(String args[]){
System.out.println("Here we learn function override method...\n Choose any option: \n1.Addition of two integer\n2.Addition of two float number\n3.Addition of three number");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
switch(num){
case 1 : add(a,b);
break;

case 2: add(a,b);
break;

case 3: add(a,b,c);
break;

}
public static void add(int a, int b){
System.out.println("Enter any two integer:");
int a = sc.nextInt();
int b = sc.nextInt();
int sum = a+b;
System.out.print(sum);
}

public static void add(int a, int b){
System.out.println("Enter any two float number:");
float a = sc.nextFloat();
float b = sc.nextFloat();
float sum = a+b;
System.out.print(sum);
}

public static void add(int a, int b){
System.out.println("Enter any three integer:");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int sum = a+b+c;
System.out.print(sum);
}

}
}