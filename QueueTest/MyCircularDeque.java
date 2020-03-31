package QueueTest;

public class MyCircularDeque {
        public int kt;
        public int[] arr;
        public int head;
        public int tail;
    //构造函数,双端队列的大小为k。
        public MyCircularDeque(int k) {
            kt=k+1;
            arr=new int[kt];
            head=0;
            tail=0;
    }
    //将一个元素添加到双端队列头部。 如果操作成功返回 true
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        head=(head-1+kt)%kt;
        arr[head]=value;
        return true;
    }
    //将一个元素添加到双端队列尾部。如果操作成功返回 true
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        arr[tail]=value;
        tail=(tail+1+kt)%kt;
        return true;
    }
    //从双端队列头部删除一个元素。 如果操作成功返回 true
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        head=(head+1+kt)%kt;
        return true;
    }
    //从双端队列尾部删除一个元素。如果操作成功返回 true
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        tail=(tail-1+kt)%kt;
        return true;
    }
    //从双端队列头部获得一个元素。如果双端队列为空，返回 -1
    /** Get the front item from the deque. */
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return arr[head];
    }
    //获得双端队列的最后一个元素。 如果双端队列为空，返回 -1
    /** Get the last item from the deque. */
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return arr[(tail-1+kt)%kt];
    }
    //检查双端队列是否为空。
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return head==tail;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return (tail+1)%kt==head;
    }
}
