package com.company;

class Base1
{
    Base1(){
        System.out.println("I am a base constructor");
    }
    Base1(int a){
        System.out.println("I am a overloaded base constructor with value a:"+a);
    }

}
class Derived1 extends Base1
{
    Derived1(){
       // super(0);
        System.out.println("I am a derived constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded derived constructor with value b: "+ y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived() {
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded derived constructor with value c: " + z);
    }
}

public class CWH_46_ConstructorsInInheritance {
    public static void main(String[] args) {

//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(14,9);
//        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12,13,15);
    }
}
