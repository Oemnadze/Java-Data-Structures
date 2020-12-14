package Problem3;

public class DequeImpl<E> implements Deque<E> {

    private DoublyLinkedList<E> head = null;
    private DoublyLinkedList<E> tail = null;
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
    public E first() {
        return head.data;
    }

    @Override
    public E last() {
        return tail.data;
    }

    @Override
    public void addFirst(E e) {
        DoublyLinkedList<E> newLst = new DoublyLinkedList<>(e);
        logLen++;
        if (head == null && tail == null) {
            head = newLst;
            tail = newLst;
            return;
        }
        newLst.next = head;
        head.prev = newLst;
        head = head.prev;
    }

    @Override
    public void addLast(E e) {
        DoublyLinkedList<E> newLst = new DoublyLinkedList<>(e);
        logLen++;
        if (head == null && tail == null) {
            head = newLst;
            tail = newLst;
            return;
        }
        tail.next = newLst;
        newLst.prev = tail;
        tail = tail.next;
    }

    @Override
    public E removeFirst() {
        if (head == null)
            return null;
        E ans = head.data;
        head = head.next;
        logLen--;
        if (head == null)
            tail = null;
        else
            head.prev = null;
        return ans;
    }

    @Override
    public E removeLast() {
        if (tail == null)
            return null;
        E ans = tail.data;
        tail = tail.prev;
        logLen--;
        if (tail == null)
            head = null;
        else
            tail.next = null;
        return ans;
    }
}
