package com.company;

public class Main {

    public static void main(String[] args) {


        int a[] = {10, -2, -1, 5, -1 , -2, 10};
        int b[] = findMax(a, 0, a.length - 1);
        int i = 0;
        for(i = b[1]; i <= b[2]; i++)
        {
            System.out.println(a[i]);
        }


    }
    public static int[] findMax(int[] array, int minIndex, int maxIndex)
    {
        if(minIndex == maxIndex){
            int a[] = {array[minIndex], minIndex, maxIndex};
            return a;
        }
        int mid = (minIndex + maxIndex)/2;
        int a1[] = findMax(array, minIndex, mid);
        int a2[] = findMax(array, mid + 1, maxIndex);
        int a3[] = findCrossMax(array, minIndex, maxIndex);
        if(a1[0] >= a2[0] && a1[0] >= a3[0]) return a1;
        if(a2[0] >= a1[0] && a2[0] >= a3[0]) return a2;
        else return a3;
    }
    public static int[] findCrossMax(int[] array, int minIndex, int maxIndex)
    {
        int sum = 0;
        int i;
        int b[] = new int[3];
        int leftSum = 0;
        int rightSum = 0;
        int left;
        int right;
        int mid = (minIndex + maxIndex)/2;
        left = right = mid;
        for(i = mid; i >= minIndex ; i--)
        {
            sum = sum + array[i];
            if(sum >= leftSum)
            {
                leftSum = sum;
                left = i;
            }
            else break;
        }
        sum = 0;
        for(i = mid + 1; i <= maxIndex; i++)
        {
            sum = sum + array[i];
            if(sum >= rightSum)
            {
                rightSum = sum;
                right = i;
            }
            else break;
        }
        b[0] = leftSum + rightSum;
        b[1] = left;
        b[2] = right;
        return b;
    }
}
