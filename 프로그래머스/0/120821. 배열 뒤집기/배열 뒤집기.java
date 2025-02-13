class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] num_reverse_list = new int[size];
        int j = 0;
        for(int i = size - 1; i >= 0; i--) {
            num_reverse_list[j] = num_list[i];
            j++;
        }
        return num_reverse_list;
    }
}