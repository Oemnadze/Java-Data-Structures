package Problem1;

public class QueueImplUsingStacks<E> implements Queue<E> {

    private Stack<E> st1 = new StackImpl<>();
    private Stack<E> st2 = new StackImpl<>();

    @Override
    public int size() {
        return st1.size() + st2.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void Enqueue(E e) {
        st1.push(e);
    }

    @Override
    public E first() {
        if (isEmpty())
            return null;
        if (!st2.isEmpty())
            return st2.top();
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        return st2.top();
    }

    @Override
    public E dequeue() {
        E ans = first();
        st2.pop();
        return ans;
    }
}
