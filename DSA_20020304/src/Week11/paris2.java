package Week11;

import java.util.HashSet;

public class paris2 {
    public static int pairs(int k, int [] arr) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            set.add(i);
        }
        for(int i = 0; i < arr.length;i ++) {
            if(set.contains(arr[i]+k))
                count++;
        }
        return count;
    }
}
