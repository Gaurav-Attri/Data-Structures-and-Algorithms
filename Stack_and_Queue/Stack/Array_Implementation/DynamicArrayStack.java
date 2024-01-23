public class DynamicArrayStack <E> extends StaticArrayStack <E> {
    public DynamicArrayStack(){
        super();
    }

    public DynamicArrayStack(int capacity){
        super(capacity);
    }

    @Override
    public void push(E data){
        if(super.topPointer == capacity) resize();
        stackArray[topPointer++] = data;
        stackSize++;
    }

    private void resize(){
        capacity = 2*capacity;
        Object[] doubleSizeArray = new Object[capacity];

        for(int i = 0; i < topPointer; i++){
            doubleSizeArray[i] = stackArray[i];
        }
        stackArray = doubleSizeArray;
    }

}

