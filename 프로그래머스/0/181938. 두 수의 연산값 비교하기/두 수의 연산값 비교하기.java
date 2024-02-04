class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str = (""+a+b);
        int answer1 = Integer.parseInt(str);
        int answer2 = 2 * a * b;

        if(answer1 > answer2) answer = answer1;
        if(answer2 > answer1) answer = answer2;
        return answer;
    }
}