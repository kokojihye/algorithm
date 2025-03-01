import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> solution(int[] num_list, int n) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i += n) {
            result.add(num_list[i]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 3;
        System.out.println(solution(num_list, n)); // [1, 4, 7, 10]
    }
}
