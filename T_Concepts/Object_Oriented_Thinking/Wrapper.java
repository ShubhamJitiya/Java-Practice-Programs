//Primitive DT - int, float, double
// Everything should be object
//Boxing - wrapper - putting primitive variable
//Primtive works faster than wrapper classes
// why use? Frameworks - Hybernate

//parse int - takes string and returns int - static method
package Object_Oriented_Thinking;

public class Wrapper {
    public static void main(String[] args) {
        int i = 5; //i - primitive data type

        Integer ii = new Integer(i);//ii is reference - Wrapper class or boxing

        int j = ii.intValue(); //unboxing - unwrapping

        Integer value = i; //autom wrapping/boxing

        int k = value; //auto unboxing/unwrapping

        String str = "123";
//        int n = str;
        int n = Integer.parseInt(str);
        System.out.println(n);

    }
}
//ref: 6.7 T