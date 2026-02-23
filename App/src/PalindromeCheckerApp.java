import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String sr = "Racecar";
        String srlow = sr.toLowerCase();
        char[] chars = srlow.toCharArray();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : chars) {
            stack.push(c);
            queue.add(c);
        }

        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + sr + "\" is a palindrome");
        } else {
            System.out.println("\"" + sr + "\" is NOT a palindrome");
        }
    }
}