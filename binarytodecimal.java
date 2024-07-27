// Write a java program to convert binary number to its decimal equivalent.
import java.lang.Math;
class binary{
    public static void toDecimal(int n){
        int i = 0;
        double res = 0;
        while(n>0){
            int k = n%10;
            n = n/10;
            res = res+k * Math.pow(2,i);
            i++;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        toDecimal(1111);
    }
}