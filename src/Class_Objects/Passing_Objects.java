package Class_Objects;

class Box
{
    int width;
    int height;

    Box(int w, int h)
    {
        width = w;
        height = h;
    }

    //Passing object to Method
    boolean isequal(Box b)
    {
        if (this.width == b.width && this.height == b.height) //This refers to calling object
            return true;
        else
            return false;
    }

    //Passing object to Constructor
    Box(Box b)
    {
        this.width = b.width;
        this.height = b.height;
    }

    void display()
    {
        System.out.println("width is " + this.width + " and height is " + this.height);
    }

    //Static method to check two objects are equal or not
    static boolean isTwoObjectsEqual(Box b1, Box b2) //Not using (this) coz it is accessed by class name
    {
        if (b1.width == b2.width && b1.height == b2.height)
            return true;
        else
            return false;
    }

    //Returning object
    Box duplicate()
    {
//        Box temp = new Box(this);  //this = Calling object, take constructor with obj parameter
          Box temp = new Box(this.width, this.height);
          return temp;

    }


}

public class Passing_Objects {
    public static void main(String[] args) {

        Box b1 = new Box(10, 30);
        Box b2 = new Box(20,30);

        Box b3 = new Box(b1);
        Box b4 = b2.duplicate();

        b1.display();
        b3.display();


        b2.display();
        b4.display();

        //Checks b1 b2 objects are same or not
        if(b1.isequal(b2))
            System.out.println("Both b1 and b2 are equal");
        else
            System.out.println("Both b1 and b2 are not equal");

        if(Box.isTwoObjectsEqual(b1,b3))
            System.out.println("Both b1 and b3 are equal");
        else
            System.out.println("Both b1 and b3 are not equal");

//        if(b1 == b3) //INCORRECT
        //Above statement will just check reference/memory address is same or not
        //it will not check data members of b1 and b3 objects



    }
}

//Passing object in methods
//Passing objects to static methods
//Passing objects to constructor
//Returning objects from method
//ref: LL
