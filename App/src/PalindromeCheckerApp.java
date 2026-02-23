public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String sr = "Racecar";
        String srlow = sr.toLowerCase();
        char[] chars = srlow.toCharArray();

        if (isPalindrome(chars)) {
            System.out.println("\"" + sr + "\" is a palindrome");
        } else {
            System.out.println("\"" + sr + "\" is NOT a palindrome");
        }
    }

    public static boolean isPalindrome(char[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}