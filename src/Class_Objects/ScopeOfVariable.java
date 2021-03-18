package Class_Objects;

public class ScopeOfVariable {
    public static void main(String[] args) {
        int age = 25; //Local Variable inside method
        System.out.println(age);
        {
            int mark = 20;
            System.out.println(mark);
            System.out.println(age);
            //Block variable
        }
        for (int counter = 10; counter <= 10 ; counter++)
        {
            System.out.println("Counter is accessable in this block only ");
        }
//        System.out.println(counter);
//        System.out.println(mark);
    }
    public static void display()
    {
//        System.out.println(age);
    }
}
