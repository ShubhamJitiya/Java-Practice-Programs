package com.company;

public class CWH_24_Break_Continue {
    public static void main(String[] args) {

        //Break and continue using loops

        //BREAK
//        for (int i = 0; i<5; i++) {
//            System.out.println(i);
//            System.out.println("Java is Great");
//            if(i==2) {
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        System.out.println("Loop ends here");


        //CONTINUE
        for (int i = 0; i<5; i++) {
            if(i==2) {
                System.out.println("Ending the loop");
                continue; //Skip below code and move to next iteration
            }
            System.out.println(i);
            System.out.println("Java is Great");
        }
        System.out.println("Loop ends here");


//        int i = 0;
//        while(i<5) {
//            System.out.println(i);
//            System.out.println("Java is Great");
//            if(i==2) {
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }
//        System.out.println("Loop ends here");
//
//        do {
//            System.out.println(i);
//            System.out.println("Java is Great");
//            if (i == 2) {
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }
//        while (i < 5);
//        System.out.println("Loop ends here");

    }
}
