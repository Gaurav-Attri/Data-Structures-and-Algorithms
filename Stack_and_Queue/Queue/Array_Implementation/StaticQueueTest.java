public class StaticQueueTest {
    public static void main(String[] args) throws Exception{
        StaticArrayQueue<Integer> q1 = new StaticArrayQueue<>(6);
        System.out.println("q1 is empty: " + q1.isEmpty() + '\n');
        q1.printDetails("q1");

        q1.offer(10);
        System.out.println("q1 contains 40: " + q1.contains(40) + '\n');
        q1.printDetails("q1");
        

        q1.offer(20);
        q1.printDetails("q1");

        q1.offer(30);
        q1.printDetails("q1");

        q1.offer(40);
        System.out.println("q1 contains 40: " + q1.contains(40) + '\n');
        System.out.println("The result of poll operation on q1: " + q1.poll() + '\n');
        System.out.println("The result of peek operation on q1: " + q1.peek() + '\n');
        q1.printDetails("q1");

        q1.offer(50);
        q1.printDetails("q1");

        q1.offer(60);
        q1.printDetails("q1");
        System.out.println("q1 is empty: " + q1.isEmpty() + '\n');

    }
}
