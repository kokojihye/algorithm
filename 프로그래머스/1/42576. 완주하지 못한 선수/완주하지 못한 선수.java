import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hm = new HashMap<>();

        // participant 배열을 순회하며 각 이름의 등장 횟수를 세기
        Arrays.stream(participant)
                .forEach(p -> hm.put(p, hm.getOrDefault(p, 0) + 1));

        // completion 배열을 순회하며 해당 이름의 값을 1씩 줄이기
        Arrays.stream(completion)
                .forEach(c -> hm.put(c, hm.get(c) - 1));

        // 값이 0보다 큰 이름을 찾아서 반환하기
        return hm.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("");
    }
}