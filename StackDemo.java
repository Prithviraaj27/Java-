import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);

        int search = stack.search(3);
        System.out.println(search );

        int find = stack.get(1);
        System.out.println(find);

        System.out.println(stack.isEmpty());
        System.out.println(stack);

        System.out.println(stack.reversed());

        stack.removeAllElements();
        System.out.println(stack);

        System.out.println(stack.isEmpty());

        System.out.println(stack.hashCode());
    }
}