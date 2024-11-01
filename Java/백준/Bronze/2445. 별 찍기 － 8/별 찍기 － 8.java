import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=1; i<n*2; i++) {
            for (int j=1; j<=n*2; j++){
                if (i<=n) {
                    if (j > i && j <= n*2-i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if (j > n*2-i && j <= i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }

        br.close();
    }
}