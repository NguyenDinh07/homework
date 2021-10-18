import java.util.Scanner;

public class insertionSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        insertionSort(a);
        print(a);
    }
    public static void print(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void insertionSort(int [] arr){
        for(int i = 0;i < arr.length; i++){
            //4 2 3 6 8 a = 4
            for(int j = i; j > 0; j--)
                if (arr[j] < arr[j-1]) { // 3 4 7 5 6 2 1
                    exch(arr,j,j-1);
                }
        }
    }
    public static void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
