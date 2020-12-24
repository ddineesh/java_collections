package java_collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollectionRunnerForString {

	public static void main(String[] args) {

		String paragraph = "TThis is great season of this year!!! and it will be very very awesome thing!!!";

		Map<Character, Integer> occurences = new HashMap<Character, Integer>();

		char[] characters = paragraph.toCharArray();
		Integer integer = 0;
		for (char character : characters) {
			integer = occurences.get(character);
			if (integer == null) {
				occurences.put(character, 1);
			} else {
				occurences.put(character, integer + 1);
			}
		}

		System.out.println(" occurences Map:: " + occurences);

	}

}
