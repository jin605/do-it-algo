package main.chap04;

import java.util.ArrayDeque;
import java.util.Deque;

public class IntQueue_2 {

    private Deque<Integer> que;
    private int capacity;

    public class EmptyIntQueue_2Exception extends RuntimeException {
        public EmptyIntQueue_2Exception() {}
    }

    public class OverflowIntQueue_2Exception extends RuntimeException {
        public OverflowIntQueue_2Exception() {}
    }

    public IntQueue_2(int maxlen) {
        this.capacity = maxlen;
        this.que = new ArrayDeque<>(maxlen);
    }

    public int enque(int x) throws OverflowIntQueue_2Exception {
        if (que.size() >= capacity) {
            throw new OverflowIntQueue_2Exception();
        }

        que.offerLast(x);
        return x;
    }

    public int deque() throws EmptyIntQueue_2Exception {
        if (que.isEmpty()) {
            throw new EmptyIntQueue_2Exception();
        }

        return que.pollFirst();
    }

    public int peek() throws EmptyIntQueue_2Exception {
        if (que.isEmpty()){
            throw new EmptyIntQueue_2Exception();
        }

        return que.peekFirst();
    }

    public void clear() {
        que.clear();
    }

    public int indexOf (int x) {
        int idx = 0;
        for (Integer item : que){
            if (item == x){
                return idx;
            }
            idx++;
        }
        return -1;
    }

    public void dump() {
        if (que.isEmpty()) {
            System.out.println("큐가 비어 있습니다.");
        } else {

            for (Integer item : que){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public int getCapacity() {

        return capacity;
    }

    public int size() {

        return que.size();
    }

    public boolean isEmpty() {

        return que.isEmpty();
    }

    public boolean isFull() {
        return que.size() >= capacity;
    }




}


