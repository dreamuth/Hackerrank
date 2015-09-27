package com.dreamuth.hackerrank.algorithms.warmup;

import com.dreamuth.hackerrank.Solution;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class ExtraLongFactorials implements Solution
{
    @Override
    public void solve()
    {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        BigInteger result = BigInteger.ONE;
        for (int i=1; i<=value; i++)
        {
            result = BigInteger.valueOf(i).multiply(result);
        }
        System.out.println(result);
    }
}
