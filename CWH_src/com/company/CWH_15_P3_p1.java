package com.company;

import java.util.Locale;

public class CWH_15_P3_p1 {
    public static void main(String[] args) {


        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        //Problem 2
        String text = "To My Friend";
        text = text.replace(" ", "_");
        System.out.println(text);

        //Problem 3
        String letter = "Dear <!name!>, Thanks a lot";
        letter = letter.replace("<!name!>", "Shubh");
        System.out.println(letter);

        //Problem 4
        String myString = "This string contains  double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Problem 5
        String myletter = "Dear Harry,\n\t This java course is Nice.\n\t Thanks!";
        System.out.println(myletter);









    }
}
