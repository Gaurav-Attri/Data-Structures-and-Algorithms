public class StaticArrayQueue <E> {
    protected Object[] queueArray;
    private static final int DEFAULT_CAPACITY = 5;
    protected int capacity;
    protected int queueSize;
    protected int endPointer;

    public StaticArrayQueue(){
        this.queueArray = new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
        this.queueSize = 0;
        this.endPointer = 0;
    }

    public StaticArrayQueue(int capacity){
        this.capacity = capacity;
        this.queueArray = new Object[this.capacity];
        this.queueSize = 0;
        this.endPointer = 0;
    }

    public void offer(E data) throws Exception {
        if(endPointer >= capacity){
            throw new Exception("Queue is Full!");
        }
        queueArray[endPointer++] = data;
        queueSize++;
        return;
    }

    @SuppressWarnings("unchecked")
    public E poll() throws Exception{
        if(queueSize == 0) throw new Exception("Queue is Empty");
        E data = (E)queueArray[0];

        for(int i = 1; i < endPointer; i++){
            queueArray[i-1] = queueArray[i];
        }
        endPointer--;
        queueSize--;
        return data;
    }

    @SuppressWarnings("unchecked")
    public E peek() throws Exception{
        if(queueSize == 0) throw new Exception("Queue is Empty");
        return (E) queueArray[0];
    }

    public boolean isEmpty(){
        return queueSize == 0;
    }

    public boolean contains(E data){
        if(queueSize == 0) return false;

        for(int i = 0; i < endPointer; i++){
            if(queueArray[i].equals(data)) return true;
        }
        return false;
    }

    @Override
    public String toString(){
        if(queueSize == 0) return "";
        StringBuilder stringRep = new StringBuilder();
        stringRep.append("|");

        for(int i = 0; i < endPointer; i++){
            stringRep.append(queueArray[i] + "|");
        }
        return stringRep.toString();
    }
    
    public void printDetails(String queueName){
        System.out.println("The size of the queue " + queueName + " is: " + this.queueSize);
        System.out.println("The queue " + queueName + ": " + this + '\n');
    }
}
