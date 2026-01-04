package CollectionPractice.HashmapsPractice;

import java.util.*;

public class HM1 {
    static void HashmapMehtods(){
        // Syntax
        Map<String, Integer> map = new HashMap<>();

        // Adding the entries;
        map.put("Akash",21);
        map.put("Yash",16);
        map.put("Luv",17);
        map.put("Rishika",19);
        map.put("Harry",18);

        // Displaying the HashMap;
        System.out.println(map);

        // Getting value of a key from the hashmap;
        System.out.println("Value of Yash : "+map.get("Yash")); // 16
        System.out.println("Value of Rahul : "+map.get("Rahul")); // Null

        // Changing / Updateing the values in hashmaps;
        map.put("Akash",25);
        System.out.println(map);

        // Removing the Entry/key;
        System.out.println(map.remove("Akash"));
        System.out.println(map.remove("Riya"));

        // Checking if the key exists in the map or not;
        System.out.println("Does Akash present in the Map? "+map.containsKey("Akash"));
        System.out.println("Does Yash present in the Map? "+map.containsKey("Yash"));

        // Adding a new Entry only if the key is not present;
        if(!map.containsKey("Yash")) map.put("Yash",30);
        System.out.println(map);

        map.putIfAbsent("Yash",30);
        map.putIfAbsent("Yashika",30);
        System.out.println(map);

        // Retrieving all the keys present in the Map;
        System.out.println("ALl the Key Set : "+map.keySet());

        // Retrieving all the Values present in the Map;
        System.out.println("ALl the Values : "+map.values());

        // Retrieving all the Entries present in the Map;
        System.out.println("ALl the Entry Set : "+map.entrySet());
    }

    public static void main(String[] args) {
        HashmapMehtods();

    }
}
