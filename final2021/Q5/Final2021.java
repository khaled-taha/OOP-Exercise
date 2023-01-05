package final2021.Q5;

import java.util.Arrays;
import java.util.Scanner;

public class Final2021 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // a)
        /*
        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter your elements : ");
        for(int i = 0; i < size; i++) arr[i] = in.nextInt();
        */
        
        //*************************************
        // b)
        /*
        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter your elements : ");
        for(int i = 0; i < size; i++) arr[i] = in.nextInt();
        System.out.println(checkContainSubArray(arr));
        */
    }

    public static void formLargestNumber(int[] arr){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    
    public static boolean checkContainSubArray(int[] arr){
        int sum = 0;
        int length;
        
        if(arr.length < 4) return false;
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length - 3; i++){
            for(int j = i + 1; j < arr.length - 2; j++){
                for(int k = i + 2; k < arr.length - 1; k++){
                    for(int p = i + 3; p < arr.length; p++){
                        sum = arr[i] + arr[j] + arr[k] + arr[p];
                        if(sum == 0) return true;
                    }
                }
            }
        }
        
        return false;
    }
}

