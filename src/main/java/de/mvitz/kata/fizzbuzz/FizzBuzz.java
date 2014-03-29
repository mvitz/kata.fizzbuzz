package de.mvitz.kata.fizzbuzz;

import java.util.stream.IntStream;

public enum FizzBuzz {
    ;

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).mapToObj(FizzBuzz::of).forEach(System.out::println);
    }

    public static String of(int number) {
        if (number == 3) {
            return "Fizz";
        }
        return String.valueOf(number);
    }

}
