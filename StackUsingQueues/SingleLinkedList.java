package Problem2;

public class SingleLinkedList<E> {
    public SingleLinkedList<E> next;
    public E data;
    public SingleLinkedList(E key) {
        this.data = key;
        this.next = null;
    }
}
