package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {1362,1066,1659,2010,1912,1720,1851,1593,1799,1805,1139,1493,1141,1163,1211};
        System.out.println(restoreY(a));
    }
    public static int restoreY(int[] A)
    {
        int i, j, y;
        for(i = 0; i < A.length; i++)
        {
            y = 0b11111111111111111111;
            for(j = 0; j < A.length; j++)
            {
                if(j != i) y = y&A[j];
            }
            if(y == A[i]) return A[i];

        }
        return -1;
    }
}
