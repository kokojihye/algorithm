class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int num = array.length / 2;
        int temp = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[num];
    }
}