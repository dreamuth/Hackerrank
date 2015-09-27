package com.dreamuth.hackerrank.algorithms.implementation;

import com.dreamuth.hackerrank.Solution;

import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class SherlockAndTheBeast implements Solution
{
    @Override
    public void solve()
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i<size; i++)
        {
            findNumber(scanner.nextInt());
        }
    }

    private static void findNumber(int size)
    {
        if (size < 3 || size ==4)
            System.out.println(-1);
        else if (size == 3)
            System.out.println(getNumberWith35(3, 0));
        else
        {
            String value = getNumberCombinationOf35(size);
            System.out.println(value != null ? value : -1);
        }
    }

    private static String getNumberWith35(int numberOf5, int numberOf3)
    {
        StringBuilder builder = new StringBuilder(numberOf3 + numberOf5);
        for (int i = 0; i < numberOf5; i++)
        {
            builder.append("5");
            //if ((i+1)%3 == 0) builder.append("-");
        }
        for (int i = 0; i < numberOf3; i++)
        {
            builder.append("3");
            //if ((i+1)%5 == 0) builder.append("-");
        }
        return builder.toString();
    }

    private static String getNumberCombinationOf35(int size)
    {
        String value = null;
        for (int i = 0; i <= size; i+=5)
        {
            if ((size - i )% 3 == 0)
            {
                value = getNumberWith35(size - i, i);
                if (value != null)
                    break;
            }
        }
        return value;
    }
}
