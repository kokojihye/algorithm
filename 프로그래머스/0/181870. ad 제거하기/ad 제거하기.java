import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> strList = new LinkedList<>();
        
        for(String str : strArr) {
            if(!str.contains("ad")) {
                strList.add(str);
            }
        }
        int size = strList.size();
        strArr = strList.toArray(new String[size]);
        return strArr;
    }
}