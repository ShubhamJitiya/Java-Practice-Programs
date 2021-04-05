/*
    Write a simple Java program to illustrate use of Mathematical Function
 */
package Selection_MathFn_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.max;

public class P7_MathFN {
    public static void main(String[] args) {

        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            //FIND Square root
            System.out.print("Enter value for square root: ");
            double value = Double.parseDouble(input.readLine());
            System.out.println("The square root of " + value + " is " + Math.sqrt(value));

            //FIND MAX & MIN
            int a = 10, b =20;
            System.out.println("The maximum of " + a + " and " + b + " is " + Math.max(a,b));
            System.out.println("The Minimum of " + a + " and " + b + " is " + Math.min(a,b));

            System.out.println("The sin of " + value + " is " + Math.sin(value));
            System.out.println("The cos of " + value + " is " + Math.cos(value));
        } catch (IOException e) {
            System.out.println("Enter double or integer value");
            //            e.printStackTrace();
        }

    }
}
/*
------------------------------------------------------------------
1. Trigonometric Functions:

sin(radians) - returns sine of an angle: ANGLE SHOULD BE RADIAN
cos(radians) -
tan(radians) -

asin(radians) - returns inverse
acos(radians)
atan(radians)

toRadians(degree) - Converts angle in degrees to angle in radians
toDegree(radian)  -
------------------------------------------------------------------
2. Exponent
exp(x)
log(x)
log10(x)
pow(x,y)
sqrt(x)
------------------------------------------------------------------
3. Service Method
cell(x)
floor(x)
round(x)
max(x,y)
min(x,y)
abs(x)
 */

//RF: TP 2.2.1