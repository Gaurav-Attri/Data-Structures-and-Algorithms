public class DynamicArrayStackTest {
    public static void main(String[] args) {
        DynamicArrayStack<Integer> stack = new DynamicArrayStack<>();

        stack.printDetails("stack");

        stack.push(10);

        stack.printDetails("stack");

        stack.push(20);

        stack.printDetails("stack");

        stack.push(30);

        stack.printDetails("stack");

        stack.push(40);

        stack.printDetails("stack");

        stack.push(50);

        stack.printDetails("stack");

        stack.push(60);

        stack.printDetails("stack");

        System.out.println("stack peek operation gives: " + stack.peek());

    }
}
