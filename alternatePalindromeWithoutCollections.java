import java.util.Scanner;

public class alternatePalindromeWithoutCollections {

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    // Function to find the second highest alternate palindrome in range
    public static int findSecondHighestAlternatePalindrome(int start, int end) {
        int firstPalindrome = -1, secondPalindrome = -1;
        boolean skip = false;

        // Traverse the range in descending order
        for (int i = end; i >= start; i--) {
            if (isPalindrome(i)) {
                if (skip) {
                    secondPalindrome = i; // Store the second alternate palindrome
                    break;
                }
                firstPalindrome = i; // Store the highest palindrome
                skip = true; // Skip the next palindrome
            }
        }

        // If we found a second alternate palindrome, return it; otherwise, return -1
        return secondPalindrome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input range from user
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        
        int result = findSecondHighestAlternatePalindrome(start, end);
        
        if (result == -1) {
            System.out.println("Not enough alternate palindromes found in the given range.");
        } else {
            System.out.println("The second highest alternate palindrome is: " + result);
        }
        
        scanner.close();
    }
}

