package org.ljy.util;

import java.util.Arrays;

public class MyBitSet {

    private final int BITS_OF_WORD = 6;

    private final int INIT_SIZE = 1 << BITS_OF_WORD;

    private long[] word;

    public MyBitSet() {
        word = new long[INIT_SIZE];
    }

    public MyBitSet(int len) {
        word = new long[len >> BITS_OF_WORD];
    }

    public void set(int num) {
        int index = num / INIT_SIZE;
        int innerIndex = num % INIT_SIZE;
        if (num > word.length * INIT_SIZE) {
            long[] newWord = new long[num * 2 / INIT_SIZE];
            System.arraycopy(word, 0, newWord, 0, word.length);
            word = newWord;
        }
        word[index] = word[index] | (1L << innerIndex);
    }

    public boolean get(int num) {
        int index = num / INIT_SIZE;
        int innerIndex = num % INIT_SIZE;
        return (word[index] >> innerIndex & 1) == 1;
    }

    public int getSize() {
        return word.length * INIT_SIZE;
    }

    @Override
    public String toString() {
        return Arrays.toString(word);
    }
}
