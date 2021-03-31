package Object_Oriented_Thinking;

//class Iphone
//{
//    public void showConfig()
//    {
//        System.out.println("2 GB, IOS 9.3");
//    }
//}
//
//class Samsung54
//{
//    public void showConfig()
//    {
//        System.out.println("2 GB, Lolipop");
//    }
//}

public class Abstract_Class_2 {
    public static void main(String[] args) {
        ///////////////////////////////////
        Iphone obj = new Iphone();
//        showConfig(obj);
        obj.showConfig();

        Samsung54 obj1 = new Samsung54();
//        show(obj1);
        obj1.showConfig();
        ///////////////////////////////////

    }
    ///////////////////////////////////
//    public static void show(Iphone obj)
//    {
//        obj.showConfig();
//    }
//    public static void show(Samsung54 obj)
//    {
//        obj.showConfig();
//    }
    //Instead of creating two methods we can create one method
        //parameter? Iphone or Samsung

    //We can use abstraction here
    ///////////////////////////////////
}

abstract class phone
{
    //HERE WE CAN MAKE METHODS WITHOUT ABSTRACT ALSO
    public abstract void showConfig();
}

class Iphone extends phone
{
    public void showConfig()
    {
        System.out.println("2 GB, IOS 9.3");
    }
}

class Samsung54 extends phone
{
    public void showConfig()
    {
        System.out.println("2 GB, Lolipop");
    }
}
//REF: 8.18 T