class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for(String s : my_string.split("")) {
            for(int i = 0; i < n; i++) {
                answer.append(s);
            }
        }
        return answer.toString();
    }
}