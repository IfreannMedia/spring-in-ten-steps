package com.ifreann.spring.basics.springintensteps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// decorator to inform spring this is a bean to manage
// this is the primary bean its interface type SortAlgorithm
@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        // logic for bubble sort would go here
        return Arrays.stream(numbers).sorted().toArray();
    }

}
