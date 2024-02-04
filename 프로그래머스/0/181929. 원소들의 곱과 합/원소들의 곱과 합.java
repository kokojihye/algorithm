class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
        int squared = 0;
        
        for (int i : num_list) {
            multiply *= i;
            squared += i;
        }
        squared *= squared;
        return (multiply < squared) ? 1 : 0;
    }
}