package de.mvitz.kata.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzOfOne() throws Exception {
        assertThat(FizzBuzz.of(1)).as("FizzBuzz of 1").isEqualTo("1");
    }

}
