package com.company;

public class Main {
    static int a = 12;
    public static void main(String[] args) {
        a = 24;
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        boolean bool;
        char c;
        String s1;
        b = 12;
        b = (byte)(b/2);
        f = 3.1f;
        i = (int)f;
        d = 7.0;
        f = f*f;
        i = (int)(f*f);
        f = i/2.0f;
        bool = false;
        c = 88;
        c = 'v';
        c = (char)(c + 24);
        System.out.println(36>>2);
        int[] array = new int[10];
        for( i = 0; i < 10; i++ )
        {
            array[i] = i;
        }
        printA(10, array);
        A myA = new A(1, 2);
        //myA.a2 = 2*A.a1;
        System.out.println(A.a1 + " , " +  myA.a2);
        A.clear();
        A.B ab = new A.B();

    }
    public static void printA(int i, int[] array)
    {
        if(i == 0) return;
        else printA(i - 1, array);
        System.out.println(i - 1 + " : " + array[i - 1]);


    }

}
class A {
    static final int a1 = 10;
    int a2;
    A(int i, int j)
    {
        j = i*2;
        a2 = j;
        System.out.println(a2);
        B myb = new B();
        System.out.println(myb.a);
    }
    static int clear()
    {
        return a1;
    }
    static class B{
        private int a = 10;
        private int b;
        B(){
            System.out.println("B called");
            A mya = new A(10, 10);
            System.out.println(mya.a2 + ":");
        }
    }
}
