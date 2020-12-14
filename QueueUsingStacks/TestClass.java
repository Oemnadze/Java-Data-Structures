package Problem1;

import Problem2.StackImplUsingQueues;
import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    @Test
    public void test() {
        Queue<Integer> queue = new QueueImplUsingStacks<>();
        for (int i = 0; i < 10; i++) {
            queue.Enqueue(i);
            Assert.assertEquals((Integer)0, queue.first());
            Assert.assertEquals(i + 1, queue.size());
            Assert.assertFalse(queue.isEmpty());
        }
        for (int i = 0; i < 10; i++) {
            Assert.assertFalse(queue.isEmpty());
            Assert.assertEquals((Integer)i, queue.dequeue());
            Assert.assertEquals(9 - i, queue.size());
        }
        Assert.assertTrue(queue.isEmpty());
    }
}
