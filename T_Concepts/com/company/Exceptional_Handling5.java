package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exceptional_Handling5 {
    public static void main(String[] args) {
        int i, j = 1, k=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i = 8;
        try{
            System.out.println("Enter a number ");
            j = Integer.parseInt(br.readLine());
            k = i/j;
            System.out.println("Output is : " + k);
//            System.out.println("Bye"); // Redundency
        }
        catch(IOException e)
        {
            System.out.println("Some IO Error");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
            //            System.out.println("Bye"); // Redundency

        }
        catch (Exception e)
        {
            System.out.println("Unknown Exception");
        }
        finally {
            System.out.println("Finally Bye");
        }
    }

    }

