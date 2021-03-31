package Exceptional_Handling;

interface abc{
    void show();
}
public class Anonymous_Interfaces {
    public static void main(String[] args) {

        abc obj = new abc() //Implemented interface
        {
            public void show()
            {
                System.out.println("Anything ...");
            }
        };
        obj.show();
    }
}
//Ref: T complete