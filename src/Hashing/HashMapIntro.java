package Hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIntro {

    public static void main(String[] args) {

        // HashMap creation
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Inserting key-value pairs into HashMap
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");

        // Updating value of an existing key
        studentMap.put(102, "Robert");  // Bob -> Robert

        // Displaying HashMap entries
        System.out.println("HashMap Elements: " + studentMap);

        // Search by key using containsKey()
        int searchKey = 103;
        if (studentMap.containsKey(searchKey)) {
            System.out.println("Key " + searchKey + " exists with value: " + studentMap.get(searchKey));
        } else {
            System.out.println("Key " + searchKey + " does not exist.");
        }

        // Search by value using containsValue()
        String searchValue = "Alice";
        if (studentMap.containsValue(searchValue)) {
            System.out.println("Value '" + searchValue + "' is present in the HashMap.");
        } else {
            System.out.println("Value '" + searchValue + "' is NOT present.");
        }

        // Remove a key-value pair
        studentMap.remove(104);
        System.out.println("After removing key 104: " + studentMap);

        // Iterating through HashMap using Iterator and entrySet()
        System.out.println("Iterating through HashMap using Iterator:");
        Set<Map.Entry<Integer, String>> entrySet = studentMap.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();

        // Iterating using for-each loop. entrySet stores both key value pair.
        System.out.println("Iterating through HashMap using for-each loop:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        //keySet stores only keys not value, we have to use map.get(key) to print value too.
        Set<Integer> keys = studentMap.keySet();
        for(Integer key: keys){
            System.out.println(key+ " " + studentMap.get(key));
        }

        // Check size of the HashMap
        System.out.println("Size of HashMap: " + studentMap.size());
    }
}