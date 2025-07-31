//tower of hanoi
class toh{
    public static void to(int n, int A, int B, int C){
        if (n>0){
        to(n-1, A,C,B);
        System.out.print(A + " " + C);
        to(n-1, B,A,C);
        }
    }
    public static void main(String[] args) {
        to(3,1,2,3);
    }
}