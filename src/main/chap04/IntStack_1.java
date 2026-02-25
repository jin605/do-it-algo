package main.chap04;

public class IntStack_1 {

    private int[] stk; // 스택 배열
    private int capacity; // 스택 용량
    private int ptr; // 스택 포인터


    public class EmptyIntStack_1Exception extends RuntimeException {
        public EmptyIntStack_1Exception(){}
    }

    public class OverFlowIntStack_1Exception extends RuntimeException {
        public OverFlowIntStack_1Exception(){}
    }


    public IntStack_1(int maxlen){
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    public int push(int x) throws OverFlowIntStack_1Exception {
        if (ptr >= capacity){
            throw new OverFlowIntStack_1Exception();
        } return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStack_1Exception {
        if (ptr <= 0) {
            throw new EmptyIntStack_1Exception();
        } return stk[--ptr];
    }

    public int peek() throws EmptyIntStack_1Exception {
        if (ptr <= 0) {
            throw new EmptyIntStack_1Exception();
        } return stk[ptr - 1];
    }

    public void clear() {
        ptr = 0;
    }

    public int indexOf(int x){
        for (int i = ptr - 1; i >=0 ; i--){
            if (stk[i] == x){
                return i;
            }
        }
        return -1;
    }

    public int getCapacity(){
        return capacity;
    }

    public int size(){
        return ptr;
    }

    public boolean isEmpty(){
        return ptr <= 0;
    }

    public boolean isFull(){
        return ptr >= capacity;
    }

    public void dump() {
        if (ptr <= 0){
            System.out.println("스택이 비어 있습니다.");
        } else {
            for (int i = 0; i < ptr; i++){
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }



}

