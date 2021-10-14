import java.util.Scanner;

public class shelookaway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //khai bao' so mang?
        int[] arr = new int[1000];
        while (a > 0) {
            int sumleft = 0;
            int sumright = 0;
            boolean xd = false;
            int n = sc.nextInt(); // khai bao so phan tu cua mang?
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); //nhap mang?
            }
            for (int i = 0; i < n; i++)
                sumleft += arr[i]; // 5 6 8 11 sl = 30
            for (int i = 0; i < n; i++) {
                sumleft -= arr[i]; //vong 1 : sl = 25 vong 2 : Sl = 19 v3 11
                if (sumright == sumleft)
                    xd = true;
                sumright += arr[i]; // vong 1 : sr = 5 vong 2 : sr = 11;
            }
            if (xd)
                System.out.println("YEs");
            else
                System.out.println("no");
            a--;
        }
    }
}