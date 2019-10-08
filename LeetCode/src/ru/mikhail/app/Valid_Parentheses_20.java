package ru.mikhail.app;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 *1) Open brackets must be closed by the same type of brackets.
 *2)Open brackets must be closed in the correct order.
 *
 *  Note that an empty string is also considered valid.
 *
 * Example 1:
 * Input: "()"
 * Output: true

 * Example 2:
 * Input: "()[]{}"
 * Output: true

 * Example 3:
 * Input: "(]"
 * Output: false

 * Example 4:
 * Input: "([)]"
 * Output: false

 * Example 5:
 * Input: "{[]}"
 * Output: true
 */

public class Valid_Parentheses_20 {

    public boolean isValid(String s) {
        if (s.equals("")){
            return true;
        }
        if (s.length() == 1){
            return false;
        }

        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> validators = new HashMap<>();
        validators.put('{', '}');
        validators.put('[', ']');
        validators.put('(', ')');

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            }
            else if (c == '}' || c == ']' || c == ')'){
                if (!stack.isEmpty() && c == validators.get(stack.peek())){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        //String input = "()[]{}";
        //String input = "(]";
        //String input = "([)]";
        //String input = "{[]}";
        //String input = "()";
        //String input = "((";
        //String input = "";
        //String input = "(()(";
        //String input = "[(({})}]";
        String input = "[({(())}[()])]";

        Valid_Parentheses_20 function = new Valid_Parentheses_20();
        System.out.println(function.isValid(input));

    }


}
