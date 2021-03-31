package com.company;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone
{
    public void Ring(){
        System.out.println("Ringing");
    }
    public void Vibrate(){
        System.out.println("Vibrating ...");
    }
    public void CallFriend(){
        System.out.println("Calling Mukul ...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the Enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }

}
public class CWH_39_PS7 {
    public static void main(String[] args) {
        /*
Problem: 1
        Employee harry = new Employee();
        harry.setName("Code with harry");
        harry.salary = 230;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());
//Problem: 2
        CellPhone Asus = new CellPhone();

        Asus.CallFriend();
        Asus.Vibrate();
        Asus.Ring();
*/
/*
        Problem: 3
        Square sq = new Square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
*/
//        Problem: 4
        //Rectangle
//        Tommy player1 = new Tommy();
//        player1.fire();
//        player1.run();
//        player1.hit();

        //        Problem: 5




    }
}
