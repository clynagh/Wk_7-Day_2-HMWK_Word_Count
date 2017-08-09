package com.example.craiglynagh.word_counter;

/**
 * Created by craiglynagh on 08/08/2017.
 */

public class Counter {


    public static int countWords(String inputString) {
            if (inputString == null)
                return 0;
            return inputString.trim().split("\\s+").length;
    }
}

