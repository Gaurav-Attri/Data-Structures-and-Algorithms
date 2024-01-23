public class CircularDynamicQueue <E> extends CircularStaticQueue <E> {
    public CircularDynamicQueue(){
        super();
    }

    public CircularDynamicQueue(int capacity){
        super(capacity);
    }

    @Override
    public void offer(E data) throws Exception{
        if(isFull()) resize();
        queueArray[endPointer] = data;
        endPointer = ++endPointer%capacity;
        queueSize++;
    }

    /*
     * The following resize() method is result of an observation. By observation, I figured that first we have to copy those
     * elements from queueArray to tempArr which lie in the range [0, endPointer). Then we have to fingure out how many elements
     * are left in the queue array (which is the first statement in our implementation as we need to update the value of 
     * capacity later in our method). Then we have to fill last capacity-elementsLeftInQueueArray position with the elements that
     * are left in the queueArray by using an extra pointer called currentIndex. At last we have to pointer our frontPointer to 
     * capacity-elementsLeftInQueueArray.
     */
    private void resize(){
        int elementsLeftInQueueArray = capacity-endPointer;
        capacity = 2*capacity;
        Object[] tempArr = new Object[capacity];

        for(int i = 0; i < endPointer; i++){
            tempArr[i] = queueArray[i];
        }   

        int currentIndex = frontPointer;

        for(int i = capacity-elementsLeftInQueueArray; i < capacity; i++){
            tempArr[i] = queueArray[currentIndex];
            currentIndex++;
        }

        queueArray = tempArr;
        frontPointer = capacity-elementsLeftInQueueArray;
    }
}
