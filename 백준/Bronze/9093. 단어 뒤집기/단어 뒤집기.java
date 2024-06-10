import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(in.readLine());
    for (int i = 0; i < count; i++) {
      StringTokenizer st = new StringTokenizer(in.readLine());
      while (st.hasMoreTokens()) {
        System.out.println(new StringBuilder(st.nextToken()).reverse().toString());
      }
    }
  }
}
