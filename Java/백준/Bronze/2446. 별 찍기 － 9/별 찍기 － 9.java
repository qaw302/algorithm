import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=1; i<=n*2-1; i++) {
            if (i < n) {
                System.out.print(" ".repeat(i-1) + "*".repeat(n*2+1-i*2));
            } else {
                System.out.print(" ".repeat(n-1-(i%n)) + "*".repeat(1+2*(i%n)));
            }
            System.out.println();
        }
        
        br.close();
    }
}