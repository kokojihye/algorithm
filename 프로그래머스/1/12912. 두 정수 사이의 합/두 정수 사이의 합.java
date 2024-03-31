class Solution {
    public long solution(int a, int b) {
        
        return (long)(a + b) * (Math.max(a, b) - Math.min(a, b) + 1) / 2;
    }
}