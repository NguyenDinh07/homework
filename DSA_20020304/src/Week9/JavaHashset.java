package Week9;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        int t = s.nextInt();//numbers of pairs
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> gioia = new HashSet<>();
        for(int i = 0; i < t; i++) {
            gioia.add(pair_left[i] +" "+ pair_right[i]);
            System.out.println(gioia.size());
        }
    }
}

