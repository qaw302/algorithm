import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            String[] token = line.split(" ");
            System.out.println(Integer.parseInt(token[0]) + Integer.parseInt(token[1]));
        }
    }
}