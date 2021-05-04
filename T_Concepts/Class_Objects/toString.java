package Class_Objects;

class Student1 extends Object //every class in java extends objects
{
    int rollno;
    String sname;

    public Student1(int rollno, String sname) {
        this.rollno = rollno;
        this.sname = sname;
    }
//    public String toString(){
//        return rollno + " : " + sname;
//}

    @Override
    public String toString() {
        return "Student1{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                '}';
    }
}

public class toString {
    public static void main(String[] args) {
        Student1 s1 = new Student1(11, "shubh");

//        System.out.println(s1.rollno);
//        System.out.println(s1.sname);

//        System.out.println(s1); //by default it calls method - tostring
        System.out.println(s1.toString());
    }
}
//when we try to print object
//it will find toString method in our class
//if it can't get toString in our class
//    jump to object class toString

//ref: T
