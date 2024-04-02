class Solution {
    public int solution(int num) {
        int answer = 0;
        while(num > 1 && answer <= 500) {
            if(num ==1) {
                break;
            }
            if(num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;
            }
            answer++;
        }
        return num == 1 ? answer : -1;
    }
}