package org.ljy.util;

import java.util.HashSet;
import java.util.Random;

public class GenerateNumArray {

    public static final int TEN_MILLiON = 10000000;

    // 生成1000万个不重复的数字
    public static int[] generateNumbers() {
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        int[] result = new int[TEN_MILLiON];
        int index = 0;
        while (set.size() < TEN_MILLiON) {
            int tmp = random.nextInt(TEN_MILLiON);
            if (set.contains(tmp)) {
                continue;
            }
            set.add(tmp);
            result[index++] = tmp;
        }
        return result;

    }

}
