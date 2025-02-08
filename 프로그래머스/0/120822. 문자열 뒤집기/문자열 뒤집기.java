class Solution {
    public String solution(String my_string) {
        char[] charMyString = my_string.toCharArray();
        int size = my_string.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i= size -1; i >= 0; i--) {
            sb.append(charMyString[i]);
        }
        return sb.toString();
    }
}