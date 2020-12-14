package Problem1;

import Problem1.Stack;

import java.util.Arrays;

public class StackImpl<E> implements Stack<E> {

    private int logLen, allocLen = 4;
    private Object[] arr = new Object[allocLen];

    private void grow() {
        allocLen *= 2;
        arr = Arrays.copyOf(arr, allocLen);
    }

    @Override
    public int size() {
        return logLen;
    }

    @Override
    public boolean isEmpty() {
        return logLen == 0;
    }

    @Override
    public void push(Object o) {
        if (logLen == allocLen) {
            grow();
        }
        arr[logLen++] = o;
    }

    @Override
    public E top() {
        return (E)arr[logLen - 1];
    }

    @Override
    public E pop() {
        if (logLen == 0) {
            return null;
        }
        E toReturn = top();
        logLen--;
        return toReturn;
    }
}
