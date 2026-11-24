import org.w3c.dom.ls.LSOutput;

import java.util.Stack;


public class Task1 {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{' ) {
                stack.push(ch);
            }

            else if (ch == ')' || ch == ']' || ch == '}' ) {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < input.length(); i++) {
        stack.push(input.charAt(i));
    }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }



    public static void main(String[] args ) {



        System.out.println("=== Testing Balancing Symbols ===");
        String test1 = "{[()]}";
        String test2 = "([])";
        String test3 = "[(])";
        String test4 = "((]";

        System.out.println(test1 + " -> " + isBalanced(test1));
        System.out.println(test2 + " -> " + isBalanced(test2));
        System.out.println(test3 + " -> " + isBalanced(test3));
        System.out.println(test4 + " -> " + isBalanced(test4));

        System.out.println("\n=== Testing Reversing a Word/Sentence ===");
        String original = "Data Structures";
        String reversed = reverseString(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

    }


}