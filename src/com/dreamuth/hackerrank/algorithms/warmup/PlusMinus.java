package com.dreamuth.hackerrank.algorithms.warmup;

import com.dreamuth.hackerrank.Solution;

import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class PlusMinus implements Solution
{
    @Override
    public void solve()
    {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        float val, pVal=0, nVal=0, zVal=0;
        for (int i = 0; i < limit; i++)
        {
            val = scanner.nextInt();
            if (val < 0)
                nVal++;
            else if (val > 0)
                pVal++;
            else
                zVal++;
        }
        float p = pVal/limit;
        float n = nVal/limit;
        float z = zVal/limit;
        System.out.printf("%.3f", p);
        System.out.println();
        System.out.printf("%.3f", n);
        System.out.println();
        System.out.printf("%.3f", z);
    }
}
