class Solution {
    public String solution(String my_string, String letter) {
        char let = letter.charAt(0);
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()) {
            if(let != c) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}