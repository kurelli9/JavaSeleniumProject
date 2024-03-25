package com.HackerRanker;

import java.util.Arrays;

public class SortingOrder {
    public static void main(String[] args) {
        char[] a = {'e','l','e','p','h','a','n','t'};
        quickSort(a, 0, a.length - 1);
        System.out.print("sorting of characters: ");
        for (char c:a) {
            System.out.print(c +" ");
        }

    }

    private static void quickSort(char[] a, int low, int high) {
        if (low < high) {
            int pi = partison(a, low, high);
            quickSort(a, low, pi -1);
            quickSort(a, pi + 1, high);
        }
       
    }

    private static int partison(char[] a, int low, int high) {
        char pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        char temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        return i + 1;
    }

}

