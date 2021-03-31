package com.company;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    //p2
    public double surfaceArea(){
        return 2*Math.PI*radius*radius+2*3.14*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

class Rectangle{
private int length;
private int height;
private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
class Sphere{
    private int radius;

    public double getRadius() {
        return 4*Math.PI*radius*radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
public class CWH_44_PS9_AccessModifiers {
    public static void main(String[] args) {
        /*
        //Problem: 1
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println(h);
//        System.out.println(myCylinder.getHeight());

        myCylinder.setRadius(4);
        int r = myCylinder.getRadius();
        System.out.println(r);

         */
/*
        //Problem: 2
//        Cylinder myCylinder = new Cylinder();
        Cylinder myCylinder = new Cylinder(9,12);
//        myCylinder.setHeight(12);
//        myCylinder.setRadius(9);
        System.out.println("Surface area of Cylinder: "+myCylinder.surfaceArea());
        System.out.println("Volume of Cylinder: "+myCylinder.volume());

 */
        /*
        //Problem: 3

        Rectangle r = new Rectangle(12,56);
//        Rectangle r = new Rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

         */

        Sphere s1 = new Sphere();
        s1.setRadius(5);
        System.out.println(s1.getRadius());

    }
}
