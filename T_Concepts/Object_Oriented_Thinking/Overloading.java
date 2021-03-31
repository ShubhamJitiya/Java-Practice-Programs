//Method overloading, early binding, static binding, compile time polymorphism

package Object_Oriented_Thinking;

class A1
{
    public void show()
    {
        System.out.println("Hello ...");
    }
    public void show(int i)
    {
        System.out.println("Hello " + i);
    }
    public void show(double d)
    {
        System.out.println("");
    }
}

public class Overloading {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.show(); //non-static method - required instance or object to accesss

        obj.show(5);
    }
}
//ref: 8.8 T

//Overridding - same name, same parameter but different class - possible by inheritance
//Overloading - same name different parameter in same class
// signature