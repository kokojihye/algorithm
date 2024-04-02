class Solution {
    public int solution(int left, int right) {
        int count = 0;
        int answer = 0;
        for(int i = left; i <= right; i++) {
            count = 0; // 약수를 구할 숫자가 바뀔 때 count 초기화
            for(int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    count++;
                    if(j != i / j) {
                        count++;
                    }
                }
            }
            answer += (count % 2 == 0) ? i : -i;
        }
        return answer;
    }
}