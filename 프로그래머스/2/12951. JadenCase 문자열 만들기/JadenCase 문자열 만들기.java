import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        String[] array_s = s.split(" ", -1);
        for(String str : array_s) {
            if(!str.isEmpty()) {
                sb.append(Character.toUpperCase(str.charAt(0)));
                sb.append(str.substring(1));
            }
            sb.append(" ");
        }
        String answer = sb.toString();
        return answer.substring(0, answer.length() -1);
    }
}