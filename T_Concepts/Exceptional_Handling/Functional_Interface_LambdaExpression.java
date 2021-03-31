package Exceptional_Handling;

interface abc1
{
    void show();
}

public class Functional_Interface_LambdaExpression {
    public static void main(String[] args) {
        abc1 obj = () -> System.out.println("I am the Best");
        obj.show();
    }
}
