package Problem2;

import Problem1.Queue;

public class QueueImpl<E> implements Queue<E> {

    private SingleLinkedList<E> head = null;
    private SingleLinkedList<E> tail = null;
    private int logLen = 0;

    @Override
    public int size() {
        return logLen;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void Enqueue(E e) {
        SingleLinkedList<E> newLst = new SingleLinkedList<>(e);
        logLen++;
        if (head == null && tail == null) {
            head = newLst;
            tail = newLst;
            return;
        }
        tail.next = newLst;
        tail = tail.next;
    }

    @Override
    public E first() {
        return head.data;
    }

    @Override
    public E dequeue() {
        if (head == null)
            return null;
        E ans = head.data;
        head = head.next;
        logLen--;
        if (head == null)
            tail = null;
        return ans;
    }
}
