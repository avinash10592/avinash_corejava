import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

    public static void main(String args[]) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(100, "Avinash");
        map.put(101, "Riyaz");
        map.put(102, "Rohit");
        //Fetching key
        System.out.println("Keys: " + map.keySet());
        //Fetching value
        System.out.println("Values: " + map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: " + map.entrySet());
        // get the value and key
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        //remove method using key
        map.remove(102);
        System.out.println("After invoking remove() method: " + map);
    }
}
