public class CircularStaticQueue <E> {
    protected Object[] queueArray;
    private static final int DEFAULT_CAPACITY = 5;
    public int frontPointer;
    protected int endPointer;
    protected int queueSize;
    protected int capacity;

    public CircularStaticQueue(){
        this(DEFAULT_CAPACITY);
    }

    public CircularStaticQueue(int capacity){
        this.capacity = capacity;
        queueArray = new Object[capacity];
        this.frontPointer = 0;
        this.endPointer = 0;
        this.queueSize = 0;
    }


    public void offer(E data) throws Exception{
        if(isFull()) throw new Exception("Queue is Full");
        queueArray[endPointer] = data;
        endPointer = ++endPointer%capacity;
        queueSize++;
    }

    @SuppressWarnings("unchecked")
    public E poll() throws Exception{
        if(isEmpty()) throw new Exception("Queue is Empty");
        E data = (E) queueArray[frontPointer];
        frontPointer = ++frontPointer%capacity;
        queueSize--;
        return data;
    }

    @SuppressWarnings("unchecked")
    public E peek() throws Exception{
        if(isEmpty()) throw new Exception("Queue is Empty");
        return (E) queueArray[frontPointer];
    }

    public boolean isFull(){
        return queueSize == capacity;
    }

    public boolean isEmpty(){
        return queueSize == 0;
    }

    @Override
    public String toString(){
        if(isEmpty()) return "";
        StringBuilder stringRep = new StringBuilder();
        stringRep.append("|");

        if(frontPointer < endPointer){
            for(int i = frontPointer; i < endPointer; i++){
                stringRep.append(queueArray[i] + "|");
            }
        }
        else{
            for(int i = frontPointer; i < capacity; i++){
                stringRep.append(queueArray[i] + "|");
            }
            for(int i = 0; i < endPointer; i++){
                stringRep.append(queueArray[i] + "|");
            }
        }
        return stringRep.toString();
    }

    public void printDetails(String queueName){
        System.out.println("The size of the queue " + queueName + " is: " + queueSize);
        System.out.println("The queue " + queueName + ": " + this);
    }
}