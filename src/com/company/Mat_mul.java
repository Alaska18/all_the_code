package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] a = {{1, 1}, {1, 1}};
        int[][] b = {{1, 1}, {1, 2}};
        int[][] c = matMul(a, b, 2);
        int i, j;
        for(i = 0; i < 2; i++)
        {
            for(j = 0; j < 2; j++)
            {
                System.out.println(c[i][j]);
            }
        }

    }

    public static int[][] matMul(int[][] a, int[][] b, int n)

    {
        int c[][] = new int[3][3];
        int cMid;
        int i, j, k;
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
            {
                cMid = 0;
                for(k = 0; k < n; k++)
                {
                    cMid = cMid + a[i][k]*b[k][j];
                }
                c[i][j] = cMid;
            }

        }
        return c;

    }
}
