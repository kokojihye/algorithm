class Solution {
    public int solution(int slice, int n) {
        int pizza = 1;
        while (true) {
            if(slice * pizza / n <= 0) {
                pizza++;
            } else {
                break;
            }
        }
        
        return pizza;
    }
}