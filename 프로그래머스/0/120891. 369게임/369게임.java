class Solution {
    public int solution(int order) {
        int answer = 0;
        String order_str = order + "";
        for(char c : order_str.toCharArray()) {
            if (c == '3' || c == '6' || c == '9') {
                answer++;
            }
        }
        return answer;
    }
}