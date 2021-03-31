package com.company;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n) {
//        this.name = name;
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
//        this.id = id;
        id = i;
    }

    public int getId() {
        return id;
    }
}
public class CWH_40_AccessModifiers {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();

//        Throws an error due to private modifiers
//        harry.id = 45;
//        harry.name = "Code with harry";

        harry.setName("Code with Harry");
        System.out.println(harry.getName());

        harry.setId(230);
        System.out.println(harry.getId());


    }
}
