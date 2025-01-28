import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] charArr = s.toCharArray();
        
        // answer 초기화 
        for(int i = 0; i < s.length(); i++) {
            answer[i] = -1;
        }
        
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                if(charArr[i] == charArr[j] && i != j) {
                    answer[j] = j - i;
                }
            }
            
        }
        return answer;
    }
}