package com.company;
class Circle{
    Circle(int r)
    {
        this.radius = r;
    }
    public int radius;

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
class Cylinder1 extends Circle{
    Cylinder1(int r, int h) {
        super(r);
        this.height = h;
    }

    public int height;
    public double volume(){
        return Math.PI * this.radius * this.radius*this.height;
    }
}
public class CWH_51_PS10 {
    public static void main(String[] args) {
        //Problem: 1
//        Cylinder1 obj = new Cylinder1();
//        Circle objc = new Circle();
//        Cylinder1 objc = new Circle();


    }
}
