import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int sec = 0;
        int cnt = 0;
        while(N > 0) {
            sec++;
            cnt++;

            if (cnt > N) {
                cnt=1;
            }
            for (int i=0; i<cnt; i++) {
                N--;
            }
        }

        System.out.println(sec);
        br.close();
    }
}