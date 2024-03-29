import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            int start = commands[i][0] -1;
            int end = commands[i][1];
            int key = commands[i][2] -1;
            
            System.out.println(start);
            System.out.println(end);
            System.out.println(key);
            
            
            int[] temp = Arrays.copyOfRange(array, start, end);
            Arrays.sort(temp);
            answer[i] = temp[key];
        }
        return answer;
    }
}