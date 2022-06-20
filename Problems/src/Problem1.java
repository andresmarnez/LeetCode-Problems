import java.lang.invoke.CallSite;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * You are given an array of words where each word consists of lowercase English letters.
 *
 * wordA is a predecessor of wordB if and only if we can insert exactly one letter anywhere in wordA without changing the order of the other characters to make it equal to wordB.
 *
 * For example, "abc" is a predecessor of "abac", while "cba" is not a predecessor of "bcad".
 * A word chain is a sequence of words [word1, word2, ..., wordk] with k >= 1, where word1 is a predecessor of word2, word2 is a predecessor of word3, and so on. A single word is trivially a word chain with k == 1.
 *
 * Return the length of the longest possible word chain with words chosen from the given list of words.
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["a","b","ba","bca","bda","bdca"]
 * Output: 4
 * Explanation: One of the longest word chains is ["a","ba","bda","bdca"].
 * Example 2:
 *
 * Input: words = ["xbc","pcxbcf","xb","cxbc","pcxbc"]
 * Output: 5
 * Explanation: All the words can be put in a word chain ["xb", "xbc", "cxbc", "pcxbc', 'pcxbcf'].
 * Example 3:
 *
 * Input: words = ['abcd','dbqca']
 * Output: 1
 * Explanation: The trivial word chain ['abcd'] is one of the longest word chains.
 * ['abcd','dbqca'] is not a valid word chain because the ordering of the letters is changed.
 *
 *
 * Constraints:
 *
 * 1 <= words.length <= 1000
 * 1 <= words[i].length <= 16
 * words[i] only consists of lowercase English letters.
 */

public class Problem1 {

	public static void main(String[] args) {

		String[] strings = {"a","ab","ac","bd","abc","abd","abdd"};
		System.out.println(longestStrChain(strings));
	}

	public static int longestStrChain(String[] words) {

		List<String> list = Arrays.asList(words);
		list.sort(Comparator.comparingInt(String::length));
		String lastString;

		String regEx;
		int maxSize = 0;
		int previousLength, possibleLength;

		for (String basicCase : list){

			lastString = basicCase;
			int currentSize = 1;
			previousLength = lastString.length();

			for (String possible:
				 list) {

				possibleLength = possible.length();

				if (possibleLength <= previousLength) continue;
				else if(possibleLength > previousLength + 1) break;
				else {


					regEx = "[a-z]?" + lastString.chars().mapToObj(c -> (char) c + "[a-z]?").reduce("", (text, c) -> text+c);
					System.out.println(regEx );

					if (possible.matches(regEx)) {
						lastString = possible;
						previousLength = possibleLength;
						currentSize++;
					}
				}
			}

			if (currentSize > maxSize){
				maxSize = currentSize;
			}
		}

		return maxSize;
	}

}
