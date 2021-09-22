package com.epam.rd.autotasks;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 04_Java_Fundamentals - Vladimir Vasyukov
 * Application's entry point, use it to demonstrate code execution
 */
public class QuadraticEquation {

    public static void main(String[] args) {
        final byte TWO = 2;
        final byte FOUR = 4;
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a != 0) {
            double d = b * b - FOUR * a * c;
            if (d > 0) {
                double sqrtOfDiscriminant = Math.sqrt(d);
                double x1 = (-b - sqrtOfDiscriminant) / (TWO * a);
                double x2 = (-b + sqrtOfDiscriminant) / (TWO * a);
                System.out.printf("%s %s", x1, x2);
            } else if (d == 0) {
                double x1 = -b / (TWO * a);
                System.out.println(x1);
            } else {
                System.out.print("no roots");
            }
        }
    }
}
