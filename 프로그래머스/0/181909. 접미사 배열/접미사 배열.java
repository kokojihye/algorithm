import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        char[] my_char = my_string.toCharArray();
        String[] answer = new String[my_char.length];
        for(int i = 0; i < my_char.length; i++) {
            answer[i] = my_string.substring(i, my_char.length);
        }
        Arrays.sort(answer);
        return answer;
    }
}