class Solution {
    public String solution(String my_string, String alp) {
        String s = alp.toUpperCase();
        return my_string.replaceAll(alp, s);
    }
}