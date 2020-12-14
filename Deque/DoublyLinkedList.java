package Problem3;

public class DoublyLinkedList<E> {
    public DoublyLinkedList<E> next;
    public DoublyLinkedList<E> prev;
    public E data;
    public DoublyLinkedList(E key) {
        this.data = key;
        this.next = null;
        this.prev = null;
    }
}
