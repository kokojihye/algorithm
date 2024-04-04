import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        Stack<String> card1 = new Stack<>();
        Stack<String> card2 = new Stack<>();
        
        for(int i = cards1.length -1; i >= 0; i--) {
            card1.push(cards1[i]);
        }
        for(int i = cards2.length -1; i >= 0; i--) {
            card2.push(cards2[i]);
        }
        
        for(int i = 0; i < goal.length; i++) {
            if(!card1.isEmpty() && goal[i].equals(card1.peek())) {
                card1.pop();
            } else if(!card2.isEmpty() && goal[i].equals(card2.peek())) {
                card2.pop();
            } else {
                return answer;
            }
        }
        answer = "Yes";
        return answer;
    }
}