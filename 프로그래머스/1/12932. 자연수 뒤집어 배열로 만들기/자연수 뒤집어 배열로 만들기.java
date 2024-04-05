import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> num_list = new LinkedList<>();
        
        while(n > 0) {
            num_list.add((int)(n % 10));
            n /= 10;
        }
        
        int[] answer = new int[num_list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = num_list.get(i);
        }
        
        return answer;
    }
}
