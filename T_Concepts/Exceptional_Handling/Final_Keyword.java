package Exceptional_Handling;

class A
{
    final int DAY; //constant value of PI

    public A()
    {
        DAY = 10;
    }
    public void show(){
    System.out.println(" In show");
}
}

class B extends A //B is taking all credits
{

}
public class Final_Keyword {
    public static void main(String[] args) {

        A obj = new A();
        System.out.println(obj.DAY);
    }
}

//Final VariableL Constant
//Final Class:  No other can extend your class
//Final Methods: No one can override your methods
