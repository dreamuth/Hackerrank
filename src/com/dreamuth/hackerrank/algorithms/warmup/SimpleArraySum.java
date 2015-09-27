package com.dreamuth.hackerrank.algorithms.warmup;

import com.dreamuth.hackerrank.Solution;

import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class SimpleArraySum implements Solution
{
    @Override
    public void solve()
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;
        for (int i=0; i<count; i++)
            sum += scanner.nextInt();
        System.out.println(sum);
    }
}
