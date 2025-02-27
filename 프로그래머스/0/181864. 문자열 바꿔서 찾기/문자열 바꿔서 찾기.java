class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : myString.toCharArray()) {
            if (c == 'A') {
                sb.append('B');
            } else {
                sb.append('A');
            }
        }
        String str = sb.toString();
        answer = str.contains(pat) ? 1 : 0; 
        return answer;
    }
}