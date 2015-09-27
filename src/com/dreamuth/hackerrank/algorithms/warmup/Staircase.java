package com.dreamuth.hackerrank.algorithms.warmup;

import com.dreamuth.hackerrank.Solution;

import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class Staircase implements Solution
{
    @Override
    public void solve()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1; i<=n; i++)
        {
            for (int j=n; j>0; j--)
            {
                if (j > i)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println("");
        }
    }
}
