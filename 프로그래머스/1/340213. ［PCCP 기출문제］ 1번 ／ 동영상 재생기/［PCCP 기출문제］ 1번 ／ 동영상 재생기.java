class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        for(String s : commands) {
            if(s.equals("next")) {
                pos = isPosInOpening(pos, op_start, op_end) ?  op_end : pos;
                pos = addTenSecond(pos);
                pos = isPosInOpening(pos, op_start, op_end) ?  op_end : pos;
                if(isPosExceedVideoLen(pos, video_len)) {
                    pos =  video_len;
                }
            } else {
                pos = isPosInOpening(pos, op_start, op_end) ?  op_end : pos;
                pos = subtractTenSecond(pos);
                pos = isPosInOpening(pos, op_start, op_end) ?  op_end : pos;
            }
        }
        return pos;
    }

    public int convertToSeconds(String time) {
        String[] parseTime = time.split(":");
        int minutes = Integer.parseInt(parseTime[0]);
        int seconds = Integer.parseInt(parseTime[1]);
        return minutes * 60 + seconds;
    }

    public String convertToTimeFormat(int seconds) {
        return String.format("%02d:%02d", seconds / 60, seconds % 60);
    }

    public String addTenSecond(String pos) {
        int totalSeconds = convertToSeconds(pos);
        return convertToTimeFormat(totalSeconds + 10);
    }

    public String subtractTenSecond(String pos) {
        int totalSeconds = convertToSeconds(pos);
        return convertToTimeFormat(Math.max(0, totalSeconds - 10));
    }

    public boolean isPosInOpening(String pos, String op_start, String op_end) {
        int pos_time = convertToSeconds(pos);
        int op_start_time = convertToSeconds(op_start);
        int op_end_time = convertToSeconds(op_end);

        return pos_time >= op_start_time && pos_time <= op_end_time;
    }

    public boolean isPosExceedVideoLen(String pos, String op_end) {
        int pos_time = convertToSeconds(pos);
        int op_end_time = convertToSeconds(op_end);
        return pos_time > op_end_time;
    }
}