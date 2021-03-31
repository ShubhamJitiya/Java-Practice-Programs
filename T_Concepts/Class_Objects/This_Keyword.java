//Instance, local, class variable
//current instance
package Class_Objects;

class A
{
   private int x; //Instance - in the class outside a method
    //Class variable - inside a class but it is static variable

//   public A(int a)
//   {
//       x = a;
//   }
   public A(int x) //Local - inside the method
   {
//       x = x; //x is 0
       //x on the LHS is also local variable
       this.x = x; //Current instance
   }
    public void show()
    {
        System.out.println("x is " + x);
    }
}
public class This_Keyword {
    public static void main(String[] args) {
        A obj = new A(6);
        obj.show();

    }
}
