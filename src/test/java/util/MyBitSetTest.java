package util;

import org.junit.Assert;
import org.junit.Test;
import org.ljy.util.MyBitSet;

import java.util.Arrays;

public class MyBitSetTest {

    @Test
    public void test() {
        MyBitSet myBitSet = new MyBitSet();
        myBitSet.set(1);
        myBitSet.set(65);
        myBitSet.set(8);
        Assert.assertTrue(myBitSet.get(1));
        Assert.assertTrue(myBitSet.get(65));
        Assert.assertTrue(myBitSet.get(8));
        Assert.assertFalse(myBitSet.get(64));
    }


}
