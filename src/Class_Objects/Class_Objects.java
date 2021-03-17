//Calculator
package Class_Objects;

class Calc
{
    int num1;
    int num2;
    int result;

    public void perform()
    {
       result = num1+num2;
    }
}

public class Class_Objects {
    public static void main(String[] args) {
//        Calc obj; // Reference
//        obj = new Calc(); //returns object of type calc
        // Calc() - constructor

        //Reference and Create new object in one line
        Calc obj = new Calc(); //Object knows something AND Object does something
        obj.num1 = 3; //Use reference to access object
        obj.num2 = 5;

        obj.perform();

        System.out.println(obj.result);
        //In c it returns Garbage value but in java it doesn't
        //Refer GARBAGE COLLECTION


    }
}
//Object - Real entity
//Class - Blueprint