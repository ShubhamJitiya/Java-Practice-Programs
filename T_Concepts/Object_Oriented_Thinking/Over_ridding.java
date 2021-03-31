//Method overriding, late binding, dynamic binding, runtime polymorphism
package Object_Oriented_Thinking;

class A2{
public void show()
{
    System.out.println("In show A");
}
}
class B2 extends A2{
public void show()
{
    System.out.println("In show B");

}
}

public class Over_ridding {
    public static void main(String[] args) {
    B2 obj = new B2();
    obj.show(); //If it won't find in it's class then it finds in parent class
    }
}

//ref: 8.9 T

//Overridding - same name, same parameter but different class - possible by inheritance
//Overloading - same name different parameter in same class
// signature