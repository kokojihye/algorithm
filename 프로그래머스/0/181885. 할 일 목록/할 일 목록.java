class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int size = 0;
        int num = 0;
        
        for(int i = 0; i < finished.length; i++) {
            if(finished[i] == false) {
                size++;
            }
        }
        
        String[] answer = new String[size];
        
        for(int i = 0; i < finished.length; i++) {
            if(finished[i] == false) {
                answer[num] = todo_list[i];
                num++;
            }
        }
        return answer;
    }
}