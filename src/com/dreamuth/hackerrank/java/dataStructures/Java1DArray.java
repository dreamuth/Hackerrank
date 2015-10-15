package com.dreamuth.hackerrank.java.dataStructures;

import com.dreamuth.hackerrank.Solution;

import java.util.*;

/**
 * Created by DreamUth on 2015-09-28.
 */
public class Java1DArray implements Solution
{
    private List<Integer> input = Collections.emptyList();
    private List<Integer> history = Collections.emptyList();
    private List<Integer> blocked = Collections.emptyList();
    private int index;
    private int jumpSize;
    private Scanner scanner;

    @Override
    public void solve()
    {
        scanner = new Scanner(System.in);
        int noOfTest = scanner.nextInt();
        for (int i = 0; i < noOfTest; i++)
        {
            processTest();
        }
    }

    private void processTest()
    {
        index = 0;
        int count = scanner.nextInt();
        jumpSize = scanner.nextInt();
        input = new ArrayList<>(count);
        history = new ArrayList<>();
        blocked = new ArrayList<>();
        history.add(0);
        for (int i = 0; i < count; i++)
        {
            input.add(scanner.nextInt());
        }
        solveList();
    }

    private void solveList()
    {
        boolean result = false;
        while (hasNextStep() || hasNextJump() || hasPreviousStep() || hasHistory())
        {
            if (isReached())
            {
                result = true;
                break;
            }
            if (hasNextStep())
                moveNextStep();
            else if (hasNextJump())
                moveNextJump();
            else
            {
                blocked.add(index);
                history.remove(history.size() - 1);
                if (hasPreviousStep())
                    movePreviousStep();
                else if (hasHistory())
                    moveToHistory();
            }
        }
        System.out.println(result ? "YES" : "NO");
    }

    private boolean hasNextStep()
    {
        return getNextStep() > 0 ;
    }

    private int getNextStep()
    {
        int newIndex = index + 1;
        return isNewIndexValid(newIndex) ? newIndex : -1;
    }

    private boolean isNewIndexValid(int newIndex)
    {
        return (newIndex >= input.size() || (input.get(newIndex) == 0 && !blocked.contains(newIndex)));
    }

    private void moveNextStep()
    {
        if (hasNextStep())
        {
            index++;
            history.add(index);
        }
    }

    private boolean hasNextJump()
    {
        return jumpSize > 0 &&  getNextJump() > 0;
    }

    private int getNextJump()
    {
        int newIndex = index + jumpSize;
        return isNewIndexValid(newIndex) ? newIndex : -1;
    }

    private void moveNextJump()
    {
        if (hasNextJump())
        {
            index += jumpSize;
            history.add(index);
        }
    }

    private boolean isReached()
    {
        boolean result = false;
        if (index == (input.size() -1))
            result = true;
        else if (index + jumpSize >= input.size())
            result = true;
        return result;
    }

    private boolean hasPreviousStep()
    {
        return getPreviousStep() >= 0;
    }

    private int getPreviousStep()
    {
        if (index == 0)
            return -1;
        int newIndex = index - 1;
        return isNewIndexValid(newIndex) ? newIndex : -1;
    }

    private void movePreviousStep()
    {
        if (hasPreviousStep())
        {
            index--;
            if (!history.contains(index))
                history.add(index);
        }
    }

    private boolean hasHistory()
    {
        return getHistoryIndex() >= 0;
    }

    private int getHistoryIndex()
    {
        int newIndex = -1;
        if (!history.isEmpty())
        {
            newIndex = history.get(history.size() -1);
        }
        return newIndex;
    }

    private void moveToHistory()
    {
        if (hasHistory())
        {
            index = getHistoryIndex();
        }
    }
}
