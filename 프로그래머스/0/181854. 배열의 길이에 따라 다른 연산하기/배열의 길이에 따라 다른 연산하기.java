class Solution {
    public int[] solution(int[] arr, int n) {
        boolean isOdd = (arr.length % 2 == 0) ? false : true;
        
        if(isOdd) {
            
            for(int i = 0; i < arr.length; i++) {
                if(i % 2 == 0) {
                    arr[i] += n;
                }
            }
        } else {
            for(int i = 0; i < arr.length; i++) {
                if(i % 2 == 1) {
                    arr[i] += n;
                }
            }
        }
        return arr;
    }
}