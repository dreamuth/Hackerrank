package com.dreamuth.hackerrank.algorithms.implementation;

import com.dreamuth.hackerrank.Solution;

import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class SherlockAndSquares implements Solution
{
    @Override
    public void solve()
    {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        long a, b, start, end;
        for (int i = 0; i < rows; i++)
        {
            a = scanner.nextLong();
            b = scanner.nextLong();

            start = Math.round(Math.sqrt(a));
            if (Math.pow(start, 2) < a)
                if (Math.pow(start+1, 2) >= a)
                    start ++;
            end = Math.round(Math.sqrt(b));
            if (Math.pow(end, 2) > b)
                end--;

            if (start <= end)
                System.out.println(end - start + 1);
            else
                System.out.println(0);
        }
    }
}
