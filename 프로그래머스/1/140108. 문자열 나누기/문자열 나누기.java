class Solution {
    public int solution(String s) {
        char[] ch = s.toCharArray();
        char x = ch[0];
        int count = 0;
        int answer = 0;
        
        for(int i = 0; i < ch.length; i++) {
            if(count == 0) {
                x = ch[i];
            }
            if(ch[i] == x) {
                // System.out.print("x: " + x);
                // System.out.println(" ch[" + i + "]: " + ch[i]);
                count++;
            } else {
                // System.out.print("x: " + x);
                // System.out.println(" ch[" + i + "]: " + ch[i]);
                count--;
            }
            if(count == 0) {
                answer++;
            } else if(i == ch.length -1 && count != 0) {
                answer++;
            }
        }
        return answer;
    }
}