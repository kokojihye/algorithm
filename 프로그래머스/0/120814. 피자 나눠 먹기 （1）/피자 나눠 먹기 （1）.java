class Solution {
    public int solution(int n) {
        int pizza = 1; // 필요한 피자 수
        int slice = 7; // 피자 조각 개수
        while(true) {
            if(pizza * slice / n == 0) {
                pizza++;
            } else {
                return pizza;
            }
        }
    }
}