package com.JUnit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestexampleTest {
    @Test
    void Test()
    {
        Testexample t1 = new Testexample();
        int Actual=t1.add(2,3);
        int Expected=5;
        assertEquals(Expected,Actual);
    }


}