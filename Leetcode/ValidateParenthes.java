package Leetcode;

import java.sql.SQLOutput;
import java.util.Stack;

public class ValidateParenthes {

    public static void main(String[] args) {
       System.out.println(isValid("{[}]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i<s.length(); ++i){
            char c = s.charAt(i);
            if (isOpenParenthes(c))
                stack.push(c);
            else if (stack.empty() || getClose(stack.pop()) != c)
                return false;
        }
        return true;
    }

    public static boolean isOpenParenthes(char ch){
        return (ch == '[') || (ch == '(') || (ch == '{');
    }

    public static char getClose(char c){
        if (c == '[') return ']';
        if (c == '(') return ')';
        if (c == '{') return '}';
        return '.';
    }
}



