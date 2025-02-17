class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] my_char = my_string.toCharArray();
        char temp = my_char[num1];
        my_char[num1] = my_char[num2];
        my_char[num2] = temp;
        
        StringBuilder sb = new StringBuilder();
        for(char c : my_char) {
            sb.append(c);
        }
        return sb.toString();
    }
}