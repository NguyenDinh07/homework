package Week8;

import java.util.List;
import java.util.Scanner;

public class countingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [] = new int[n];
        int b [] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) { // 3 4 5 6 3 1 2 4;i = 0; a[i] = 3;
            b[a[i]]++;               // b[3] = 2; b[4]
        }
        for(int i = 0; i < n; i++) {
            System.out.println("so lan xuat hien cua phan tu " + i + " la: " + b[i]);
        }
    }
}
