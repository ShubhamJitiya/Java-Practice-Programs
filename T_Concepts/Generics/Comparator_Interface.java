package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class Myc

public class Comparator_Interface {
    public static void main(String[] args) {

        List <Integer> values = new ArrayList<>();

        values.add(404);
        values.add(908);
        values.add(639);
        values.add(265);

        Collections.sort(values, (o1,  o2) -> o1%10 > o2%10 ? 1:-1); //swap or not swap || sort or don't sort
        System.out.println(values);
    }
}

//Comparator to specify own logic of sorting
//swap or not swap || sort or don't sort
