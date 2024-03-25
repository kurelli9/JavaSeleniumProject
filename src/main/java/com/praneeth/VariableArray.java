package com.praneeth;

import java.util.Arrays;
import java.util.Scanner;

public class VariableArray {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a value for list1: ");
        int value = scanner.nextInt();
        int[] list1 = new int[value];//list1 = {6,8,3,0,1}
        for (int i=0; i < list1.length; i++) {
            list1[i] = scanner.nextInt();
        }
        int temp;
        int[] list2 = new int[value];
        for (int i = 0; i < list1.length; i++) {
            temp = list1[i];
            list2[i] = temp; 
        }
        System.out.println(Arrays.toString(list2));

    }
}
