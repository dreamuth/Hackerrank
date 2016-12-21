package com.dreamuth.hackerrank.algorithms.graphtheory;

import com.dreamuth.hackerrank.Solution;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Uttran Ishtalingam.
 */
public class EvenTree implements Solution
{
    @Override public void solve()
    {
        Scanner scanner = new Scanner(System.in);
        int verticeCount = scanner.nextInt();
        int edgeCount = scanner.nextInt();
        int x,y;
        List<Edge> edges = new ArrayList<>(edgeCount);
        for (int i = 0; i < edgeCount; i++)
        {
            x = scanner.nextInt();
            y = scanner.nextInt();
            Edge edge = new Edge(x, y);
            edges.add(edge);
        }

//        printTreeList(getTreeList(edges));

        int result = 0;
        for (int i = 0; i < edges.size(); i++)
        {
            final Edge remove = edges.remove(i);
//            System.out.println("Removed " + remove.toString());
            final boolean valid = isValid(edges, verticeCount);
            if (valid)
            {
                result++;
                i--;
            }
            else
                edges.add(i, remove);
        }

        System.out.println(result);
//        printTreeList(getTreeList(edges));
    }

    private boolean isValid(List<Edge> edges, int verticeCount)
    {
        final List<Set<Integer>> treeList = getTreeList(edges);
//        printTreeList(treeList);
//        System.out.println("Orphans : " + isThereAnyOrphanNode(treeList, verticeCount));
        final boolean valid = isThereAnyOrphanNode(treeList, verticeCount);
        if (valid)
        {
            return false;
        }
//        System.out.println("EvenTree : " + isEvenTree(treeList));
        final boolean evenTree = isEvenTree(treeList);
        if (!evenTree)
            return false;
//        System.out.println("IsValid : True");
        return true;
    }

    private boolean isEvenTree(List<Set<Integer>> treeList)
    {
        for (Set<Integer> tree : treeList)
        {
            if (tree.size() % 2 == 1)
                return false;
        }
        return true;
    }

//    private void printTreeList(List<Set<Integer>> treeList)
//    {
//        System.out.println("---------- Tree List Start ----------");
//        for (Set<Integer> tree : treeList)
//        {
//            System.out.println(tree);
//        }
//        System.out.println("---------- Tree List end   ----------");
//    }

    private boolean isThereAnyOrphanNode(List<Set<Integer>> treeList, int verticeCount)
    {
        for (int i=1; i<=verticeCount; i++)
        {
            boolean found = false;
            for (Set<Integer> tree : treeList)
            {
                if (tree.contains(i))
                {
                    found = true;
                    break;
                }
            }
            if (!found)
                return true;
        }
        return false;
    }

    private List<Set<Integer>> getTreeList(List<Edge> edges)
    {
        List<Set<Integer>> treeList = new ArrayList<>();
        for (Edge edge : edges)
        {
            if (!isAvailableInTree(treeList, edge.x) && !isAvailableInTree(treeList, edge.y))
            {
                final HashSet<Integer> tree = new HashSet<>();
                tree.add(edge.x);
                tree.add(edge.y);
                treeList.add(tree);
            }
            if (isAvailableInTree(treeList, edge.x))
            {
                for (Set<Integer> tree : treeList)
                {
                    if (tree.contains(edge.x))
                    {
                        tree.add(edge.y);
                    }
                }
            }
            if (isAvailableInTree(treeList, edge.y))
            {
                for (Set<Integer> tree : treeList)
                {
                    if (tree.contains(edge.y))
                    {
                        tree.add(edge.x);
                    }
                }
            }
        }
        return treeList;
    }

    private boolean isAvailableInTree(List<Set<Integer>> treeList, int i)
    {
        boolean found = false;
        for (Set<Integer> tree : treeList)
        {
            if (tree.contains(i))
                found = true;
        }
        return found;
    }

    private class Edge
    {
        private final int x;
        private final int y;

        private Edge(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        @Override public String toString()
        {
            return "Edge{" + "x=" + x + ", y=" + y + '}';
        }
    }
}
