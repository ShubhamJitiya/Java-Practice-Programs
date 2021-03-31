package com.company;

interface MyCamera{
    void takeSnap();
    void recordVideo();
}

interface Mywifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling"+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }

}
class MySmartPhone extends MyCellPhone implements Mywifi, MyCamera{
   public void takeSnap()
    {
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video ... ");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of all networks");
        String[] networkList = {"Harry", "Prashant", "Anjali 1554"};
        return networkList;
   }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}
class CWH_57_DefaultMethods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getNetworks();
        for (String item:
             ar) {
            System.out.println(item);

        }
    }

}
