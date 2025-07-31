import java.util.*;
public class heap {
    static class hp{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);
            //child index = x
            int x = arr.size() -1;
            //parent index = y
            int y = (x-1)/2;
            while (arr.get(x) < arr.get(y)) {
                int temp = arr.get(x);
                arr.set(x, y);
                arr.set(y, temp);

                x = y;
                y = (x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }

        public int remove(){
            int data = arr.get(0);

            //swap first & last element
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //remove last element now
            arr.remove(arr.size()-1);

            //fix my heap
            Collections.sort(arr);
            return data;
        }
    }
    public static void main(String[] args) {
        hp obj = new hp();
        obj.add(2);
        obj.add(3);
        obj.add(1);
        System.out.println(obj.peek());
        obj.remove();
       System.out.println(obj.peek());
        obj.remove();
        System.out.println(obj.peek());
        obj.remove();

    }
}
