import java.util.HashMap;
import java.util.Stack;

/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:
Input: s = "([][{}])"
Output: true

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false*/
public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isValid("()"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("([][{}])"));
		System.out.println(isValid("(]"));
	}

	public static boolean isValid(String x) {
		// Your code goes here
		
		return false;

	}

}
