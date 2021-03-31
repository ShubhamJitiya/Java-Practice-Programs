package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable <Stud>
{
    int rollno, marks;
    String name;

    public Stud(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Stud s) {

//        return marks>s.marks?1:-1;
        return name.length()>s.name.length()?1:-1;
    }
}

public class Comparable_Interface {
    public static void main(String[] args) {

        List <Stud> studs = new ArrayList<>();
        studs.add(new Stud(23, "Mahesh", 55));
        studs.add(new Stud(24, "Sony", 64));
        studs.add(new Stud(25, "Larry", 25));
        studs.add(new Stud(26, "Joseph", 36));

//        Collections.sort(studs);
        Collections.sort(studs, (i,j) -> i.marks<j.marks?1:-1);

        for (Stud s: studs)
        {
            System.out.println(s);
        }
    }
}

//Collections.sort(studs, (i,j) -> i.marks<j.marks?1:-1);
//        We can make our own class
//We can override compareto()