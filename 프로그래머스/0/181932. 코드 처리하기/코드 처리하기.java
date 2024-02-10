class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        char[] codeArray = code.toCharArray();
        
        for(int idx = 0; idx < codeArray.length; idx++) {
            if(mode == 0) {
                switch (codeArray[idx]) {
                    case '1' :  mode = 1; break;
                    default: {
                        if(idx % 2 == 0){
                            ret += codeArray[idx];
                        }
                        break;
                    }
                }
            } else {
                switch (codeArray[idx]) {
                    case '1' : mode = 0; break;
                    default : {
                        if(idx % 2 == 1) {
                            ret += codeArray[idx];
                        }
                        break;
                    }
                }
            }
        }
        if(ret == "") {
            return "EMPTY";
        }
        return ret;
    }
}