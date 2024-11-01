import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine(), ",");
            sb.append(Integer.parseInt(tk.nextToken()) + Integer.parseInt(tk.nextToken()) + "\n");
        }
        System.out.print(sb.toString());
        br.close();
    }
}