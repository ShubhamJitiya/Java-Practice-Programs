package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class Iterators_Interface {
    public static void main(String[] args) {
        Collection values = new ArrayList();
        values.add(4);
        values.add(6);
        values.add(9);

        System.out.println(values); //Printing all lines
//        - Collection doesn't have index number
        Iterator it = values.iterator(); //returns object of iterator
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next()); //error
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
/*
Iterators_Interface
Implementation of Collection -API - (Classes, Interfaces)
-------------------
Collection values = new ArrayList();
Iterator it = values.iterator();
        System.out.println(it.next());
 while(it.hasNext())
            System.out.println(it.next());
 */