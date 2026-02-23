import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String sr = "Racecar";
        String srlow = sr.toLowerCase();
        char[] chars = srlow.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char c : chars) {
            stack.push(c);
        }

        boolean isPalindrome = true;
        for (char c : chars) {
            if (c != stack.pop()) {
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