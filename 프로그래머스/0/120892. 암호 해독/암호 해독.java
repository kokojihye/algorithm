class Solution {
    public String solution(String cipher, int code) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(char c : cipher.toCharArray()) {
            if(count % code == 0) {
                sb.append(c);
            }
            count++;
        }
        return sb.toString();
    }
}