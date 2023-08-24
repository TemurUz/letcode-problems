package letcode.easy.valid_parentheses;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        /**
         * valid parentheses
         */
        String s = "([()])";
        System.out.println(isValid(s));

        Stack<Integer> stack = new Stack<>();
        /**
         * push method
         */
        stack_push(stack);
        /** * pop method */
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }

    public static boolean isValid(String str) {
        Stack<Character> leftSymbol = new Stack<>();
        if (str.isEmpty()){
            return true;
        }
        for (char s : str.toCharArray()) {
            if (s == '(' || s == '{' || s == '[')
                leftSymbol.push(s);
            else if (s == ')' && !leftSymbol.isEmpty() && leftSymbol.peek() == '(')
                leftSymbol.pop();
            else if (s == '}' && !leftSymbol.isEmpty() && leftSymbol.peek() == '{')
                leftSymbol.pop();
            else if (s == ']' && !leftSymbol.isEmpty() && leftSymbol.peek() == '[')
                leftSymbol.pop();
            else
                return false;
        }
        return leftSymbol.isEmpty();
    }

    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack);
    }

    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop Operation:");

        for (int i = 0; i < 5; i++) {
            Integer y = stack.pop();
            System.out.println(y);
        }
    }

    static void stack_peek(Stack<Integer> stack) {
        Integer element = stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    static void stack_search(Stack<Integer> stack, int element) {
        int pos = stack.search(element);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }

}
