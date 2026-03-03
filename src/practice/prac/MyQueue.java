package practice.prac;

public class MyQueue {

    private int[] que;
    private int rear;
    private int capacity;
    private int front;
    private int num;

    public class EmptyMyQueueException extends RuntimeException {
        public EmptyMyQueueException(){}
    }

    public class OverflowMyQueueException extends RuntimeException {
        public OverflowMyQueueException(){}
    }

    public MyQueue (int maxlen){
        num = rear = front =0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e){
            capacity  = 0;
        }

    }

    public int enque (int x) throws OverflowMyQueueException {
        if (num >= capacity) {
            throw new OverflowMyQueueException();
        }
        que[rear++] = x;
        num++;
        if (rear == capacity) {
            rear = 0;
        }

        return x;
    }

    public int deque() throws EmptyMyQueueException {
        if (num <= 0){
            throw new EmptyMyQueueException();
        }
        int x = que[front++];
        num--;
        if (front == capacity){
            front = 0;
        }

        return x;
    }

    public int peek() throws EmptyMyQueueException{
        if (num <= 0){
            throw new EmptyMyQueueException();
        }
        return que[front];
    }

    public int indexOf(int x){
        for (int i = 0; i < num; i++){
            int idx = (i+front)%capacity;
            if (que[idx] == x){
                return i;
            }
        }
        return -1;
    }

    public void dump() {
        for (int i = 0; i < num; i++){
            int idx = (i +front) % capacity;
            System.out.println(que[idx] + "");
        }
        System.out.println();
    }

    public int getCapacity() {
        return capacity;
    }

    public void clear(){
        num = front = rear = 0;
    }

    public int size() {
        return num;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    public boolean isEmpty() {
        return num <= 0;
    }
















}
