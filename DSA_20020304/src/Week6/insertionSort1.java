import java.util.Scanner;

public class insertionSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        insertionSort1(a);
        print(a);
    }
    public static void insertionSort1(int[] arr) {
        int tmp = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0 ; i--) {
            if(tmp >= arr[i]) {
                 arr[i+1] = tmp;
                 print(arr);
                 break;
            } else {
                arr[i+1] = arr[i];
                print(arr);
            }
        }
    }
    public static void print(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}
