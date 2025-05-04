import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
//creation of hashmap
        HashMap<String, Integer> hp = new HashMap<>();
//add
        hp.put("shubham", 168);
        hp.put("pawan", 165);
        hp.put("mahesh", 18);
        System.out.println(hp);
//get value
        System.out.println(hp.get("shubham"));
// remove
System.out.println(hp.remove("shubham"));
    }
}
