public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string
        String sr = "Racecar";

        // Convert to lowercase for proper comparison
        String srlow = sr.toLowerCase();

        // Reverse the string
        String reversed = reverseString(srlow);

        // Check if palindrome
        if (srlow.equals(reversed)) {
            System.out.println("\"" + sr + "\" is a palindrome");
        } else {
            System.out.println("\"" + sr + "\" is NOT a palindrome");
        }
    }

    // Function to reverse a string manually
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}