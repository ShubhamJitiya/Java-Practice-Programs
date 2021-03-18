//Illustrates Accessing Objects via Reference Variable

package Class_Objects;

class Student
{
    String name;
    int rollno;

    public void get_data(int r, String nm)
    {
        rollno = r;
        name = nm;
    }
    public void put_data()
    {
        System.out.println("RollNo: " + rollno);
        System.out.println("Name: " + name);
    }
}
public class Reference_Variable {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

//s1 & s2 are object reference variable
//used to access methods and data members

        s1.get_data(101, "Ankita");
        s2.get_data(102, "Anjali");
        s1.put_data();
        s2.put_data();

    }
}