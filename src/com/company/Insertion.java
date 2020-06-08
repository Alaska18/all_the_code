package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int i;
        for(i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }
        insertionSort(array, size);
    }
    public static void insertionSort(int[] array, int size)
    {
        int j, i;
        for(j = 1; j < size; j++)
        {
            for(i = j; i > 0; i--)
            {
                if(array[i] <= array[i - 1]) break;
                else {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }
        for(i = 0; i < size; i++)
        {
            System.out.println(array[i]);
        }

    }
}
