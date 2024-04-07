class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer += n * 12000; // 양꼬치 n인분
        n /= 10; // 서비스로 줄 음료수 개수 구하기
        k -= n;
        if(k < 0) {
            k = 0;
        }
        answer += k * 2000;
        return answer;
    }
}