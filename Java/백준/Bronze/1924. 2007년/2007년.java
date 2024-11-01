import java.util.*;
import java.io.*;


public class Main
{
    public static int[] max = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");

        int month = Integer.parseInt(in[0]);
        int day = Integer.parseInt(in[1]);

        int total = day;
        for (int i=0; i<month-1;i++){
            total+= max[i];
        }

        System.out.println(days[(total-1)%7]);

        br.close();
    }
}