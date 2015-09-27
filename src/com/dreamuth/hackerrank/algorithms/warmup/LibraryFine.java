package com.dreamuth.hackerrank.algorithms.warmup;

import com.dreamuth.hackerrank.Solution;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Created by DreamUth on 2015-09-27.
 */
public class LibraryFine implements Solution
{
    @Override
    public void solve()
    {
        Scanner scanner = new Scanner(System.in);
        int date, month, year;
        date = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        LocalDate actualDate = LocalDate.of(year, month, date);
        date = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();
        LocalDate expectedDate = LocalDate.of(year, month, date);


        if (ChronoUnit.DAYS.between(expectedDate, actualDate) > 0)
        {
            if (actualDate.getYear() > expectedDate.getYear())
                System.out.println(10000);
            else if (actualDate.getMonthValue() > expectedDate.getMonthValue())
                System.out.println((actualDate.getMonth().getValue() - expectedDate.getMonth().getValue()) * 500);
            else if (actualDate.getDayOfMonth() > expectedDate.getDayOfMonth())
                System.out.println((actualDate.getDayOfMonth() - expectedDate.getDayOfMonth()) * 15);
            else System.out.println(0);
        }
        else System.out.println(0);
    }
}
