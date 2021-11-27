package Week11;

import java.util.*;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            sc.nextInt(arr.get(i));
        }
        int m = sc.nextInt();
        List<Integer> brr = new ArrayList<>(m);
        HashSet<Integer> sed = new HashSet<>(brr);
        for (int i = 0; i < m; i++) {
            sc.nextInt(brr.get(i));

        }
        for (int i : sed) {
            if (Collections.frequency(arr,i) < Collections.frequency(brr, i))
                list.add(i);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}