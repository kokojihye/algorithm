import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(char c : a.toCharArray()) {
            if(Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
                answer += c;
            } else {
                c = Character.toUpperCase(c);
                answer += c;
            }
        }
        System.out.print(answer);
    }
}