import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;
import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

import java.lang.Math;
public class sriap {
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int n,a; // khai bao so phan tu va 1 phan tu co trong mang?
        n = sc.nextInt();
        a = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        for(int i = 0; i < n; i++) { // 1 3 4 5 2 ; a = 2; a[i] - a[ok] = a
            int ok = binarySearch(arr,a+arr[i]);
           if (binarySearch(arr, ok) > 0) {
            //for(int j = i+1;j<n;j++){
                //if ( arr[j]-arr[i]==a)
                count++;
                }
            }
            out.println(count);
    }
}
