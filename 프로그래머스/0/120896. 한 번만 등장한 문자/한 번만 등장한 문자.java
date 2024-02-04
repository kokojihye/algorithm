import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        HashMap<Character, Integer> sH = new HashMap<>();
        for(char x : s.toCharArray()){
            sH.put(x, sH.getOrDefault(x, 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        
        for(char key : sH.keySet()){
            if(sH.get(key) == 1) sb.append(key);
        }
        String tmp = sb.toString();
        char[] tmpArr = tmp.toCharArray();
        Arrays.sort(tmpArr);
        return new String(tmpArr);
    }
}
