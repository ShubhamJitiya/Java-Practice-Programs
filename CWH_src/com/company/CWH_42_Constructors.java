//Constructors and Method overloading
package com.company;

class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee()
    {
        id = 0;
        name = "Your-name-here";
    }

    public MyMainEmployee(String Myname, int Myid)
    {
        id = Myid;
        name = Myname;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}
    public class CWH_42_Constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee();
        MyMainEmployee CWharry = new MyMainEmployee("Programming with harry", 36);

//        harry.setName("Code with harry");
        System.out.println(harry.getName());
        System.out.println(harry.getId());




    }
}
