import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        int size = numbers.length;
        String[] str_numbers = new String[size];

        // 1. 숫자를 문자열로 변환
        for (int i = 0; i < size; i++) {
            str_numbers[i] = String.valueOf(numbers[i]);
        }

        // 2. Arrays.sort()를 사용하여 맞춤 정렬 (O(n log n))
        Arrays.sort(str_numbers, (a, b) -> (b + a).compareTo(a + b));

        // 3. 0이 여러 개 있는 경우 "0000..." 대신 "0" 반환
        if (str_numbers[0].equals("0")) {
            return "0";
        }

        // 4. StringBuilder 사용 (O(n))
        StringBuilder answer = new StringBuilder();
        for (String s : str_numbers) {
            answer.append(s);
        }

        return answer.toString();
    }
}
