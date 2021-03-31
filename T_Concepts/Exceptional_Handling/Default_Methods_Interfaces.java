package Exceptional_Handling;


//two methods
@FunctionalInterface

interface Demo
{
    void abc(); //Abstract
//    void show()
//    {
//
//    }
    default void show() //default
    {
        System.out.println(" in show ...");
    }
}

class demoImp implements Demo
{
    public void abc()
    {
        System.out.println(" in abc ");
    }
  public void show() //default
    {
        System.out.println(" in new show ...");
    }
}
public class Default_Methods_Interfaces {
    public static void main(String[] args) {

        Demo obj = new demoImp();
        obj.show();
        obj.abc();

    }
}

//Abstract class - Define and Declare
//        Interface - Declare 1.7
//        1.8 can define methods and interface - by using default keyword

//ref: T Complete