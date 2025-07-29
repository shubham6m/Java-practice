public class LargestString {
    public static void main(String a[]) {
        // this is a comparing string function by letter by letter & give res in int form
        String expression[] = { "happy", "Sad", "sorrow", "enthusiastic" ,"celebrate"};
        String largest = expression[0];
        String smallest = expression[0];
        for (int i = 0; i < expression.length; i++) {
            if (largest.compareToIgnoreCase(expression[i]) < 0) {
                largest = expression[i];
            }
            if(largest.compareToIgnoreCase(expression[i])>0){
                smallest = expression[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
