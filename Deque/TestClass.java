package Problem3;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    @Test
    public void test() {
        Deque<Integer> deque = new DequeImpl<>();
        for (int i = 0; i < 10; i++) {
            deque.addLast(i);
            Assert.assertEquals((Integer)i, deque.last());
            Assert.assertEquals(i + 1, deque.size());
            Assert.assertFalse(deque.isEmpty());
        }
        for (int i = 9; i >= 0; i--) {
            Assert.assertFalse(deque.isEmpty());
            Assert.assertEquals((Integer)i, deque.removeLast());
            Assert.assertEquals(i, deque.size());
        }
        Assert.assertTrue(deque.isEmpty());
        for (int i = 0; i < 10; i++) {
            deque.addLast(i);
            Assert.assertEquals((Integer)0, deque.first());
            Assert.assertEquals(i + 1, deque.size());
            Assert.assertFalse(deque.isEmpty());
        }
        for (int i = 0; i < 10; i++) {
            Assert.assertFalse(deque.isEmpty());
            Assert.assertEquals((Integer)i, deque.removeFirst());
            Assert.assertEquals(9 - i, deque.size());
        }
        Assert.assertTrue(deque.isEmpty());
        deque.addFirst(200);
        Assert.assertEquals((Integer)200, deque.removeFirst());
        Assert.assertTrue(deque.isEmpty());
    }
}
