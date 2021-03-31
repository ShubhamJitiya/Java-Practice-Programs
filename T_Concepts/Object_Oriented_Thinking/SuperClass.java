package Object_Oriented_Thinking;

class A
{
    public A() {
        System.out.println("In A ");
    }
    public A(int i)
    {
        System.out.println("In A int");
    }
}
class B extends A
{
    public B() {
//        super(); by default
        super(5);
        System.out.println("In B ");
    }
    public B(int i)
    {
//        super(); by default
        super(5);
        System.out.println("In B int");
    }
}

public class SuperClass {
    public static void main(String[] args) {
//        A obj1 = new A();
//        B obj2 = new B();
        B obj2 = new B(); //It will call default constructor of super class + paramatrised of sub class


    }
}
//Ref: 6.2 T

//if we create object of subclass then
//    constructor of both class is called (superclass & subclass)

//every constructor in sub class have by default super()