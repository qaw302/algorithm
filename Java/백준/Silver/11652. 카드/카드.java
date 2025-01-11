import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Long, Long> cards = new HashMap<>();
        for (int i=0; i<n; i++) {
            long num = Long.parseLong(br.readLine());
            long value = 1;
            if (cards.containsKey(num)) {
                value = cards.get(num)+1;
            }
            cards.put(num, value);
        }

        long result = 0;
        long maxCnt = 0;
        for (long key : cards.keySet()) {
            long value = cards.get(key);
            if (value > maxCnt) {
                result = key;
                maxCnt = value;
            } else if (value == maxCnt && key < result) {
                result = key;
            }
        }

        System.out.println(result);
        br.close();
    }
}