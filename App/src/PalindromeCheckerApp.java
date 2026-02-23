import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String sr = "Racecar";
        String srlow = sr.toLowerCase();

        Deque<Character> deque = new LinkedList<>();
        for (char c : srlow.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear) {
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