//Using Classes from java library

package Class_Objects;
import java.util.*;


public class Classes_From_Java_Library {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Today's date is: " + date);
        System.out.println("The elapsed time since Jan 1, 1970 is: "+ date.getTime());
    }
}

//    getTime()
//    setTime()
//    toString()
//    toString()
//    Date()
//    Date(long miliseconds)