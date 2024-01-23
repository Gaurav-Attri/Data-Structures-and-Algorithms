public class Test {
    public static void main(String[] args){
        SLLQueue<Integer> q1 = new SLLQueue<>();
        SLLQueue<String> q2 = new SLLQueue<>();

        System.out.println("q1 is empty: " + q1.isEmpty());
        System.out.println("q2 is empty: " + q2.isEmpty() + "\n");

        q1.dequeue();
        q2.dequeue();

        q1.printDetails("q1");
        q2.printDetails("q2");

        q1.enqueue(1);
        q2.enqueue("Rohan");

        q1.printDetails("q1");
        q2.printDetails("q2");

        q1.enqueue(2);
        q2.enqueue("Singh");

        q1.printDetails("q1");
        q2.printDetails("q2");

        q1.enqueue(3);
        q2.enqueue("Chadda");

        q1.dequeue();
        q2.dequeue();

        q1.printDetails("q1");
        q2.printDetails("q2");

        System.out.println("The element at the front of q1: " + q1.peek());
        System.out.println("The element at the front of q2: " + q2.peek() + "\n");

        q1.printDetails("q1");
        q2.printDetails("q2");

        System.out.println("q1 is empty: " + q1.isEmpty());
        System.out.println("q2 is empty: " + q2.isEmpty() + "\n");

        System.out.println("q1 contains 5: " + q1.contains(5));
        System.out.println("q2 contains Rohit: " + q2.contains("Rohit") + "\n");

        System.out.println("q1 contains 2: " + q1.contains(2));
        System.out.println("q2 contains Chadda: " + q2.contains("Chadda") + "\n");

        q1.dequeue();
        q2.dequeue();

        q1.printDetails("q1");
        q2.printDetails("q2");

        q1.dequeue();
        q2.dequeue();

        q1.printDetails("q1");
        q2.printDetails("q2");

    }
}
