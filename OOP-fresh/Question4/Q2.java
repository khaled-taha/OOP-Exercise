package org.oop_fresh.Question4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("path.extention");

        Scanner in = new Scanner(f);
        String sentences = "";
        while(in.hasNextLine()){
            sentences += in.nextLine();
        }

        int sentence = sentences.split("[.]").length;
        System.out.println(sentence);


    }
}
