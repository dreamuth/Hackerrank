package com.dreamuth.hackerrank.algorithms.warmup;

import com.dreamuth.hackerrank.Solution;

import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class AVeryBigSum implements Solution
{
    @Override
    public void solve()
    {
        Scanner sn = new Scanner(System.in);
        int count = sn.nextInt();
        long sum = 0;
        for (int i=0; i<count; i++)
            sum += sn.nextInt();
        System.out.println(sum);
    }
}
