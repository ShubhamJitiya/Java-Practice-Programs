package Generics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Map_Interface {
    public static void main(String[] args) {

//        Map <String ,String> map = new HashMap<>();
        Map <String ,String> map = new Hashtable<>();

        map.put("myName", "Navin");
        map.put("actor", "John");
        map.put("ceo", "Marsisa");
        map.put("actor", "Akshay"); //No duplication - replace


//        System.out.println(map); //Prints in random order
//        System.out.println(map.get("myName")); //Prints specific element by key

        Set<String> keys = map.keySet();

        for(String key: keys)
        {
            System.out.println(key+" " +map.get(key));
        }
    }
}
/*
HashMap
    - Use put instead of add
    - Takes two parameters (key, values)
    - Prints in Random order
    - No duplication in KEYS - Replace with new value

    - To get specific
        - map.get(key)
    - For key which is not available gives -  NULL
        - won't return any exception
    -map.keySet() = Gives Key

Difference between HashMap and HashTable
    - Hashtable is synchronized - Thread safe
    - HashMap is not synchronized - No Thread Safety - Usually use this
 */
//Ref: T C