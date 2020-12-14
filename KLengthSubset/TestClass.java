package Problem4;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    @Test
    public void test() {
        Recursion recursion = new Recursion();
        int[] arr = new int[10];
        for (int i = 1; i <= 10; i++) {
            arr[i - 1] = i;
        }
        MyPair pair = recursion.kSum(arr, 13);
        Assert.assertEquals(13, pair.First + pair.Second);
        Assert.assertTrue(pair.First >= 1 && pair.First <= 10);
        Assert.assertTrue(pair.Second >= 1 && pair.Second <= 10);
        Assert.assertNotEquals(pair.First, pair.Second);
        pair = recursion.kSum(arr, 20);
        Assert.assertNull(pair);
    }
}
