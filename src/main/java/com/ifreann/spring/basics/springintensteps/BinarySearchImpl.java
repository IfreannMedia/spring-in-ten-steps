package com.ifreann.spring.basics.springintensteps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BinarySearchImpl {

    // tell spring it's a dependency
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        var targetIndex = -1; // targetNumber not found as default

        // in tight coupling, the sort algorithm would be implemented here
        // For loose coupling and to fulfill Srp, we can use polymorphism through the SortAlgorithm interface
        // and then AutoWire this using the Spring component decorators
        System.out.println(this.sortAlgorithm);
        var sortedArray = this.sortAlgorithm.sort(numbers);
        // no binary search impl, project is for purely for spring purposes
        targetIndex = Arrays.toString(sortedArray).indexOf(numberToSearchFor);
        return targetIndex;
    }

}
