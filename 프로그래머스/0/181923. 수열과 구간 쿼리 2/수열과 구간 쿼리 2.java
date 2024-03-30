import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            int start_index = queries[i][0];
            int end_index = queries[i][1] + 1;
            int compare_num = queries[i][2];
            
            int[] new_arr = Arrays.copyOfRange(arr, start_index, end_index);
            
            int min_greater = -1;
            for (int j = 0; j < new_arr.length; j++) {
                if (new_arr[j] > compare_num) {
                    if (min_greater == -1 || new_arr[j] < min_greater) {
                        min_greater = new_arr[j];
                    }
                }
            }
            
            answer[i] = min_greater;
        }
        return answer;
    }        
}
    