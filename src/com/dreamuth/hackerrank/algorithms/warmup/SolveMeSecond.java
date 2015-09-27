package com.dreamuth.hackerrank.algorithms.warmup;

import com.dreamuth.hackerrank.Solution;

import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class SolveMeSecond implements Solution
{
    @Override
    public void solve()
    {
        Scanner in = new Scanner(System.in);
        int t;
        int sum;
        int a,b;
        t = in.nextInt();
        for (int i=0;i<t;i++) {
            a = in.nextInt();
            b = in.nextInt();
            sum = solveMeSecond(a, b);
            System.out.println(sum);
        }
    }

    static int solveMeSecond(int a, int b)
    {
        return a+b;
    }
}
