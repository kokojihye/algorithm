class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int num1 = ((numer1 * denom2) + (numer2 * denom1));
        int num2 = (denom1 * denom2);
        int gdc = getGDC(num1, num2);
        answer[0] = num1 / gdc;
        answer[1] = num2 / gdc;
        return answer;
    }
    
    public int getGDC(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        } else {
            return getGDC(num2, num1%num2);
        }
    }
}