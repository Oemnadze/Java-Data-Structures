package Problem2;

import Problem1.Queue;
import Problem1.Stack;
import Problem2.QueueImpl;

public class StackImplUsingQueues<E> implements Stack<E> {

    private Queue<E> queue1 = new QueueImpl<>();
    private Queue<E> queue2 = new QueueImpl<>();

    @Override
    public int size() {
        return queue1.size() + queue2.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void push(E e) {
        queue1.Enqueue(e);
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        while (queue1.size() > 1) {
            queue2.Enqueue(queue1.dequeue());
        }
        E ans = queue1.dequeue();
        queue2.Enqueue(ans);
        Queue<E> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return ans;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        while (queue1.size() > 1) {
            queue2.Enqueue(queue1.dequeue());
        }
        E ans = queue1.dequeue();
        Queue<E> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return ans;
    }
}
