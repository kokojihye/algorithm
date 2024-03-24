class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] strArr = my_string.split("");
        for(String s : strArr) {
            if(s.equals(alp)) {
                s = s.toUpperCase();
            }
            answer += s;
        }
        return answer;
    }
}