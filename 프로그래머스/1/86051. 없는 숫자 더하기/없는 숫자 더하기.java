import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 9*10/2; // 0부터 9까지의 합
        for(int i : numbers) {
            answer -= i;
        }
        return answer;
    }
}