public class Test{
    public static void main(String[] args){
        SLLStack<Integer> s1 = new SLLStack<>();
        System.out.println("s1 empty?: " + s1.isEmpty());
        System.out.println("s1 contains 5: " + s1.search(5));
        System.out.println("s1 size: " + s1.size());
        System.out.println("s1: " + s1);

        s1.push(10);
        s1.push(9);
        s1.push(8);

        System.out.println("s1 size: " + s1.size());
        System.out.println("s1: " + s1);
        System.out.println("s1 top element: " + s1.peek());

        s1.pop();
        
        System.out.println("s1 size: " + s1.size());
        System.out.println("s1: " + s1);
        System.out.println("s1 top element: " + s1.peek());
        System.out.println("s1 empty?: " + s1.isEmpty());
        System.out.println("s1 contains 10: " + s1.search(10));

    }
}