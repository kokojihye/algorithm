import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] my_char = my_string.toLowerCase().toCharArray();
        Arrays.sort(my_char);
        return new String(my_char);
    }
}