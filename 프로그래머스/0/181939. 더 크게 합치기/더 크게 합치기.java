class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String answerS1 = String.valueOf(a) + String.valueOf(b);
        String answerS2 = String.valueOf(b) + String.valueOf(a);
        
        int answerI1 = Integer.parseInt(answerS1);
        int answerI2 = Integer.parseInt(answerS2);
        
        if(answerI1 > answerI2) {
            answer = answerI1;
        } else {
            answer = answerI2;
        }
        return answer;
    }
}