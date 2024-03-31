import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int idx = 0;
        int min = arr[0];
        int[] answer = new int[arr.length - 1];
        
        for(int i : arr) {
            min = Math.min(min, i);
        }
        
        
        for (int i : arr) {
            if (i != min) {
                answer[idx++] = i;
            }
        }
        return answer;
    }
}
