class Solution {
    public int solution(int a, int b, int n) {
        // a = 마트에 주는 빈병
        // b = 마트에서 받는 콜라
        // n = 상빈이가 가진 빈병 개수 
        int answer = 0;
        
        while(n >= a) {
            n -= a;
            n += b;
            answer+=b;
        }
        return answer;
    }
}