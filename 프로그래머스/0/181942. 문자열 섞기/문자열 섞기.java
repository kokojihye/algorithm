class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        
        for(int i = 0; i < str1.length(); i++) {
            answer += char1[i];
            answer += char2[i];
        }
        return answer;
    }
}