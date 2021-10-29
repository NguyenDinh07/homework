package Week8;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class IntroTutorial {
    public static int introTutorial(int V, List<Integer> arr) {
    //        int a = 0;
    //        for( int i = 0; i < arr.size(); i++) {
    //            if( V == arr.get(i))
    //                a = i ;
    //        }
    //        return a;
        for(int i = 0; i < arr.size(); i++) {
            if( V == arr.get(i)) {
                binarySearch(V, arr);
            }
        }
        return binarySearch(V,arr);
    }

    public static int binarySearch(int V, List<Integer> arr) {
        int lo = 0, hi = arr.size()-1;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(V < arr.get(mid))
                hi = mid - 1;
            else if(V > arr.get(mid))
                lo = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int a = 0;
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < v; i++) {
            arr.set(i, sc.nextInt());
        }
        for(int i = 0; i < v; i++) {
            a = introTutorial(v,arr);
        }
        System.out.println(a);
    }


}
