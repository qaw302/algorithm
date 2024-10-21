import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int n = Integer.parseInt(br.readLine());
            int line = 2*n-1;

            for (int row=0; row<line/2; row++){
                for (int col=0; col<=n-1+row; col++) {
                    if (col>=n-1-row && col<=n-1+row){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int row=n-1; row>=0; row--){
                for (int col=0; col<=n-1+row; col++) {
                    if (col>=n-1-row && col<=n-1+row){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            
            
        } catch(IOException e) {
        }
        
    }
}