class Solution {
    public String solution(String my_string) {
        char[] my_char = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_char.length; i++) {
            if(i > 0) {
                for(int j = 0; j < i; j++) {
                    if(my_char[j] == my_char[i]) {
                        break;
                    }
                    if(j == i -1){
                        sb.append(my_char[i]);
                    }
                }
            } else {
                sb.append(my_char[i]);
            }
        }
        return sb.toString();
    }
}