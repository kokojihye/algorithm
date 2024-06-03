class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for(String s : myString.split("")) {
            if(s.equals("a") || s.equals("A")) {
                sb.append("A");
            } else {
                s = s.toLowerCase();
                sb.append(s);
            }
        }
        return sb.toString();
    }
}