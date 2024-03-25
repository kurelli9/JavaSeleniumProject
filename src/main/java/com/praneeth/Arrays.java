package com.praneeth;

public class Arrays {
    public static void main(String[] args) {
        int[] list = {5, 4, 3, 2, 1};
        System.out.println("Original Array:");
        for(int i=0;i<list.length;i++)
         System.out.print(list[i] + "  ");
     
    System.out.println();
    System.out.println("Original Array printed in reverse order:");
         for(int i=list.length-1;i>=0;i--)
         System.out.print(list[i] + "  ");
    }

}
