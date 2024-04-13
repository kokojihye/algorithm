class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long p_num = Long.valueOf(p);
        for(int i = 0; i + p.length() <= t.length(); i++) {
            Long temp  = Long.valueOf(t.substring(i, i+p.length()));
            if(temp <= p_num) answer++;
        }
        return answer;
    }
}