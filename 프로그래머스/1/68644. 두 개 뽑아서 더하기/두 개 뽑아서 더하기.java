import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i != j){
                    hs.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        int[] answer = new int[hs.size()];
        int index = 0;
        for(Integer num : hs) {
            answer[index++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }
}