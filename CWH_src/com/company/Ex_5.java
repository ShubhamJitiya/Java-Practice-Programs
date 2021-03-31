//Number entered by user is integer or not
package com.company;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        System.out.println("Enter a Integer: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
