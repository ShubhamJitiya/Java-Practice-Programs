package Object_Oriented_Thinking;

public class Casting {
    public static void main(String[] args) {

        //implicit casting
        double d1 = 4; //int to double
        double d2 = 5.6f; // float to double
        long l1 = 100; // int to long
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(l1);

        //Explicit Casting - possiblity of loosing data
        int i1 = (int) 4.5; //Error - without casting
        int i2 = (int) 8L; //Error
        float f1 = (float) 4.5; //Error
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(f1);


    }
}
