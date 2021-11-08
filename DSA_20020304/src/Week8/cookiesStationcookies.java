package RealWeek8;

import java.util.PriorityQueue;
import java.util.Scanner;

public class cookiesStationcookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        while( pq.size() > 1 && pq.peek() < k) {
            int m1 = pq.poll();
            int m2 = pq.poll();
            int m3 = m1 + m2 * 2;
            pq.add(m3);
            count++;
        }
        if( pq.size() == 1 && pq.peek() < k ) {
            System.out.println("-1");
        }
        System.out.println(count);
    }
}
