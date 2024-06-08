class Solution {
    public int[] solution(int[] num_list) {
        int odd = 0; // 홀수
        int even = 0; // 짝수
        for(int i : num_list) {
            if(i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int[] answer = {even, odd};
        return answer;
    }
}