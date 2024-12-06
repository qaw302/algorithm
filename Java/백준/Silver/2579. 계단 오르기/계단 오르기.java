import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n+3];
        for (int i=3; i<n+3; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[n+3];
        for (int i=3; i<n+3; i++) {
            dp[i] = score[i] + Math.max(score[i-1] + dp[i-3], dp[i-2]);
        }

        System.out.println(dp[n+2]);
        br.close();
    }
}