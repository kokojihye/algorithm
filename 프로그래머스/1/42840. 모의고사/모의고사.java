import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        int idx1;
        int idx2;
        int idx3;
            
        for(int i = 0; i < answers.length; i++) {
            idx1 = i % 5;
            idx2 = i % 8;
            idx3 = i % 10;
            
            if(answers[i] == supo1[idx1]) {
                cnt1++;
            }
            if(answers[i] == supo2[idx2]) {
                cnt2++;
            }
            if(answers[i] == supo3[idx3]) {
                cnt3++;
            }
        }
        int max = Math.max(cnt1, Math.max(cnt2, cnt3));
        List<Integer> list = new ArrayList<>();
        if (cnt1 == max) list.add(1); // cnt1
        if (cnt2 == max) list.add(2); // cnt2
        if (cnt3 == max) list.add(3); // cnt3

        // 리스트를 배열로 변환 후 반환
        return list.stream().mapToInt(i -> i).toArray();
    }
}