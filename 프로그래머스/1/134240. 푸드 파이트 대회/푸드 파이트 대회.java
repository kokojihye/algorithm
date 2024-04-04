class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < food.length; i++) {
            if(food[i] >= 2) {
                for (int j = 0; j < food[i]/2; j++) {
                    answer.append(Integer.toString(i));
                }
            }
        }
        answer.append("0");
        for(int i = food.length -1; i >= 0; i--) {
            if(food[i] >= 2) {
                for (int j = 0; j < food[i]/2; j++) {
                    answer.append(Integer.toString(i));
                }
            }
        }
        return answer.toString();
    }
}