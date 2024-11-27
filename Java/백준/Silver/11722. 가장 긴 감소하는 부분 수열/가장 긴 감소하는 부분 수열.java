import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Arrays;

public class Main
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        int[] dp = new int[n];
        dp[0] = 1;

        for (int i=1; i<n; i++) {
            dp[i]=1;
            for (int j=0; j<i; j++) {
                if (a[j] > a[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }

        Arrays.sort(dp);
        System.out.println(dp[n-1]);
        br.close();
    }
}