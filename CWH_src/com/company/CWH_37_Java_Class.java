package com.company;


class Employee1{
    int id;
    int salary;
    String name;

    public void printDetails(){
        System.out.println("My id is: " + id);
        System.out.println("and my name is " + name);
    }
    public int getSalary()
    {
        return salary;
    }
}

public class CWH_37_Java_Class {
    public static void main(String[] args) {
        System.out.println("This is our Custom class");
        Employee1 harry = new Employee1(); //Initializing a new object
        Employee1 john = new Employee1(); //Initializing a new object

        //Setting attributes for harry
        harry.id = 12;
        harry.salary = 34000;
        harry.name = "Code With Harry";

        //Setting attributes for john
        john.id = 13;
        john.salary = 12000;
        john.name = "Johan Khandelwal";

        //Printing the properties/Attribution
//        System.out.println(harry.id);
//        System.out.println(harry.name);
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}
