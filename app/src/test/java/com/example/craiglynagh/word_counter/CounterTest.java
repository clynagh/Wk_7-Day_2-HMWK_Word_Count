package com.example.craiglynagh.word_counter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by craiglynagh on 08/08/2017.
 */

public class CounterTest {

    private String inputString;

    @Before
    public void before(){

        inputString = new String("This is a test string");
    }

    @Test
            public void testWordCounter() {
        assertEquals(5, Counter.countWords(inputString));
    }
}
