class Solution {
    public int[] solution(int[] num_list) {
        int num;
        int last = num_list.length -1;
        int second = num_list.length -2;
        int[] answer = new int[num_list.length + 1];
        
        if(num_list[last] > num_list[second]) {
            num = num_list[last] - num_list[second];
        } else {
            num = num_list[last] * 2;
        }
        for(int i = 0; i < answer.length -1; i++) {
            answer[i] = num_list[i];
        }
        answer[num_list.length] = num;
        return answer;
        
    }
}