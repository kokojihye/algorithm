class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        // 배열 값 2진수로 변환하고 자릿수 맞추기
        for (int i = 0; i < n; i++) {
            // arr1과 arr2의 각 요소를 이진수로 변환하여 자릿수를 맞춥니다.
            String binary1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String binary2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
            
            // 이진수로 변환한 값을 비교하여 '#' 또는 ' '을 추가합니다.
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
                    sb.append('#');
                } else {
                    sb.append(' ');
                }
            }
            
            // answer 배열에 결과 문자열을 저장합니다.
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}
