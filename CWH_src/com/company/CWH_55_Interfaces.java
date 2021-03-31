package com.company;

interface Bicycle{
    int a = 45; //final default
    void applyBrake(int decrement);
    void speedup(int increment);
}
interface HornBicycle{
        void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle
{

    void blowhorn() {
        System.out.println("pee pee poo poo");
    }
        public void applyBrake(int decrement)
        {
            System.out.println("Applying Breakes");
        }
        public void speedup(int increment)
        {
            System.out.println("Applying speedup");
        }

        public void blowHornK3g(){
        System.out.println("Kabhi Khushii Kabhi gum pee pee pee pee..");
    }
        public void blowHornmhn(){
        System.out.println("Main Hoon na poo po poo poo...");
    }

}
public class CWH_55_Interfaces {
    public static void main(String[] args) {
    AvonCycle cycleharry = new AvonCycle();
    cycleharry.applyBrake(1);
        System.out.println(cycleharry.a); //You can create properties in interfaces

//        cycleharry.a = 454;         //you can not modify the properties in interfaces as they are final
    cycleharry.blowHornK3g();
    cycleharry.blowHornmhn();
    }
}
