class Solution {
    public String[] solution(String[] names) {
        int count = 0;
        int size = names.length / 5;
        size += names.length % 5 == 0 ? 0 : 1;
        String[] nameArr = new String[size];
        for(int i = 0; i < size; i++) {
            nameArr[i] = names[count];
            count+=5;
        }
        return nameArr;
    }
}