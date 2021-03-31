package com.company;

interface sampleInterface {
    void math1();
    void math2();
}
interface childSampleInterface extends sampleInterface{
//    void math1();
//    void math2();
    void math3();
    void math4();
}
class MySampleClass implements childSampleInterface{
   public void math1(){
       System.out.println("Math1");
    }
    public void math2(){
       System.out.println("Math2");
    }
   public void math3(){
       System.out.println("Math3");
    }
    public void math4(){
       System.out.println("Math4");
    }
}

public class CWH_58_InheritanceInInterfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.math1();
        obj.math2();
    }
}
