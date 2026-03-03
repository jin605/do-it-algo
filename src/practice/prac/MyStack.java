package practice.prac;

public class MyStack {

    private int[] stk;
    private int capacity;
    private int ptr;

    public class OverflowMyStackException extends RuntimeException {
        public OverflowMyStackException() {}
    }

    public class EmptyMyStackException extends RuntimeException {
        public EmptyMyStackException() {}
    }

    public MyStack (int maxlen) {
        ptr = 0 ;
        capacity = maxlen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    public int push (int x) throws OverflowMyStackException {
        if (ptr >= capacity) {
            throw new OverflowMyStackException();
        } return stk[ptr++] = x;
    }

    public int pop () throws EmptyMyStackException {
        if (ptr <= 0) {
            throw new EmptyMyStackException();
        } return stk[--ptr];
    }

    public int peek() throws EmptyMyStackException {
        if (ptr <= 0) {
            throw new EmptyMyStackException();
        } return stk[ptr-1];
    }

    public int indexOf (int x) {
        for (int i = ptr-1; i >= 0; i--){
            if (stk[i] == x){
                return i;
            }
        }
        return -1;
    }

    public void dump() {
        if (ptr <= 0){
            System.out.println("스택이 비어 있습니다.");
        } else {
            for (int i = 0; i < ptr-1; i++){
                System.out.println(stk[i] + "");
            }
            System.out.println();
        }
    }

    public int clear(){
        return ptr = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return ptr;
    }

    public boolean isFull() {
        return ptr >= capacity;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }













}
