import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "[";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack stack = new Stack();

        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        int length = s.length();
        for (int index = 0; index < length; index++) {
            char tempChar = s.charAt(index);
            if (map.containsKey(tempChar))
                stack.push(tempChar);
            else {
                if (!stack.empty() && map.get(stack.peek()) == tempChar)
                    stack.pop();
                else
                    return false;
            }
        }


        return stack.empty();
    }

}
