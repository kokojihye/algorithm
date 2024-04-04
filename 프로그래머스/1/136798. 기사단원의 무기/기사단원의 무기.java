class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] power_arr = new int[number];
        
        for(int i = 0; i < power_arr.length; i++) {
            int temp =  getCount(i+1); // arr[i]에는 기사 i+1의 약수의 개수가 담김
            power_arr[i] = (temp > limit) ? power : temp;
        }
        for(int i : power_arr) {
            System.out.print(i + " ");
            answer += i;
        }
        return answer;
    }
    
    // number가 n인 기사의 약수의 개수 구하는 메서드
    public int getCount(int n) {
        int count = 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                count++;
                if(i != n/i) {
                    count++;
                }
            }
        }
        return count;
    }
}