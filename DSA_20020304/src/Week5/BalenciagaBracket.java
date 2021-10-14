import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class BalenciagaBracket {


    class Result {

        public static String isBalanced(String s) { // string s co san
            // Write your code here
            Stack<Character> stack23 = new Stack(); //khai bao 1 stack moi
            for (int i=0;i<s.length();i++) {
                if (s.charAt(i) =='(' || s.charAt(i) =='{' || s.charAt(i) =='[') {
                    stack23.push(s.charAt(i));
                    // string s co san cac phan tu o dong 26 thi se dc push vao stack stack23
                } else { // neu ko phai? thi`
                    if (stack23.isEmpty()) {
                        return "NO";
                    } else {
                        char pop= stack23.pop();
                        if(s.charAt(i) == ')' && pop != '(') {
                            return "NO";
                        } else if (s.charAt(i) == '}' && pop != '{')  {
                            return "NO";
                        } else if (s.charAt(i) == ']' && pop != '[') {
                            return "NO";
                        }
                    }
                }
            }
            if (stack23.isEmpty())
                return "YES";
            return "NO";
        }
    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int t = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, t).forEach(tItr -> {
                try {
                    String s = bufferedReader.readLine();

                    String result = Result.isBalanced(s);

                    bufferedWriter.write(result);
                    bufferedWriter.newLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
