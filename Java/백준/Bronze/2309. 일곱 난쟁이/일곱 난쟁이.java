import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarfs = new int[9];
        int sum = 0;
        for (int i=0; i<9; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
            sum += dwarfs[i];
        }
        
        OUTER_LOOP:
        for (int i=0; i<9; i++) {
            for (int j=i+1; j<9; j++) {
                if (sum - dwarfs[i] - dwarfs[j] == 100) {
                    dwarfs[i]=0;
                    dwarfs[j]=0;
                    break OUTER_LOOP;
                }
            }
        }

        Arrays.sort(dwarfs);
        for(int i=2; i<dwarfs.length; i++) {
            System.out.println(dwarfs[i]);
        }
    }
}
