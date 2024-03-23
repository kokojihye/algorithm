class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] my_char = my_string.toCharArray();
        for(int i = 0; i < index_list.length; i++) {
            int j = index_list[i];
            answer += my_char[j];
        }
        return answer;
    }
}