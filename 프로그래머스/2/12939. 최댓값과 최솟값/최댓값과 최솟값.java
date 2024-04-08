class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        String[] stringArray = s.split(" ");
        for(String str : stringArray) {
            max = Math.max(Integer.parseInt(str), max);
            min = Math.min(Integer.parseInt(str), min);
        }
        String answer = min + " " + max;
        return answer;
    }
}