import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        
        for (int i=1; i<=n; i++) {
            int num = (int) Math.sqrt(i);
            if (i == num*num) {
                dp[i]=1;
            } else {
                int min = dp[1] + dp[i-1];
                for (int j=2; j<=i/2; j++) {
                    min = Math.min(min, dp[j] + dp[i-j]);
                }
                dp[i] = min;
            }
        }
          
        System.out.println(dp[n]);
        br.close();
    }
}