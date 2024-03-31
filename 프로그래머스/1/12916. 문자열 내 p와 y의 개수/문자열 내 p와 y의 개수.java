class Solution {
    boolean solution(String str) {
        int count = 0;
        for(char c : str.toLowerCase().toCharArray()) {
            if(c == 'p') {
                count++;
            } else if(c == 'y') {
                count--;
            }
        }
        return count == 0 ? true : false;
    }
}
