package de.mvitz.kata.fizzbuzz;

import java.util.stream.IntStream;

public enum FizzBuzz {
    ;

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).mapToObj(FizzBuzz::of).forEach(System.out::println);
    }

    public static String of(int number) {
        if (isFizzBuzzNumber(number)) {
            return "FizzBuzz";
        } else if (isFizzNumber(number)) {
            return "Fizz";
        } else if (isBuzzNumber(number)) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    private static boolean isFizzBuzzNumber(int number) {
        return isFizzNumber(number) && isBuzzNumber(number);
    }

    private static boolean isFizzNumber(int number) {
        return number % 3 == 0;
    }

    private static boolean isBuzzNumber(int number) {
        return number % 5 == 0;
    }

}
