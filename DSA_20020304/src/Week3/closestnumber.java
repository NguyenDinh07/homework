import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class closestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //khai bao so phan tu?
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) sc.nextLong(); //nhap mang
        }
        Arrays.sort(a);
        int  min = 9999999;
        for (int i = 0; i < n-1; i++) {  // -7 -2 1 6 9
            int diff;
            diff = a[i+1] - a[i]; // hieu 2 so canh nhau
            //
            if (diff < min) {
                min = diff;
            }
            //System.out.println(a[i]+" "+a[j]);
        }
        for (int i = 0; i < n-1; i++) {
            if (a[i+1]-a[i] == min) {
                System.out.println(a[i] + " " + a[i+1]);
            }
        }
    }
}
