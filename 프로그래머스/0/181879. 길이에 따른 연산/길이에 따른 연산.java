class Solution {
    public int solution(int[] num_list) {
        int answer;
        int size = num_list.length;
        if(size <= 10) {
            answer = 1;
            for(int i = 0; i < size; i++) {
                answer *= num_list[i];
            }
        } else {
            answer = 0;
            for(int i = 0; i < size; i++) {
                answer += num_list[i];
            }
        }
        return answer;
    }
}