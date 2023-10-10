
// Two words are anagrams if they contain the same letters but in a different order.
// Here are a few examples of anagram pairs:“listen” and “silent”

import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			String in1 = "Paris";
			String in2 = "Pairs";
			boolean result = isAnagram(in1, in2);
			if (result) {
				System.out.println(in1 + " and " + in2 + " are anagram.");
			} else {
				System.out.println(in1 + " and " + in2 + " are not anagram.");
			}
		}
		{
			String in1 = "Paris";
			String in2 = "Paids";
			boolean result = isAnagram(in1, in2);
			if (result) {
				System.out.println(in1 + " and " + in2 + " are anagram.");
			} else {
				System.out.println(in1 + " and " + in2 + " are not anagram.");
			}
		}
		{
			String in1 = "Paris";
			String in2 = "Pais";
			boolean result = isAnagram(in1, in2);
			if (result) {
				System.out.println(in1 + " and " + in2 + " are anagram.");
			} else {
				System.out.println(in1 + " and " + in2 + " are not anagram.");
			}
		}
	}

	private static boolean isAnagram(String str1, String str2) {

		// TODO: Implement logic to return true or false based on input pairs.

		return false;

	}

}
