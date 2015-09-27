package com.dreamuth.hackerrank.algorithms.implementation;

import com.dreamuth.hackerrank.Solution;

import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class CaesarCipher implements Solution
{
    @Override
    public void solve()
    {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String input = scanner.next();
        int value = scanner.nextInt();

        swap(input, value);
    }

    private void swap(String input, int value)
    {
        while (value > 26) value -= 26;
        StringBuilder builder = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
            if (c >= 65 && c <= 90)
            {
                c += value;
                if (c > 90) c -= 26;
            }
            if (c >= 97 && c <= 122)
            {
                c += value;
                if (c > 122) c -= 26;
            }
            builder.append(c);
        }
        System.out.println(builder.toString());
    }
}
