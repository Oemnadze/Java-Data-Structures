package Problem2;

import Problem1.Stack;
import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    @Test
    public void test() {
        Stack<Integer> stack = new StackImplUsingQueues<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
            Assert.assertEquals((Integer)i, stack.top());
            Assert.assertEquals(i + 1, stack.size());
            Assert.assertFalse(stack.isEmpty());
        }
        for (int i = 9; i >= 0; i--) {
            Assert.assertFalse(stack.isEmpty());
            Assert.assertEquals((Integer)i, stack.pop());
            Assert.assertEquals(i, stack.size());
        }
        Assert.assertTrue(stack.isEmpty());
    }
}
