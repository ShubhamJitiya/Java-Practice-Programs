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

    static //When we load a class - Class is loaded once only - class loads first
    {
        ceo = "Larry";
        System.out.println("In static");
    }

    //If more than one static block exist then only it follows sequence

    public Emp() //When we create an object
    {
        eid = 1;
        salary = 3000;
//        ceo = "Larry"; //Don't need - Because it creates copy everytime
        System.out.println("In constructor ...");
    }
}
public class Static {
//    int i;
//    static int i;
    public static void main(String[] args) {
        Emp navin = new Emp();

//        i = 10; //Only static varibles can be accessed inside static methods

//        navin.eid = 8;
//        navin.salary = 4000;
////        navin.ceo = "Mahesh";
//        Emp.ceo = "Mahesh"; //As SAME MEMORY is used in static, don't need to mention reference variable

        Emp rahul = new Emp();
//
//        rahul.eid = 6;
//        rahul.salary = 5000;
////        rahul.ceo = "Mahesh";
//        Emp.ceo = "Mahesh";
//
////        rahul.ceo = "Nikita"; //This will change value for all objects
//        Emp.ceo = "Nikita";

        navin.show();
        rahul.show();


    }
}

//Same memory is shared for all objects
//Static Varibles - same for all objects
//Non-static Variables - NOT SAME
//Only static varibles can be accessed inside static methods
