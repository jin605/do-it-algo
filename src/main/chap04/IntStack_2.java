package main.chap04;

public class IntStack_2 {

    private int stk[];
    private int capacity;
    private int ptr;

    public class EmptyIntStack_2Exception extends RuntimeException {
        public EmptyIntStack_2Exception(){}
    }

    public class OverFlowIntStack_2Exception extends RuntimeException {
        public OverFlowIntStack_2Exception(){}
    }

    public IntStack_2(int maxlen){
        ptr = 0 ;
        capacity = maxlen;

        try{
            stk = new int[capacity];
        }catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    public int push(int x) throws OverFlowIntStack_2Exception {
        if (ptr >= capacity){
            throw new OverFlowIntStack_2Exception();
        } return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStack_2Exception {
        if (ptr <= 0){
            throw new EmptyIntStack_2Exception();
        } return stk[--ptr];
    }

    public int peek() throws EmptyIntStack_2Exception {
        if (ptr <= 0){
            throw new EmptyIntStack_2Exception();
        } return stk[ptr-1];
    }

    public int size(){
        return ptr;
    }

    public int indexOf(int x){
        for (int i = ptr - 1; i >= 0; i--){
            if (stk[i] == x){
                return i;
            }
        }
        return -1;
    }

    public int getCapacity(){
        return capacity;
    }

    public void dump() {
        if (ptr <= 0 ){

            System.out.println("스택이 비었습니다.");

        } else {

            for (int i = 0 ; i < ptr; i++){
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

    public void clear(){
        ptr = 0;
    }

    public boolean isFull(){
        return ptr >= capacity;

    }

    public boolean isEmpty(){
        return ptr <= 0;
    }

    }


