package Problem1;

public interface Queue<E> {
    int size ();
    boolean isEmpty();
    void Enqueue(E e);
    E first();
    E dequeue();
}
