package com.ifreann.spring.basics.springintensteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// Spring will automatically search recursively in this package for beans and their dependencies
@SpringBootApplication
public class SpringInTenStepsApplication {

    public static void main(String[] args) {
        final ApplicationContext appContext = SpringApplication.run(SpringInTenStepsApplication.class, args);
        final BinarySearchImpl binSearch = appContext.getBean(BinarySearchImpl.class);
        int result = binSearch.binarySearch(new int[]{1, 43, 606, 12}, 3);
        System.out.println("got result: " + result);
    }

}
