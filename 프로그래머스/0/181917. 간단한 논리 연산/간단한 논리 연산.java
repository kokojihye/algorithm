class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean temp1 = false;
        boolean temp2 = false;
        boolean answer = false;
        if(x1 || x2 == true) {
            temp1 = true;
        }
        if(x3 || x4 == true) {
            temp2 = true;
        }
        if(temp1 && temp2 == true) {
            answer = true;
        }
        return answer;
    }
}