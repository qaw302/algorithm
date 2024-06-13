import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (Character c : a.toCharArray()) {
            if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            }
        }
        
    }
}