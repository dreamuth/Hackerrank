package com.dreamuth.hackerrank.algorithms.implementation;

import com.dreamuth.hackerrank.Solution;

import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class AngryProfessor implements Solution
{
    @Override
    public void solve()
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int n, k, val, count;
        for (int i = 0; i < size; i++)
        {
            n = scanner.nextInt();
            k = scanner.nextInt();
            count = 0;
            for (int j = 0; j < n; j++)
            {
                val = scanner.nextInt();
                if (val <=0)
                    count++;
            }
            System.out.println(count >= k ? "NO" : "YES");
        }
    }
}
