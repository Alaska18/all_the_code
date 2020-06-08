package com.company;

public class Main {

    public static void main(String[] args) {
        int [] a = {8,5,4,1,7,6,3,2};
        int [] b = {2,4,6,8,1,3,5,7};
        System.out.println(count(a, b, 3));

    }
    public static int count(int[] a, int[] b, int c)
    {
        boolean checkequal = true;
        int count = 1;
        int i;
        for(i = 0; i < a.length; i++)
        {
            if(a[i] != b[i])
            { checkequal = false; break;}
        }
        int j;
        int [] result;
        if(checkequal) return count;
        else
        {
            while(!checkequal) {
                for(i = 0; i < a.length; i++)
                {
                    if(i + c > a.length) a[i + c - a.length] = a[i];
                    else a[i + c] = a[i];
                }
                for(i = 0; i < a.length; i++)
                {
                    for(j = 0; j < b.length; j++)
                    {
                        if(a[i] == a[j]) break;
                    }
                    if(i + c > a.length)
                    {
                        if(j < i + c - a.length);
                    }

                }
            }
        }
        return count;

    }
}
