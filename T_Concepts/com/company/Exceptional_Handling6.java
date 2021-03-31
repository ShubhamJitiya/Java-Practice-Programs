package com.company;

import javax.xml.catalog.Catalog;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//Try with Resources Java 1.7
public class Exceptional_Handling6 {
    public static void main(String[] args) throws Exception{

        try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in))) // Auto de-allocate
        {
            String str = "";
            str = br.readLine();
        }
        //Not required
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }

        // DO not create this just for ---close
//        finally {
//            br.close();
//        }

    }
}
