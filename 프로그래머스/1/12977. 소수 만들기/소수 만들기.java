class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if(checkPrime(num) == true) {
                        System.out.println(nums[i] + ", " + nums[j] + ", " + nums[k]);
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    
    // 소수의 개수 반환하는 메서드
    public boolean checkPrime(int num) {
        boolean isPrime = false;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return isPrime;
            }
        }
        isPrime = true;
        return isPrime;
    }
}