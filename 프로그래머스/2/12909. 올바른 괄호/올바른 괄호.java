import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true; // 정답 
        Stack<Character> stk = new Stack<>(); // 괄호를 담을 Stack 선언
        
        // 문자열 s의 길이가 홀수인 경우 false 
        if(s.length() % 2 == 1) {
            return false;
        }
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                stk.push(ch);
            } else {
                if(stk.isEmpty()) { 
                    return false;
                } else if(stk.peek().equals('(')){
                    stk.pop();
                } else {
                    return false;
                }
            }
        }
        if(!stk.isEmpty()) {
            answer = false;
        }
        return answer;
    }
}