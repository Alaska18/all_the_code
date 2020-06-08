package com.company;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

import static javafx.application.Platform.exit;

public class Main {
    static int inversion = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //int a, b, found = 0;
        int array[] = new int[size];
        int i;
        for(i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int inversion = mergesort(array, 0, size - 1);
        System.out.println(inversion);
	 /*for(i = 0; i < size; i++)
     {
         a = array[i];
         b = k - a;
         found = find(b, array, size - 1, 0);
         if(found == -1) {
             continue;
         }
         else {System.out.println("found");
         exit();}

     }
	 System.out.println("notpossible");*/




    }
    static int mergesort(int[] array, int left, int right)
    {
        int inversion = 0;
        if(left < right) {
            int m = (left + right) / 2;
            inversion += mergesort(array, left, m);
            inversion += mergesort(array, m + 1, right);
            inversion += merge(array, left, right);
        }
        return inversion;
    }
    static int merge(int[] array, int left, int right)
    {
        int inversion = 0;
        int mid = (left + right)/2;
        int l = mid - left + 1;
        int r = right - mid;
        int a1[] = new int[l];
        int a2[] = new int[r];
        int i, j, k = left;
        for(i = 0; i < l; i++)
        {
            a1[i] = array[left + i];
        }
        for(j = 0; j < r; j++)
        {
            a2[j] = array[mid + 1 + j];
        }
        j= i = 0;
        while(i < l && j < r)
        {
            if(a1[i] <= a2[j])
            {
                array[k++] = a1[i++];
            }
            else{
                array[k++] = a2[j++];
                inversion = inversion + mid - i;
            }

        }
        while(i < l)
            array[k++] = a1[i++];
        while(j < r)
            array[k++] = a2[j++];
        return inversion;
    }
    /*static int find(int a, int[] array, int end, int start)
    {
        int mid;
        if(end >= start) {
            mid = start + (end - start) / 2;
            if(array[mid] == a) return array[mid];
            if(array[mid] < a) return find(a, array, mid - 1, start);
            return find(a, array, end, mid + 1);
        }
        return -1 ;
    }*/
}
