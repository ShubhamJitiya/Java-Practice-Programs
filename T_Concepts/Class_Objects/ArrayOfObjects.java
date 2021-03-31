package Class_Objects;

class Student2{
    String sname;
    int rollno;

    public Student2(String sname, int rollno) {
        this.sname = sname;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "sname='" + sname + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {

        Student2 s1 = new Student2("Navin", 101);
        Student2 s2 = new Student2("Mohit", 102);
        Student2 s3 = new Student2("Usha", 103);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //By an array we can have all the objects of above

        Student2[] Student2 = new Student2[3];  //This is not collection of objects but it is collection of references
        Student2[0] = s1;
        Student2[1] = s2;
        Student2[2] = s3;

        for(Student2 s: Student2)
            System.out.println(s);
    }
}