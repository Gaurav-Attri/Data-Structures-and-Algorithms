public class SLLQueue <T>{
    private int size;
    private Node queue_front;
    private Node queue_back;

    public SLLQueue(){
        this.size = 0;
        this.queue_front = null;
        this.queue_back = null;
    }

    private class Node{
        private T data;
        private Node next;

        private Node(){
            this.data = null;
            this.next = null;
        }

        private Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(T data){
        Node node = new Node(data);
        if(size == 0){
            queue_front = queue_back = node;
            size++;
            return;
        }
        queue_back.next = node;
        queue_back = node;
        size++;
        return;
    }

    public T dequeue(){
        if(size == 0) return null;
        if(size == 1){
            this.queue_back = null;
            T data = queue_front.data;
            queue_front = queue_front.next;
            size--;
            return data;
        }
        T data = queue_front.data;
        queue_front = queue_front.next;
        size--;
        return data;
    }

    public T peek(){
        if(size == 0) return null;
        return queue_front.data;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public boolean contains(T data){
        if(this.isEmpty()) return false;
        Node trav = queue_front;

        while(trav != null){
            if(trav.data.equals(data)) return true;
            trav = trav.next;
        }

        return false;
    }

    @Override
    public String toString(){
        if(size == 0) return "null";
        StringBuilder stringRep = new StringBuilder();
        stringRep.append("|");
        Node trav = queue_front;

        while(trav != null){
            stringRep.append(trav.data + "|");
            trav = trav.next;
        }
        
        return stringRep.toString();
    }

    public void printDetails(String queue_name){
        System.out.println("The size of the queue is: " + this.size);
        System.out.println("The queue " + queue_name + ": " + this);
        System.out.println();
    }
}