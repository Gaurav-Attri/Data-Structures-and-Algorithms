public class DoublyLinkedList <T> {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private class Node{
        private T data;
        private Node next;
        private Node prev;

        private Node(){
            this.data = null;
            this.next = null;
            this.prev = null;
        }

        private Node(T data){
            this();
            this.data = data;
        }
    }

    /*
     * Method 1: length(): Returns the size of the linked list. The time complexity is O(1).
     */

    public int length(){
        return size;
    }

    /*
     * Method 2: toString(): This method belongs to the Object class and it has been overridden here as per requirements. The 
     * time complexity is O(n);
     */

    @Override
    public String toString(){
        Node trav = head;
        StringBuilder stringView = new StringBuilder();

        while(trav != null){
            if(trav.next == null){
                stringView.append(trav.data + "->");
                trav = trav.next;
                continue;
            }

            stringView.append(trav.data + "<->");
            trav = trav.next;
        }
        stringView.append("null");
        return stringView.toString();
    }

    /*
     * Method 3: addLast(): This method adds a node in the end of the linked list. The time complexity is constant due to tail.
     */

    public boolean addLast(T data){
        Node node = new Node(data);
        if(size == 0){
            head = tail = node;
            size++;
            return true;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
        return true;
    }

    /*
     * Method 4: addFirst(): This method adds a node in the starting of the linked list. The time complexit is constant.
     */

    public boolean addFirst(T data){
        Node node = new Node(data);
        if(size == 0){
            head = tail = node;
            size++;
            return true;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
        return true;
    }

    /*
     * Method 5: addAt(): This method adds a node at a particular index (index start from 0). The time complexity is linear.
     */

    public boolean addAt(T data, int index){
        if(index < 0 || index > size) return false;
        if(index == 0){
            addFirst(data);
            return true;
        }
        if(index == size){
            addLast(data);
            return true;
        }

        Node node = new Node(data);
        Node trav = head;
        int currIndex = 0;

        while(currIndex < index-1){
            trav = trav.next;
            currIndex++;
        }
        node.prev = trav;
        node.next = trav.next;
        trav.next.prev = node;
        trav.next = node;
        size++;
        return true;
    }

    /*
     * Method 6: removeFirst(): This method removes the first node from the linked list. The time complexity is constant.
     */

    public boolean removeFirst(){
        if(size == 0) return false;
        head = head.next;
        if(head != null) head.prev = null;
        size--;
        return true;
    }

    /*
     * Method 7: removeLast(): This method removes the last node from the linked list. The time complexity is constant becuase 
     * we have a reference to the second last node.
     */

    public boolean removeLast(){
        if(size == 0) return false;
        tail = tail.prev;
        tail.next.prev = null;
        tail.next = null;
        size--;
        return true;
    }

    /*
     * Method 8: removeAt(): This method removes a node at a particular index. The time complexity is linear.
     */

    public boolean removeAt(int index){
        if(size == 0) return false;
        if(index < 0 || index > size-1) return false;
        if(index == 0){
            removeFirst();
            return true;
        }
        if(index == size-1){
            removeLast();
            return true;
        }
        
        Node trav = head;
        int currIndex = 0;

        while(currIndex < index-1){
            trav = trav.next;
            currIndex++;
        }

        trav.next = trav.next.next;
        if(trav.next.next != null)trav.next.next.prev = trav;
        size--;
        return true;

    }
}