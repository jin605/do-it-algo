package main.chap04;

public class IntStack_1 {

    private int stk[];
    private int ptr;
    private int capacity;

    public class EmptyIntStack_1Exception extends RuntimeException{
        public EmptyIntStack_1Exception() {}
    }

    public class OverflowIntStack_1Exception extends RuntimeException{
        public OverflowIntStack_1Exception() {}
    }

    public IntStack_1 (int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    public int push (int x) throws OverflowIntStack_1Exception {
        if (ptr >= capacity ){
            throw new OverflowIntStack_1Exception();
        } return stk[ptr++] = x;
    }

    public int pop () throws EmptyIntStack_1Exception {
        if (ptr <= 0){
            throw new EmptyIntStack_1Exception();
        } return stk[--ptr];
    }

    public int peek() throws EmptyIntStack_1Exception {
        if (ptr <= 0){
            throw new EmptyIntStack_1Exception();
        }
        return stk[ptr - 1];
    }

    public int indexOf(int x){
        for (int i = 0; i < ptr; i++){
            if (stk[i] == x) {

                return i;
            }
        }

        return -1;
    }

    public void dump() {
        for (int i = 0; i < ptr; i++){
            System.out.print(stk[i] + "");

        }
        System.out.println();
    }

    public int clear() {
        return ptr = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return ptr;
    }

    public boolean isFull(){
        return ptr >= capacity;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }


}

