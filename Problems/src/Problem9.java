import java.nio.charset.StandardCharsets;

/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * For example, 121 is a palindrome while 123 is not.
 */
public class Problem9 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(324));
	}

	public static boolean isPalindrome(int x) {

		byte[] num = Integer.toString(x).getBytes(StandardCharsets.UTF_8);
		int leng = num.length;
		for(int i = 0; i < num.length/2; i++){
			if (num[i] != num[leng-1-i]) return false;
		}

		return true;
	}
}
