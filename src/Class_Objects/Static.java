//Static keyword
//Static Variable
//Static Method

//Class loader memory

package Class_Objects;

class Emp
{
    int eid;
    int salary;
//        String ceo;
    static String ceo;

    public void show()
    {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}
public class Static {
    public static void main(String[] args) {
        Emp navin = new Emp();
        navin.eid = 8;
        navin.salary = 4000;
//        navin.ceo = "Mahesh";
        Emp.ceo = "Mahesh"; //As SAME MEMORY is used in static, don't need to mention reference variable

        Emp rahul = new Emp();
        rahul.eid = 6;
        rahul.salary = 5000;
//        rahul.ceo = "Mahesh";
        Emp.ceo = "Mahesh";

//        rahul.ceo = "Nikita"; //This will change value for all objects
        Emp.ceo = "Nikita";

        navin.show();
        rahul.show();


    }
}

//Same memory is shared for all objects
