package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, result = 0, max = 0, container = 0, cobal = 0, cum = 0, maxCobal = 0, cumMax = 0, track = 0;
        for(i = 0; i < n; i++)
        {
            cobal = sc.nextInt();
            cum = cobal + sc.nextInt();
            cum = cum + sc.nextInt();
            if(i == 0)
            {
                max = cum;
                container = cobal;   // 1 2 4 ; 1 4 7; 3 3 6
                result = cum;
                maxCobal = cobal;
                track = cum;
                cumMax = cum;
            }
            else
            {
                if(cum > max)
                {
                    container = container + cobal;
                    result = result + cobal;
                    if(max + cobal >= cum)
                    {
                        cumMax = max + cobal;
                    }
                    else cumMax = cum;
                    max = cum;
                    maxCobal = cobal;
                }
                else if(cum == max)
                {
                    if(cobal >= maxCobal)
                    {
                        cumMax = cumMax + maxCobal;
                        result = result + maxCobal;
                        maxCobal = cobal;
                    }
                    else {
                        cumMax = cumMax + cobal;
                        result = result + cobal;
                    }
                    container = container + cobal;
                }
                else if(cum < max)
                {
                    if(cum + container <= result + cobal)
                        result = cum + container;
                    else if(cum + maxCobal >= max)
                    {
                        track = cum + maxCobal;
                        result = result + cobal;
                    }
                    else result = result + cobal;
                    container = container + cobal;

                }
                if(result >= track)
                {
                    track = result;
                }

            }
        }
        if(result >= cumMax && result >= track)
            System.out.println(result);
        else if(cumMax >= result && cumMax >= track)
            System.out.println(cumMax);
        else System.out.println(track);


    }
}
