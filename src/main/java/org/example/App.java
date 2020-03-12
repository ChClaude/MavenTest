package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 */
public class App {

    public static double computeAverageGrade(double... marks) {
        return Arrays.stream(marks).sum()/marks.length;
    }

    public static void main(String[] args) {
        System.out.printf("Your Average is: %.2f", computeAverageGrade(75, 75, 56, 87,
                95, 100));
    }
}
