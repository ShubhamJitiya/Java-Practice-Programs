//BUG
package Object_Oriented_Thinking;

abstract class shape
{
    public abstract void CalculateArea();
}

class circle extends shape
{
    public int a;

    public circle() {
        this.a = 5;
    }

    public void CalculateArea()
    {
        System.out.println("Area of Circle: " + 3.14*a*a);
    }
}
class square extends shape
{
    public int a;

    public square() {
        this.a = 5;
    }

    public void CalculateArea()
    {
        System.out.println("Area of Square: " + a*a);
    }
}

public class Abstract_Class_3 {
    public static void main(String[] args) {

        shape s1 = new circle();
        shape s2 = new square();

        s1.CalculateArea();
        s2.CalculateArea();


    }
}
