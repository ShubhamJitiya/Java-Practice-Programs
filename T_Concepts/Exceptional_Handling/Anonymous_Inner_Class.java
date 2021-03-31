package Exceptional_Handling;

class A1
{
   public void show()
   {
       System.out.println(" In A show");
   }
}

//class B1 extends A1
//{
//   public void show()
//   {
//       System.out.println(" In B show");
//   }
//}


public class Anonymous_Inner_Class {
    public static void main(String[] args) {
//        A1 obj = new A1();
//        obj.show();

//        A1 obj = new B1(); //overriding
//        obj.show();
//
        A1 obj = new A1()
        {
            public void show(){
                System.out.println(" I am in B Anonymous class");
            }
        }; //without overriding changing defination of class
        obj.show();
    }
}

//Ref: T complete ..