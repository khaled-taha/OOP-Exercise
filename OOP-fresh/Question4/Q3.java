package org.oop_fresh.Question4;

/*
*
* */

public class Q3 {

    public static void main(String args[])
    {
        String str1 = "KhaledTahaKhaled",
                str2 = "Khaled";
        System.out.println(countSubstring(str1, str2));
    }

    public static int countSubstring(String target,
                              String source)
    {
        int size1 = target.length();
        int size2 = source.length();

        // Base Case
        if (size1 == 0 || size1 < size2)
            return 0;

        // Recursive Case
        // Checking if the first
        // substring matches
        if (target.substring(0, size2).equals(source))
            return countSubstring(target.substring(1), source) + 1;

        // Otherwise, return the count
        // from the remaining index
        return countSubstring(target.substring(1), source);
    }


}

