package RealWeek8;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder b = new StringBuilder();
        for (int i = A.length() - 1; i >= 0; i--) {
            b.append(A.charAt(i));
        }
        if (b.toString().equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
