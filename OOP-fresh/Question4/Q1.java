package org.oop_fresh.Question4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Path.extention");
        Scanner in = new Scanner(f);
        double sum = 0;
        int lines = 0;

        while(in.hasNext()){
            lines++;
            sum += in.nextInt();
        }

        System.out.println(sum / lines);

    }
}
