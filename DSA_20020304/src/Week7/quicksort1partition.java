package Week8;

import java.util.Scanner;

public class quicksort1partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        partition(a);
    }
    public static void partition(int[] ar) {

        int[] lesser = new int[ar.length];
        int[] greater = new int[ar.length];

        int lessCount = 0, greatCount = 0;
        int pivot = ar[0];

        for (int i = 1; i < ar.length; i++) {
            int value = ar[i];
            if (value < pivot) {
                lesser[lessCount++] = value;
            } else {
                greater[greatCount++] = value;
            }
        }
        lesser[lessCount++] = pivot;
        System.arraycopy(greater, 0, lesser, lessCount, greatCount);
        print(lesser);
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable a[] , int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    //4 5 3 7 2
    //pivot = ar[0]
//    int value = ar[i];        i = 1
//         if(ar[i] < pivot)    ar[1] = 5 !< 4 => line 57  ar[3] = 7 !< 4 => line 57
//    {                         ar[2] = 3 < 4  => line 56  ar[4] = 2 < 4  => line 56
//        lessers[lessCount++] = value; lessesrs[1] = 3 // lessers[2] = 2;
//    }
//         else
//
//        greaters[greatCount++] = value;   greaters[1] = 5 // greater[2] = 7
//    }
//}
//
//      lessers[lessCount++] = pivot;   //lesser[2] = 4;
    public static void print(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
