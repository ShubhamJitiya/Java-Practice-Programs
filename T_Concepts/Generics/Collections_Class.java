package Generics;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Class {
    public static void main(String[] args) {

        List <Integer> values = new ArrayList<>();
        values.add(6);
        values.add(9);
        values.add(2);
        values.add(8);

        Collections.sort(values);
        Collections.reverse(values);
        Collections.shuffle(values);
        System.out.println(values);
    }
}
/*
List is by default mutable
    - Stream api
 */
