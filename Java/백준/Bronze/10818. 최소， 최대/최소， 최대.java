import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int min = 1000000;
        int max = -1000000;
        while (tk.hasMoreTokens()) {
            int next = Integer.parseInt(tk.nextToken());
            if(min > next) {
                min = next;
            }
            if (max < next) {
                max = next;
            }

        }

        System.out.println(String.format("%d %d", min, max));
        
        br.close();
    }
}