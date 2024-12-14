import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            long[] dp = new long[n+2];
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;

            for (int j=3; j<=n; j++) {
                dp[j] = dp[j-2] + dp[j-3];
            }
            
            sb.append(dp[n]);
            sb.append(System.lineSeparator());
        }

        System.out.println(sb.toString());
        br.close();
    }
}