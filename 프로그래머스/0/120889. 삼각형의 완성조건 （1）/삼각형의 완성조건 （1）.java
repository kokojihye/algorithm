class Solution {
    public int solution(int[] sides) {
        int sum = 0;
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < sides.length; i++) {
            if(sides[i] > max) {
                max = sides[i];
                maxIndex = i;
            }
        }
        for(int i = 0; i < sides.length; i++) {
            if(i != maxIndex) {
                sum+= sides[i];
            }
        }
        return sum > max ? 1 : 2;
    }
}