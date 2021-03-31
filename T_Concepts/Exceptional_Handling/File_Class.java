package Exceptional_Handling;

import java.io.File;
import java.io.IOException;

public class File_Class {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\Shubh\\Documents\\Pendrive\\Study Materials\\SEM_4\\OOPS-I\\PDF\\GTU\\3140705.pdf");
        File f2 = new File("C:\\Users\\Shubh\\Documents\\Pendrive\\Study Materials\\SEM_4\\OOPS-I\\PDF\\GTU\\123.pdf");
        System.out.println("Is exist: "+f1.exists());
        System.out.println("Is exist: "+f2.exists());

        f2.createNewFile();
        System.out.println("Is exist: "+f2.exists());

        System.out.println("File size: "+f1.length());

        System.out.println("Permission to write: "+f1.canWrite());

        System.out.println("File Name: "+f1.getName());

        f2.delete();
        System.out.println("Is exist: "+f2.exists());



    }
}
