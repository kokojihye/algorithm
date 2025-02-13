import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> divisors = new ArrayList<>();
        for(int i : numlist) {
            if(i % n == 0 ){
                divisors.add(i);
            }
        }
        return divisors.stream().mapToInt(Integer::intValue).toArray();
    }
}