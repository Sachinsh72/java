package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterface {
    static void hashmapExample(){
        HashMap<Integer,String> mp = new HashMap<>();
        mp.put(3, "aman");
        mp.put(1, "rohan");
        mp.put(2, "riya");
        mp.put(1, "priya"); //over-rides
        mp.putIfAbsent(2, "manoj"); // it check if key is not presented then put
        System.out.println(mp);
        System.out.println(mp.containsKey(4));
        System.out.println(mp.containsValue("riya"));
        System.out.println(mp.entrySet());
        System.out.println(mp);
        System.out.println(mp.keySet());
        System.out.println(mp.values());

        //iterating over keys in a mpa
        for (Integer i : mp.keySet()){
            System.out.println(i);
        }
        //iterating over key value mapping
        for (var e: mp.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
    static void linkedHashmapExample(){
        LinkedHashMap<Integer,String> mp = new LinkedHashMap<>();
        mp.put(3, "aman");
        mp.put(1, "rohan");
        mp.put(2, "riya");
        System.out.println(mp); // preserve order of insertion
    }
    static void sortedmapExample(){
        TreeMap<Integer,String> mp = new TreeMap<>();
        mp.put(3, "aman");
        mp.put(1, "rohan");
        mp.put(2, "riya");
        System.out.println(mp); // sort order by keys
    }
    public static void main(String[] args) {
        System.out.println("Hashmap: ");
        hashmapExample();
        System.out.println("LinkedHashmap: ");
        linkedHashmapExample();
        System.out.println("Sorted: ");
        sortedmapExample();
    }
}
