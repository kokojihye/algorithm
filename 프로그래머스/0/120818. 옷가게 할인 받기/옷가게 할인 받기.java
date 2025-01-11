class Solution {
    public int solution(int price) {
        double salePrice = 0;
        if (price >= 100000 && price < 300000){
            salePrice = price * 0.95;
        } else if (price >= 300000 && price < 500000) {
            salePrice = price * 0.9;
        } else if (price >= 500000){
            salePrice = price * 0.8;
        } else{
            return price;
        }
        return (int) salePrice;
    }
}