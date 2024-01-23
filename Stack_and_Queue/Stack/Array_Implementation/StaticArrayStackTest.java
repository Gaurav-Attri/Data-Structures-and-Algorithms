public class StaticArrayStackTest {
    public static void main(String[] args) {
        StaticArrayStack<Integer> s1 = new StaticArrayStack<>();
        StaticArrayStack<String> s2 = new StaticArrayStack<>(10);

        System.out.println("s1 is empty: " + s1.isEmpty());
        System.out.println("s2 is empty: " + s2.isEmpty() + '\n');

        s1.printDetails("s1");
        s2.printDetails("s2");

        s1.push(10);
        s2.push("Rohit");

        System.out.println("s1 contains 50: " + s1.contains(50));
        System.out.println("s2 contains \"Bharat\": " + s2.contains("Bharat") + '\n');

        System.out.println("s1 peek operation gives: " + s1.peek());
        System.out.println("s2 peek operation gives: " + s2.peek() + '\n');

        s1.printDetails("s1");
        s2.printDetails("s2");

        s1.push(20);
        s2.push("Kumar");

        System.out.println("s1 peek operation gives: " + s1.peek());
        System.out.println("s2 peek operation gives: " + s2.peek() + '\n');

        s1.printDetails("s1");
        s2.printDetails("s2");

        s1.push(30);
        s2.push("Ram");

        System.out.println("s1 peek operation gives: " + s1.peek());
        System.out.println("s2 peek operation gives: " + s2.peek() + '\n');

        s1.printDetails("s1");
        s2.printDetails("s2");

        s1.push(40);
        s2.push("Singh");

        System.out.println("s1 peek operation gives: " + s1.peek());
        System.out.println("s2 peek operation gives: " + s2.peek() + '\n');

        s1.printDetails("s1");
        s2.printDetails("s2");

        s1.push(50);
        s2.push("Bharat");

        System.out.println("s1 contains 50: " + s1.contains(50));
        System.out.println("s2 contains \"Bharat\": " + s2.contains("Bharat") + '\n');

        System.out.println("s1 is empty: " + s1.isEmpty());
        System.out.println("s2 is empty: " + s2.isEmpty() + '\n');

        System.out.println("s1 peek operation gives: " + s1.peek());
        System.out.println("s2 peek operation gives: " + s2.peek() + '\n');

        s1.printDetails("s1");
        s2.printDetails("s2");

        s2.push("Paal");
        

        System.out.println("s1 pop operation gives: " + s1.pop());
        System.out.println("s2 pop operation gives: " + s2.pop() + '\n');

        s1.printDetails("s1");
        s2.printDetails("s2");
        
        System.out.println("s1 pop operation gives: " + s1.pop());
        System.out.println("s2 pop operation gives: " + s2.pop() + '\n');

        s1.printDetails("s1");
        s2.printDetails("s2");
        System.out.println("s1 pop operation gives: " + s1.pop());
        System.out.println("s2 pop operation gives: " + s2.pop() + '\n');

        s1.printDetails("s1");
        s2.printDetails("s2");
        System.out.println("s1 pop operation gives: " + s1.pop());
        System.out.println("s2 pop operation gives: " + s2.pop() + '\n');

        s1.printDetails("s1");
        s2.printDetails("s2");
        System.out.println("s1 pop operation gives: " + s1.pop());
        System.out.println("s2 pop operation gives: " + s2.pop() + '\n');

        s1.printDetails("s1");
        s2.printDetails("s2");

        s1.push(10);
        s2.push("Pulkit");

        s1.printDetails("s1");
        s2.printDetails("s2");

    }
}
