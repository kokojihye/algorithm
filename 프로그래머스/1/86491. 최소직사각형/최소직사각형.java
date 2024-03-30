import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int w_max = Integer.MIN_VALUE;
        int h_max = Integer.MIN_VALUE;
        
        // 각 명함을 정렬 후 가로 길이 max값 구하기
        for(int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            w_max = Math.max(w_max, sizes[i][0]);
        }
        
        for (int i = 0; i < sizes.length; i++) {
          h_max = Math.max(h_max, sizes[i][1]);  
        }
        return w_max * h_max;
    }
}