package com.dreamuth.hackerrank.algorithms.implementation;

import com.dreamuth.hackerrank.Solution;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Uttran Ishtalingam.
 */
public class SockMerchant implements Solution
{
    @Override public void solve()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        Map<Integer, Integer> res = new HashMap<>(n);
        for (int i : c)
        {
            final Integer value = res.get(i);
            if (value == null)
            {
                res.put(i, 1);
            }
            else
            {
                res.put(i, value + 1);
            }
        }

        int sum = 0;
        for (int value : res.values())
        {
            sum += (value / 2);
        }
        System.out.println(sum);
    }
}
