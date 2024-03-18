import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new InputStreamReader(System.in));

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String sentence = sc.nextLine();
            String[] words = sentence.split(" ");

            StringBuilder result = new StringBuilder();
            for (String word : words) {
                String[] character = word.split("");
                for (int j = character.length-1; j >= 0; j--) {
                    result.append(character[j]);
                }
                result.append(" ");
            }
            System.out.println(result.toString());

        }

    }
}
