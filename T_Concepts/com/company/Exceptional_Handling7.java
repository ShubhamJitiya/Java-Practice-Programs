package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.SQLException;

// Supressing error - If we are sure to not get error
//Not handle the error
public class Exceptional_Handling7 {
    public static void main(String[] args) throws IOException, SQLException  {

        int i, j =1, k =0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        i = 8;
        System.out.println("Enter a number");
        j = Integer.parseInt(br.readLine());
        k = i+j;
        //forcefully throw exception
        if (k<10)
        {
            throw new ArithmeticException();
        }
        System.out.println("Output is: " +k );

    }
}
