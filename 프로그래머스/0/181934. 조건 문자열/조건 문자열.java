class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if (n > m){
            switch(ineq) {
                case ">" -> { 
                    answer =  1;
                    break;
                }
                case "<" -> {
                    answer =  0;    
                    break;
                }
                    
            }
        }
        else if (n == m) {
            switch(eq) {
                case "=" -> {
                    answer =  1;
                    break;
                }
                case "!" -> {
                    answer =  0;
                    break;
                }
            }
        } else {
            switch(ineq) {
                case "<" -> {
                    answer =  1;
                    break;
                }
                case ">" -> {
                    answer =  0;    
                    break;
                }
            }
        }
        return answer;
    }
}