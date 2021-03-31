package com.company;


interface MyCamera2{
    void takeSnap();
    void recordVideo();
}

interface Mywifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("calling"+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }

}

class MySmartPhone2 extends MyCellPhone2 implements Mywifi2, MyCamera2 {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording Video ... ");
    }

    public String[] getNetworks() {
        System.out.println("Getting List of all networks");
        String[] networkList = {"Harry", "Prashant", "Anjali 1554"};
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
    public void sampleMath(){
        System.out.println("math");
    }
}

    public class CWH_59_Polymorphism {
        public static void main(String[] args) {
            MyCamera2 cam1 = new MySmartPhone2();
//        cam1.getNetworks(); // Not allowed
            cam1.recordVideo();
//            cam1.sampleMath(); //Not allowed

            //Usi ke methods use honge jiska reference hoga

        }
    }
