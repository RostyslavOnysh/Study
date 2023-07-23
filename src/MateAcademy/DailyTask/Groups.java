package MateAcademy.DailyTask;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;


public class Groups {
    public static boolean isValid(String string) {
        if (string.isEmpty()) {
            return true;
        }

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('[', ']');
        pairs.put('{', '}');

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : string.toCharArray()) {
            if (pairs.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || pairs.get(stack.pop()) != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(isValid("{{[()]}}([()])"));
    }
}
