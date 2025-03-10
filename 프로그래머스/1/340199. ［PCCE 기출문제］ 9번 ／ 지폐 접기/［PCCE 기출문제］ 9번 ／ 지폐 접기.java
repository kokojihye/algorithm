class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        wallet = sortAsc(wallet);
        bill = sortAsc(bill);
        while(true) {
            if(wallet[0] >= bill[0] && wallet[1] >= bill[1]) {
                break;
            } else {
                answer++;
                bill[1] /= 2;
                bill = sortAsc(bill);
            }
        }
        return answer;
    }

    public int[] sortAsc(int[] array) {
        int max = Math.max(array[0], array[1]);
        if(max != array[1]) {
            array[0] = array[1];
            array[1] = max;
        }
        return array;
    }
}