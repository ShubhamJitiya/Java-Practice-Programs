package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsVthList {
    public static void main(String[] args) {
//        List <Integer> values = new ArrayList<Integer>(); //1.5
        List <Integer> values = new ArrayList<>(); //1.7
        values.add(4);
        values.add(6);
        values.add(9);
        values.add(2, 2);

        System.out.println(values);

        System.out.println(" ");
        for (Integer o : values) {
            System.out.println(o);
        }
    }
}
/*
    Type safe:
        -  4 = int
        -  "Hello" = String

List <Integer> values = new ArrayList<Integer>(); //1.5
List<Integer> values = new ArrayList<>(); //1.7


 */
//Ref: T C
