class Solution {
public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i = 0; i < schedules.length; i++) {
            int today = startday;
            boolean success = true;

            for(int j = 0; j < timelogs[i].length; j++) {
               today = today % 7 == 0 ? 7 : today % 7;

                if(today != 6 && today != 7) {
                    // 평일
                    if(timeFormatting(schedules[i] + 10) < timelogs[i][j]) {
                        success = false;
                        break;
                    }
                }
                today++;
            }
            if (success) {
                answer++;
            };
        }
        return answer;
    }

    public int timeFormatting(int time) {
        int hour = time / 100;
        int minute = time % 100;
        hour += minute / 60;
        minute %= 60;
        if(hour == 24) hour = 0;
        hour *= 100;
        return hour + minute;
    }
}