package com.dreamuth.hackerrank.algorithms.implementation;

import com.dreamuth.hackerrank.Solution;

import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class UtopianTree implements Solution
{
    @Override
    public void solve()
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i=0; i<count; i++)
        {
            process(scanner.nextInt());
        }
    }

    private static void process(int source)
    {
        int i = 1;
        int sum = 1;
        while (i <= source)
        {
            if (i % 2 == 1)
            {
                sum *= 2;
            }
            else
            {
                sum ++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
