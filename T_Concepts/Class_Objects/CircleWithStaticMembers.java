package Class_Objects;

public class CircleWithStaticMembers {

    double radius;
    static int numberOfObjects = 0;

    CircleWithStaticMembers()
    {
        radius = 1;
        numberOfObjects++;
    }
    CircleWithStaticMembers(double newRadius)
    {
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects()
    {
        return numberOfObjects;
    }
    double getArea()
    {
        return radius*radius*Math.PI;
    }

    public static void main(String[] args) {
        System.out.println("Before Creatig Objects");
        System.out.println("The number of Circle objects is "+ CircleWithStaticMembers.numberOfObjects);

        //create c1
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();

        //Display c1 before c2 is created
        System.out.println("\n After creating c1");
        System.out.println("C1: radius (" + c1.radius + ") and number of circle objects (" + c1.numberOfObjects + ")");

        //Create c2
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);

        //modify c1
        c1.radius = 9;

        //Display c1 and c2 after c2 was created
        System.out.println("\n After creating 2 and modyfying");
        System.out.println("C1: radius (" + c1.radius + ") and number of circle objects (" + c1.numberOfObjects + ")");
        System.out.println("C2: radius (" + c2.radius + ") and number of circle objects (" + c2.numberOfObjects + ")");

    }
}
