class Solution {
    public int[] solution(int[] numbers, String direction) {
        int size = numbers.length;
        int[] result = new int[size]; // Create a new array

        if (direction.equals("right")) {
            result[0] = numbers[size - 1]; // Last element moves to the front
            for (int i = 0; i < size - 1; i++) {
                result[i + 1] = numbers[i];
            }
        } else { // Left shift
            result[size - 1] = numbers[0]; // First element moves to the end
            for (int i = 1; i < size; i++) {
                result[i - 1] = numbers[i];
            }
        }

        return result;
    }
}
