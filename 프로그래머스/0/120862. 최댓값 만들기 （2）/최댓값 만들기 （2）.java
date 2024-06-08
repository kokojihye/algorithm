import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int size = numbers.length;
        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[size - 1] * numbers[size - 2];
        return Math.max(num1, num2);
    }
}