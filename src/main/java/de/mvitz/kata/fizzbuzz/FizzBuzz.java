package de.mvitz.kata.fizzbuzz;

import java.util.stream.IntStream;

public enum FizzBuzz {
    ;

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).mapToObj(FizzBuzz::of).forEach(System.out::println);
    }

    public static String of(int number) {
        if (isFizzNumber(number)) {
            return "Fizz";
        } else if (isBuzzNumber(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private static boolean isFizzNumber(int number) {
        return number == 3;
    }

    private static boolean isBuzzNumber(int number) {
        return number == 5;
    }

}
