import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            System.out.println(Integer.parseInt(tk.nextToken()) + Integer.parseInt(tk.nextToken()));
        }
    }
}