class Solution {
    boolean solution(String str) {
        int count_p = 0;
        int count_y = 0;
        for(String s : str.split("")){
            s = s.toLowerCase();
            if(s.equals("p")){
                count_p++;
            } else if(s.equals("y")) {
                count_y++;
            } else{
                continue;
            }
        }

        return count_p == count_y ? true : false;
    }
}