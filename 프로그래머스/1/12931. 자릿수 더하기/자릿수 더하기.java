public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (n > 0) {
            answer += n % 10; // 현재 자리수를 추출해 더하기
            n /= 10;          // n을 10으로 나눠 다음 자리로 이동
        }
        
        return answer;
    }
}
