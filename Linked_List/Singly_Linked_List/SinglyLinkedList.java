public class SinglyLinkedList <T>{
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
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

        private Node(Node node){
            this.data = node.data;
            this.next = node.next;
        }
    }

    /*
     * Below are implemented some methods that one can use in order to interact with the linked list.
     */

    /*
     * Method 1: add(): This method appends an element in the linked list and returns true on a successfull insertion and false  
     * otherwise. Since we have a tail pointer which always points to the last node, insertion in this manner can be done in 
     * constant time complexity.
     */

    public boolean add(T data){
        Node node = new Node(data);

        // If currently my linked list is empty
        if(head == null){
            head = node;
            tail = node;
            size++;
            return true;
        }
        tail.next = node;
        tail = node;
        size++;
        return true;
    }

    /*
     * Method 2: length(): This is a pretty simple method which returns the size of the linked list and it does so in constant
     * time.
     */
    public int length(){
        return size;
    }

    /*
     * Method 3: toString(): This is actually a method of the Object class and we're overriding it here to return a string which 
     * will be string representation of our linked list. We'll not need to call it explicitly as it will be called automatically 
     * whenever we'll pass our SLL in System.out.println. Since we're traversing the whole linked list, the time complexity of 
     * this method is linear.
     */

    @Override
    public String toString(){
        Node trav = head;
        StringBuilder stringRep = new StringBuilder();

        while(trav != null){
            stringRep.append(trav.data + "->");
            trav = trav.next;
        }
        stringRep.append("null");
        return stringRep.toString();
    }

    /*
     * Method 4: isEmpty(): This method returns a string "Empty" in case if the SLL is empty and "Not Empty" otherwise. It works
     * in constant time.
     */

    public String isEmpty(){
        if(size == 0) return "Empty";
        return "Not Empty";
    }

    /*
     * Method 5: contains(): This method checks if a particular element is present in the linked list. The time complexity is 
     * linear.
     */

    public boolean contains(T data){
        if(size == 0) return false;
        Node trav = head;

        while(trav != null){
            if(trav.data.equals(data)) return true;
            trav = trav.next;
        }
        return false;
    }

    /*
     * Method 6: peekFirst(): This method returns the first element of the linked list. This takes constant time.
     */

    public T peekFirst(){
        if(size == 0) return null;
        return head.data;
    }

    /*
     * Method 7: peekLast(): This method returns the last element of the linked list and it also does so in constant time
     */

    public T peekLast(){
        if(size == 0) return null;
        return tail.data;
    }

    /*
     * Method 8: indexOf(): This method returns the index of an element if it exists in the linked list otherwise it returns -1.
     * The time complexity of this method is linear as we have to traverse the whole linked list.
     */

    public int indexOf(T data){
        int index = 0;
        Node trav = head;

        while(trav != null){
            if(trav.data.equals(data)) return index;
            index++;
            trav = trav.next;
        }
        return -1;
    }

    /*
     * Method 9: addFirst(): This method adds an element in the starting of the linked list and return true. The time complextiy
     * of this method is constant.
     */

    public boolean addFirst(T data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
            size++;
            return true;
        }
        node.next = head;
        head = node;
        size++;
        return true;
    }

    /*
     * Method 10: addAt(): This method adds an element at a particular index (index start from 0). The time complexity of this
     * method is linear and we'll have to traverse upto that index.
     */

    public boolean addAt(T data, int index){
        if(index < 0 || index > size){
            System.out.println("Index out of bound!");
            return false;
        }
        
        int currentIndex = 0;
        Node trav = head;
        Node node = new Node(data);

        while(currentIndex < index-1){
            trav = trav.next;
            currentIndex++;
        }
        node.next = trav.next;
        trav.next = node;
        size++;
        return true;
    }

    /*
     * Method 11: removeFirst(): This method removes the first element of the linked list if the list is not empty. The time
     * complexity is constant.
     */

    public boolean removeFirst(){
        if(size == 0) return false;
        head = head.next;
        size--;
        return true;

    }

    /*
     * Method 12: removeLast(): This method removes the last element of the linked lsit if the list is not empty and it does so 
     * in linear time complexity because we don't have any reference to the previous nodes. Hence we'll have to traverse the 
     * second last node to reset the value of tail.
     */

    public boolean removeLast(){
        if(size == 0) return false;
        Node trav = head;

        while((trav.next).next != null){
            trav = trav.next;
        }
        tail = trav;
        tail.next = null;
        size--;
        return true;
    }

    /*
     * Method 13: removeAt(): This method removes an element from a particular index (index starts from 0). Time complexity: O(n)
     */

    public boolean removeAt(int index){
        if(size == 0 || index < 0 || index > size-1) return false;
        if(index == size-1){
            removeLast();
            return true;
        }
        if(index == 0 && size == 1){
            removeFirst();
            return true;
        }

        Node trav = head;
        int currIndex = 0;

        while(currIndex < index-1){
            trav = trav.next;
            currIndex++;
        }

        trav.next = trav.next.next;
        size--;
        return true;
    }

    /*
     * Method 14: clear(): This method removes all the elements from the linked list. The time complexity is constant.
     */

    public boolean clear(){
        if(size == 0) return false;
        head = null;
        tail = null;
        size = 0;
        return true;
    }

}