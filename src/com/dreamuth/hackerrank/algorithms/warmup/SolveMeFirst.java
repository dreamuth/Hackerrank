package com.dreamuth.hackerrank.algorithms.warmup;

import com.dreamuth.hackerrank.Solution;

import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class SolveMeFirst implements Solution
{
    @Override
    public void solve()
    {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }

    static int solveMeFirst(int a, int b)
    {
        return a+b;
    }
}
