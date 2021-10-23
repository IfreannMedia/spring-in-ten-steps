package com.ifreann.spring.basics.springintensteps;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class QuickSort implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        // logic for qoick sort would go here
        return Arrays.stream(numbers).sorted().toArray();
    }
}
