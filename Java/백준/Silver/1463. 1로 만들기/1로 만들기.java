import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] mem = new int[n+1];

        for (int i=2; i <= n; i++) {
            if (i==2 || i==3) {
                mem[i] = 1;
            } else {
                mem[i] = mem[i-1] + 1;

                if (i%2 == 0) {
                    mem[i] = Math.min(mem[i], mem[i/2] + 1);
                }
                if (i%3 == 0) {
                    mem[i] = Math.min(mem[i], mem[i/3] + 1);
                }
            }
        }

        br.close();
        System.out.println(mem[n]);
    }
}