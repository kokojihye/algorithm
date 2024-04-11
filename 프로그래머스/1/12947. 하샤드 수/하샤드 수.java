class Solution {
    public boolean solution(int x) {
        int temp = x;
        int x_sum = 0;
        while(temp > 0) {
            x_sum += temp % 10;
            temp /= 10;
        }
        return x % x_sum == 0 ? true : false;
    }
}