import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        for(int i = 2; i <= n; i++) {
            if(n%i == 0) {
                nums.add(i);
            }
        }
        return nums.stream().mapToInt(i -> i).toArray();
    }
}
