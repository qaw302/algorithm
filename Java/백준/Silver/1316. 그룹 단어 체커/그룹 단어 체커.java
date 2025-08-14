import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt=0;
        for (int i=0; i<n; i++) {
            cnt += check(br.readLine());
        }

        System.out.println(cnt);
    }

    public static int check(String word) {
        Set<Character> set = new HashSet<>();
        set.add(word.charAt(0));
        for (int i=1; i<word.length(); i++) {
            char cur = word.charAt(i);
            if (set.contains(cur)) {
                if (cur != word.charAt(i-1)) {
                    return 0;
                }
            } else {
                set.add(cur);
            }
        }

        return 1;
    }
}