package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets{

    public static void main(String[] args) {

        // HashSet creation
        HashSet<String> names = new HashSet<>();

        // Inserting elements into HashSet
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // HashSet allows unique elements only — duplicates won't be added
        names.add("Alice");  // Won't be added

        // Display HashSet elements
        System.out.println("HashSet Elements: " + names);

        // Search for an element using contains()
        String searchName = "Charlie";
        if (names.contains(searchName)) {
            System.out.println(searchName + " is present in the HashSet.");
        } else {
            System.out.println(searchName + " is NOT present in the HashSet.");
        }

        // Remove an element
        names.remove("David");
        System.out.println("After removing 'David': " + names);

        // Iterating through HashSet using Iterator
        System.out.println("Iterating through HashSet:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        // Check size of the HashSet
        System.out.println("Size of HashSet: " + names.size());
    }
}

