class Solution {
    public String solution(String my_string, int n) {
        int i = my_string.length() - n;
        System.out.println(i);
        return my_string.substring(i, my_string.length());
    }
}