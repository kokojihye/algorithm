import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        return Math.min(hs.size(), nums.length / 2);
    }
}