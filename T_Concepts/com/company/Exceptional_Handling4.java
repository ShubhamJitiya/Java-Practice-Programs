package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exceptional_Handling4 {
    public static void main(String[] args) {
        int i, j = 1, k=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i = 8;
        try{
            j = Integer.parseInt(br.readLine());
            k = i/j;
        }
        catch(IOException e)
        {
            System.out.println("Some IO Error");
        }
        catch (Exception e)
        {
            System.out.println("Unknown Exception");
        }
        System.out.println(k);
    }
}
