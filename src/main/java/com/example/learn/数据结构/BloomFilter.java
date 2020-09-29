package com.example.learn.数据结构;

import java.util.BitSet;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-09-29 16:32
 **/

public class BloomFilter {
    private BitSet bitSet = new BitSet(2<<30);

    public  void setBitSet(String[] args) {
        bitSet.set(1,1);
    }
}
