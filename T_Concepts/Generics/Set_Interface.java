package Generics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface {
    public static void main(String[] args) {

//        Set <Integer> values = new HashSet<>();
        Set <Integer> values = new TreeSet<>();

        System.out.println(values.add(87));
        System.out.println(values.add(97));
        System.out.println(values.add(34));

        System.out.println(values.add(92));

//        values.add(6); //No duplicates  //false - only in SET not in LIST
        //Prints in random order
//        System.out.println(values);
        for (int i: values
             ) {
            System.out.println(i);

        }
    }
}
/*
HashSet
    - No duplicates
            - In list we can add duplicates
    - Prints in random order
TreeSet
    - Prints in specific Order
 */
