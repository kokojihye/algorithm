class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] num_char = num_str.toCharArray();
        for (char c : num_char) {
            answer += Character.getNumericValue(c);
        }
        return answer;
    }
}