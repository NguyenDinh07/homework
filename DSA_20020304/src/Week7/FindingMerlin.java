package Week8;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class FindingMerlin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Comparable a [] = new Comparable[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(select(a,n/2));
    }
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable a[] , int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }


    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true) {

            // find item on lo to swap
            while (less(a[++i], v)) {
                if (i == hi) break;
            }

            // find item on hi to swap
            while (less(v, a[--j])) {
                if (j == lo) break;      // redundant since a[lo] acts as sentinel
            }

            // check if pointers cross
            if (i >= j) break;

            exch(a, i, j);
        }

        // put partitioning item v at a[j]
        exch(a, lo, j);

        // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return j;
    }
    public static Comparable select(Comparable a[], int k) {
        int lo = 0;
        int hi = a.length - 1;
        while(hi > lo)
        {
            int j = partition(a, lo, hi);
            if(j > k)
                hi = j-1;
            else if ( j < k)
                lo = j+1;
            else return a[k];
        }
        return a[k];
    }
}
