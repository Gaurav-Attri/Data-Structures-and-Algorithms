public class CircularDynamicQueueTest {
    public static void main(String[] args) throws Exception{
        CircularDynamicQueue<Integer> q1 = new CircularDynamicQueue<>();

        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);
        q1.offer(50);

        System.out.println(q1.poll());
        q1.offer(10);
        System.out.println(q1.poll());
        q1.offer(20);
        System.out.println(q1.poll());
        q1.offer(30);
        System.out.println("peek: " + q1.peek());
        System.out.println(q1.poll());
        q1.offer(40);
        System.out.println(q1.poll());
        q1.offer(50);
        System.out.println("peek: " + q1.peek());
        
        q1.offer(60);
        System.out.println(q1.poll());

        

        q1.printDetails("q1");

    }
}
