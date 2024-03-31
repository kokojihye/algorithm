class Solution {
    public long solution(int price, int money, int count) {
        long totalConsumption = 0;
        for(int i = 1; i <= count; i++) {
            totalConsumption += price * i;
        }
        return (long)money - totalConsumption >= 0 ? 0 : totalConsumption -money;
    }
}