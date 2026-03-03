package main.chap04;

public class IntQueue_1 {

    private int[] que;
    private int capacity;
    private int num;
    private int front;
    private int rear;

    public class EmptyIntQueue_1Exception extends RuntimeException {
        public EmptyIntQueue_1Exception() {}
    }

    public class OverflowIntQueue_1Exception extends RuntimeException {
        public OverflowIntQueue_1Exception() {}
    }

    public IntQueue_1 (int maxlen) {
        num = rear = front = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];

        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int enque (int x) throws OverflowIntQueue_1Exception{
        if (num >= capacity) {
            throw new OverflowIntQueue_1Exception();
        }
        que[rear++] = x;
        num ++;
        if (rear == capacity) {
            rear = 0;
        }
        return x;
    }

    public int deque () throws EmptyIntQueue_1Exception {
        if (num <= 0) {
            throw new EmptyIntQueue_1Exception();
        }
        int x = que[front++];
        num --;
        if (front == capacity) {
            front = 0;
        }
        return x;
    }

    public int peek() throws EmptyIntQueue_1Exception {
        if (num <= 0) {
            throw new EmptyIntQueue_1Exception();
        }
        return que[front];
    }

    public void dump() {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            System.out.println(que[idx] + "");
        }
        System.out.println();
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++){
            int idx = (i + front) % capacity;
            if (que[idx] == x){
                return i;
            }
        }
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return num;
    }

    public int clear () {
        return num = front = rear = 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    public boolean isEmpty(){
        return num <= 0;
    }





}


