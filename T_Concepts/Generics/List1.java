package Generics;

import java.util.ArrayList;
import java.util.List;
public class List1 //Need to refactor this
{
    public static void main(String[] args) {
//        ArrayList values = new ArrayList();
        List values = new ArrayList();
        values.add(4); //This is wrapper class objects - Integer v [not (int)] = new Integer (4)
        values.add(6);
        values.add(9);
//        values.add("2"); //Support any types in List - List of objects
//        values.add(2); //Add betweeen 6 and 9 - List
        values.add(2, 2); //Add betweeen 6 and 9 - List


        System.out.println(values); //Printing all lines
//        - Collection doesn't have index number

        for (int i = 0; i<values.size(); i++)
        {
            System.out.println(values.get(i));
        }
        System.out.println(" ");
        for (Object o: values
             ) {
            System.out.println(o);

        }
    }
}
/*
This is wrapper class objects
    - Integer v [not (int)] = new Integer (4)

Support any types in List - List of objects
Add betweeen 6 and 9 - List
values.add(2, 2); //Add betweeen 6 and 9 - List

values.get(i)
 */
