 class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int original = x; // Store the original number
        int reverse = 0;
        
        while (x > 0) {
            int digit = x % 10; // Get the last digit
            reverse = reverse * 10 + digit; // Build the reverse number
            x /= 10; // Remove the last digit
        }
        
        return original == reverse;
    }
 }