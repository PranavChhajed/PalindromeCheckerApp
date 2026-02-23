public class PalindromeCheckerApp {
    public static void main(String[] args){
        String sr = "Racecar";
        String srlow = sr.toLowerCase();
        if (isPalindrome(srlow)) {
            System.out.println("\"" + sr + "\" is a palindrome");
        } else {
            System.out.println("\"" + sr + "\" is NOT a palindrome");
        }
    }
    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}