import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> strSet = new HashSet<>();
        for(int i=0; i<n; i++) {
            strSet.add(br.readLine());
        }
        int result = 0;
        for (int i=0; i<m; i++) {
            if (strSet.contains(br.readLine())) {
                result ++;
            }
        }

        System.out.println(result);
    }
}
