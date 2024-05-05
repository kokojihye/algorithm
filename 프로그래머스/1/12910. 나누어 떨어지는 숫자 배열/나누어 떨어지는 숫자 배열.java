import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        boolean[] check = new boolean[arr.length];
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                check[i] = true;
                count++;
            }
        }
        if(count == 0) return new int[]{-1};
        
        int j = 0;
        int[] answer = new int[count];
        for(int i = 0; i<check.length; i++) {
            if(check[i] == true) {
                answer[j] = arr[i];
                j++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}