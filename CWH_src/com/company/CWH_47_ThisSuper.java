package com.company;

class Ekclass{
    int a;
    Ekclass(int a){
        this.a = a;
    }

    public Ekclass() {

    }

    public int returnone(){
        return 1;
    }

    public int getA() {
        return a;
    }
}
class Doclass extends Ekclass{
    Doclass(int c)
    {
        super();
        System.out.println("Ma ek constructor hu");
    }
}
public class CWH_47_ThisSuper {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(65);
        System.out.println(e.getA());



    }
}
