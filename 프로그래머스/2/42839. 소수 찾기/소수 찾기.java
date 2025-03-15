import java.util.*;

class Solution {
    public int solution(String numbers) {
        // 1. 조합 가능한 모든 수 만들기
        Set<Integer> num = generatePermutations(numbers);

        // 2. 최댓값 찾기
        int max = Collections.max(num);

        // 3. 소수 찾기 (에라토스테네스의 체)
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(max); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 4. 소수 개수 세기
        int answer = 0;
        for (int i : num) {
            if (isPrime[i]) {
                answer++;
            }
        }
        return answer;
    }

    // 모든 숫자 조합(순열) 생성
    private Set<Integer> generatePermutations(String numbers) {
        Set<Integer> numSet = new HashSet<>();
        boolean[] visited = new boolean[numbers.length()];
        generatePermutationsHelper(numbers, "", visited, numSet);
        return numSet;
    }

    private void generatePermutationsHelper(String numbers, String current, boolean[] visited, Set<Integer> numSet) {
        if (!current.isEmpty()) {
            numSet.add(Integer.parseInt(current)); // 만든 숫자를 Set에 추가
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) { // 방문하지 않은 숫자만 선택
                visited[i] = true;
                generatePermutationsHelper(numbers, current + numbers.charAt(i), visited, numSet);
                visited[i] = false; // 백트래킹
            }
        }
    }
}
