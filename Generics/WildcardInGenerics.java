import java.util.*;

public class WildcardInGenerics {
  public static void main(String args[]) {

    WildcardInGenerics obj = new WildcardInGenerics();

    List<Integer> arr = new ArrayList<>();
    arr.add(2);
    arr.add(3);
    obj.printList(arr);

    List<String> arr2 = new ArrayList<>();
    arr2.add("shubham");
    arr2.add("mishra");
    obj.printList(arr2);
  }

  private static void printList(List<?> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
  }
}
