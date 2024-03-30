import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        boolean odd = true;
        
        for(int i = 0; i < strArr.length; i++) {
            if(odd) {
                strArr[i] = strArr[i].toLowerCase();
                odd = false;
            } else{
                strArr[i] = strArr[i].toUpperCase();
                odd = true;
            }
        }
        return strArr;
    }
}