package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] tokens = new String[n];
        String input;
        int a;
        for(a = 0; a < n; a++)
        {
            tokens[a] = sc.nextLine();
            System.out.println(tokens[a]);
        }
        input = sc.nextLine();
        System.out.println(input);*/
        int a;
        String[] a2 = {"AbCd","dEfG","GhIj"};
        String i2 = "abCdEfGhIjAbCdEfGhIj";
        String[] out = tokenize(a2, i2);
        for(a = 0; a < out.length; a++)
        {
            System.out.println(out[a] + " ");
        }



    }
    public static String[] tokenize(String[] tokenS, String input)
    {
        int len;
        String[] outTokens = new String[input.length()];
        String token;
        Token[] tokens = new Token[tokenS.length];
        int i, j;
        for(i = 0; i < tokenS.length; i++)
        {
            len = tokenS[i].length();
            token = tokenS[i];
            tokens[i] = new Token(len, token);
        }
        for(i = 1; i < tokenS.length; i++)
        {
            for(j = i; j > 0; j--)
            {
                if(tokens[j].size <= tokens[j - 1].size) break;
                else {
                    Token temp = tokens[j];
                    tokens[j] = tokens[j - 1];
                    tokens[j - 1] = temp;
                }
            }
        }
        int k = 0;
        int a = 0;
        int count = 0;
        while(input.length() > 0)
        {
            for(j = 0; j < tokenS.length; j++)
            {
                int length = tokens[j].size;
                if(input.length() >= length) {
                    System.out.println(input.substring(0, length).equals(tokens[j].getToken()) + input + " " + input.substring(0, length) + " " + tokens[j].getToken());
                    if (input.substring(0, length).equals(tokens[j].getToken())) {
                        outTokens[k++] = tokens[j].getToken();
                        a++;
                        count++;
                        input = input.substring(length);
                        break;
                    }
                }
            }
            if(input.length() >= 1)
                if(count == 0) input = input.substring(1);
            count = 0;


        }
        String[] out = new String[k];
        for(i = 0; i < k; i++)
            out[i] = outTokens[i];
        return out;
    }
}
class Token
{
    int size;
    String token;

    Token(int size, String token)
    {
        this.size = size;
        this.token = token;
    }
    public int getSize()
    {
        return this.size;
    }
    public String getToken()
    {
        return this.token;
    }
}