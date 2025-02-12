class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;
        int arr1Sum = 0;
        int arr2Sum = 0;
        if (arr1Size != arr2Size) {
            return (arr1Size > arr2Size) ? 1 : -1;
        } else {
            for(int i = 0; i < arr1Size; i++) {
                arr1Sum += arr1[i];
            } 
            for(int i = 0; i < arr2Size; i++) {
                arr2Sum += arr2[i];
            }
            return (arr1Sum > arr2Sum) ? 1 : (arr1Sum < arr2Sum) ? -1 :0; 
        }
    }
}