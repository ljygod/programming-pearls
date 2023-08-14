package org.ljy.chapter1;

import org.junit.Assert;
import org.junit.Test;
import org.ljy.util.GenerateNumArray;
import org.ljy.util.MyBitSet;

import java.util.Arrays;

public class Problem2 {

    @Test
    public void test() {
        int[] nums = GenerateNumArray.generateNumbers();
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        long start = System.currentTimeMillis();
        Arrays.sort(nums);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        start = System.currentTimeMillis();
        MyBitSet myBitSet = new MyBitSet();
        for (int num : nums2) {
            myBitSet.set(num);
        }
        int index = 0;
        for (int i = 0; i < myBitSet.getSize(); i++) {
            if (myBitSet.get(i)) {
                nums2[index++] = i;
            }
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
        Assert.assertArrayEquals(nums, nums2);
    }

    @Test
    public void testSort() {
        int[] nums = new int[]{12, 123, 457, 1, 2, 4, 6, 0};
        MyBitSet myBitSet = new MyBitSet();
        for (int num : nums) {
            myBitSet.set(num);
        }
        int index = 0;
        for (int i = 0; i < myBitSet.getSize(); i++) {
            if (myBitSet.get(i)) {
                nums[index++] = i;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
