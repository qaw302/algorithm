import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=1; i<=n; i++) {
            System.out.print(" ".repeat(n-i));
            int end = i+i-1;
            for (int j=1; j<=end; j++) {
                if (j==1 || j==end || i==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
        br.close();
    }
}