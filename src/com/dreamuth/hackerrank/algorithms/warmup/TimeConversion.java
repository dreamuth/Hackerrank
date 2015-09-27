package com.dreamuth.hackerrank.algorithms.warmup;

import com.dreamuth.hackerrank.Solution;

import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class TimeConversion implements Solution
{
    @Override
    public void solve()
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String val = input.substring(8);
        int hour = Integer.parseInt(input.substring(0, 2));
        if (val.compareToIgnoreCase("AM") == 0 && hour == 12) hour=0;
        if (val.compareToIgnoreCase("PM") == 0 && hour !=12) hour+=12;
        if (hour == 0)
            System.out.println("00"+ input.substring(2, 8));
        else if (hour > 12)
            System.out.println(hour + input.substring(2, 8));
        else
            System.out.println(input.substring(0, 8));
    }
}
