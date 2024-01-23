public class SLLStack <T> {
   private Node head;
   private int stack_size;

   public SLLStack(){
    this.head = null;
    this.stack_size = 0;
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

    public void push(T data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        stack_size++;
    }

    public int size(){
        return stack_size;
    }

    public T peek(){
        return head.data;
    }

    public boolean pop(){
        if(head == null) return false;
        head = head.next;
        stack_size--;
        return true;
    }

    public boolean isEmpty(){
        return head == null;        
    }

    public boolean search(T data){
        Node trav = head;
        while(trav != null){
            if(trav.data.equals(data)) return true;
            trav = trav.next;
        }
        return false;
    }

    @Override
    public String toString(){
        if(head == null) return "null";
        StringBuilder stringView = new StringBuilder();
        stringView.append("\n");
        Node trav = head;
        while(trav != null){
            stringView.append(trav.data+"\n");
            trav = trav.next;
        }
        return stringView.toString();
    }


}
