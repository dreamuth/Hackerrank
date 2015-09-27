package com.dreamuth.hackerrank.algorithms.warmup;

import com.dreamuth.hackerrank.Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class DiagonalDifference implements Solution
{
    @Override
    public void solve()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> matrix = new ArrayList<List<Integer>>(n);
        for (int i=0; i<n; i++)
        {
            List<Integer> row = new ArrayList<Integer>(n);
            for (int j=0; j<n; j++)
                row.add(sc.nextInt());
            matrix.add(row);
        }
        process(matrix);
    }

    private static void process(List<List<Integer>> matrix)
    {
        long d1 = 0;
        for (int i=0; i<matrix.size(); i++)
        {
            d1 += matrix.get(i).get(i);
        }

        long d2 = 0;
        for (int i=0, j=matrix.size()-1; i<matrix.size(); i++, j--)
        {
            d2 += matrix.get(i).get(j);
        }

        System.out.println(Math.abs(d1 - d2));
    }
}
