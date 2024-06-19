import java.util.Arrays;
class Solution {
    public int solution(String number) {
        int[] numbers = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();
        return Arrays.stream(numbers).sum() % 9;
    }
}