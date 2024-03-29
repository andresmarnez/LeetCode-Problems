import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You are given an array of strings products and a string searchWord.
 *
 * Design a system that suggests at most three product names from products after each character of searchWord is typed. Suggested products should have common prefix with searchWord. If there are more than three products with a common prefix return the three lexicographically minimums products.
 *
 * Return a list of lists of the suggested products after each character of searchWord is typed.
 *
 *
 *
 * Example 1:
 *
 * Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
 * Output: [
 * ["mobile","moneypot","monitor"],
 * ["mobile","moneypot","monitor"],
 * ["mouse","mousepad"],
 * ["mouse","mousepad"],
 * ["mouse","mousepad"]
 * ]
 * Explanation: products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"]
 * After typing m and mo all products match and we show user ["mobile","moneypot","monitor"]
 * After typing mou, mous and mouse the system suggests ["mouse","mousepad"]
 * Example 2:
 *
 * Input: products = ["havana"], searchWord = "havana"
 * Output: [["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]
 * Example 3:
 *
 * Input: products = ["bags","baggage","banner","box","cloths"], searchWord = "bags"
 * Output: [["baggage","bags","banner"],["baggage","bags","banner"],["baggage","bags"],["bags"]]
 *
 *
 * Constraints:
 *
 * 1 <= products.length <= 1000
 * 1 <= products[i].length <= 3000
 * 1 <= sum(products[i].length) <= 2 * 104
 * All the strings of products are unique.
 * products[i] consists of lowercase English letters.
 * 1 <= searchWord.length <= 1000
 * searchWord consists of lowercase English letters.
 */

public class Problem5 {

	public static void main(String[] args) {

		String[] strings = {"mobile","mouse","moneypot","monitor","mousepad"};
		suggestedProducts(strings,"mouse");
	}

	public static List<List<String>> suggestedProducts(String[] products, String searchWord) {

		Arrays.sort(products);
		List<List<String>> results = new ArrayList<>();
		String[] chars = searchWord.split("");
		StringBuilder search = new StringBuilder();

		int pointerX = 0;
		int pointerY = products.length - 1;

		for (String s :
				chars) {
			search.append(s);

			int times = 0;
			List<String> sList = new ArrayList<>();

			for (int i = pointerX; i <= pointerY; i++) {

				if (products[i].matches(search.toString() + ".*")){
					times++;
					sList.add(products[i]);
				} else if (times == 0){
					pointerX = i + 1;
				} else{
					pointerY = i - 1;
					break;
				}

				if (times == 3) break;
			}

			results.add(sList);
		}

		System.out.println(results);
		return results;
	}
}
