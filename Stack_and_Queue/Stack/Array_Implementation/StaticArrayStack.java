import java.util.EmptyStackException;

public class StaticArrayStack <E> {
    protected Object[] stackArray;
    private static final int DEFAULT_CAPACITY = 5;
    protected int capacity;
    protected int stackSize;
    protected int topPointer;

    public StaticArrayStack(){
        this.stackArray = new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
        this.stackSize = 0;
        this.topPointer = 0;
    }

    public StaticArrayStack(int capacity){
        this.capacity = capacity;
        this.stackArray = new Object[this.capacity];
        this.stackSize = 0;
        this.topPointer = 0;
    }

    public void push(E data){
        if(topPointer >= capacity) throw new StackOverflowError("Stack is completely filled");
        stackArray[topPointer++] = data;
        stackSize++;
    }

    @SuppressWarnings("unchecked")
    public E pop(){
        if(stackSize == 0) throw new EmptyStackException();
        E data = (E) stackArray[--topPointer];
        stackArray[topPointer] = null;
        stackSize--;
        return data;
    }

    @SuppressWarnings("unchecked")
    public E peek(){
        if(stackSize == 0) throw new EmptyStackException();
        return (E) stackArray[topPointer-1];
    }

    public boolean isEmpty(){
        return stackSize == 0;
    }

    public boolean contains(E data){
        if(stackSize == 0) throw new EmptyStackException();

        for(int i = 0; i < topPointer; i++){
            if(stackArray[i].equals(data)) return true;
        }
        return false;
    }

    @Override
    public String toString(){
        if(stackSize == 0) return "";
        StringBuilder stringRep = new StringBuilder();
        stringRep.append("\n");

        for(int i = topPointer-1; i >= 0; i--){
            stringRep.append(stackArray[i] + "\n");
        }
        return stringRep.toString();
    }

    public void printDetails(String stackName){
        System.out.println("The size of the stack " + stackName + ": " + stackSize);
        System.out.println("The stack " + stackName + ": " + this + "\n");
    }
}