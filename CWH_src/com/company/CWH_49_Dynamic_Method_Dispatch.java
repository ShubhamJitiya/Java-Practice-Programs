package com.company;

class Phone{

    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}
class SmartPhone extends Phone
{

    public void music(){
        System.out.println("Playing music...");
    }

    @Override
    public void on(){
        System.out.println("Turning on Smartphone...");
    }
}

public class CWH_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//     Phone obj = new Phone(); //Allowed
//    SmartPhone smobj = new SmartPhone(); //Allowed
//        obj.name();

        Phone obj = new SmartPhone(); //Yes it is allowed
//        SmartPhone obj2 = new Phone(); //Not allowed

        obj.showTime();
        obj.on();
//        obj.music();
    }
}
