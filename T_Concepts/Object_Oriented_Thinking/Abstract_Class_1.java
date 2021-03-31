//Abstract class and abstract method

package Object_Oriented_Thinking;

abstract class MaheshPhone //Abstract class
{
    public void call()
    {
        System.out.println("Calling ...");
    }

    public abstract void move();
    public abstract void dance();
    public abstract void cook();

}

abstract class RameshPhone extends MaheshPhone //Abstract class
{
    //Compulsory to define all methods
    public void move()
    {
        System.out.println("Moving ...");
    }
}

class SureshPhone extends RameshPhone //Concrete class
{
    public void dance()
    {
        System.out.println("Dancing ...");
    }
    public void cook()
    {
        System.out.println("Cooking ...");
    }
}

public class Abstract_Class_1 {
    public static void main(String[] args) {
//        MaheshPhone obj = new MaheshPhone(); //cannot instantiate the abstract class
        //obj.call();

//        RameshPhone obj = new RameshPhone(); //cannot instantiate the abstract class

        SureshPhone obj = new SureshPhone(); //Concrete instance
        obj.call();
        obj.cook();
        obj.dance();
        obj.move();
    }
}

//REF: 8.18 T
//007