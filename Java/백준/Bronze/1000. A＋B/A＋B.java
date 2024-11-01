import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
             System.out.println(a+b); 
        } catch(IOException e) {}
    }
}
