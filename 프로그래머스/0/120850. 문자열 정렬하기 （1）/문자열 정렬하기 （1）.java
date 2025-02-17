import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> numList = new ArrayList<>();
        for(char c : my_string.toCharArray()) {
            if(Character.isDigit(c)) {
                numList.add(c - '0');
            }
        }
        int[] answer = numList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer); 
        
        return answer;
    }
}