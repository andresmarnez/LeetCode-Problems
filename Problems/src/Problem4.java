/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * For example, 121 is a palindrome while 123 is not.
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 *
 *
 * Follow up: Could you solve it without converting the integer to a string?
 */

public class Problem4 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(11111));
	}


	public static boolean isPalindrome(int x) {

		while (x > 9){

			int size = (int)Math.pow(10,(int)Math.round(Math.log10(x)));
			System.out.println(x/size);
			System.out.println(x%10);
			System.out.println((x%size)/10);
			if (x/size != x%10) return false;
			x = (x%size)%10;
		}

		return true;
	}

}
