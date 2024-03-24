class Solution {
    public String solution(String s) {
        char temp;
        char[] c = s.toCharArray();
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                if(c[i] < c[j]) {
                    temp = c[j];
                    c[j] = c[i];
                    c[i] = temp;
                }
            }
        }
        for(char ch : c) {
            answer += ch;
        }
        return answer;
    }
}