package Class_Objects;

import java.util.Scanner;

class Calc1
{
    int num1;
    int num2;
    int result;

    //Constructor
    public Calc1() //without parameter
    {
        num1 = 5;
        num2 = 5;
        System.out.println("In Constructor ...");
    }
    public Calc1(int n) //With parameter
    {
        num1 = n;
        num2 = n;
        System.out.println("Called Second Constructor"+num1+" "+ num2);
    }
    public Calc1(double d) //With parameter
    {
        num1 = (int)d;
        System.out.println("Called Third Constructor: "+num1);
    }
    public Calc1(int num1, int num2) //With parameter
    {
//        num1 = num1;
//        num2 = num2;

        this.num2 = num2;
        this.num1 = num1;

        System.out.println("Called Fourth Constructor"+num1+" "+ num2);
    }


}

public class Constructor {
    public static void main(String[] args) {
    Calc1 obj = new Calc1(); // Constructor

        System.out.println(obj.num1);
        int n;
        System.out.println("Enter one value ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        Calc1 obj1 = new Calc1(n);

        Calc1 obj2 = new Calc1(7.5);
        Calc1 obj3 = new Calc1(7, 8);
    }
}

//Properties of Constructors
//{
////      1. Member method
//        2. Same name as Class name
//        3. It will never return any thing - Won't give error but it will not be constructor
//        4. It will be used to allocated memory
//        5. Calls automatically
////}