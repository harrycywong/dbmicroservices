package com.db.clmp.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nacedbTest {

    @Test
    void getNaceOrder() {
        nacedb n = new nacedb((long)9861, (long)9, "AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG", "HHH");
        assertEquals(9861, n.getNaceOrder());
    }
}