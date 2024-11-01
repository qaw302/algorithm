import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i=1; i<=t; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int sum = Integer.parseInt(tk.nextToken()) + Integer.parseInt(tk.nextToken());
            System.out.println(String.format("Case #%d: %d",i, sum));
        }
    }
}