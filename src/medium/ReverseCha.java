package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseCha {
    public static void main(String[] args) {
        String s = "(a(ba))";
    }
    public String reverseParentheses(String s) {

        int n = s.length();
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<n;i++) {

            if (s.charAt(i) != ')') {

                stack.push(s.charAt(i));
            } else {
                List<Character> list = new ArrayList<>();
                while (true) {

                    char t = stack.pop();
                    if (t == '(') break;
                    list.add(t);
                }

                for (char c : list) {

                    stack.push(c);
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {

            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }


}
