class Solution {
    public int solution(int n) {
        return (n * 6 / gcd(n, 6)) / 6;
    }
    
    public int gcd(int i, int j) {
        while(j != 0) {
            int temp = j;
            j = i % j;
            i = temp;
        }
        return i;
    }
}