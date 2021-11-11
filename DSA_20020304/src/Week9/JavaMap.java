package Week9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,String> people = new HashMap();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String phone = sc.nextLine();
            people.put(name, phone);
        }
        while(sc.hasNextLine()) {
            String query = sc.nextLine();
            if (people.containsKey(query)) {
                System.out.println(query + "=" + people.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
