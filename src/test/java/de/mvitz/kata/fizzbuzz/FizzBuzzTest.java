package de.mvitz.kata.fizzbuzz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzTest {

    @Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[] { 1, "1" },
                new Object[] { 3, "Fizz" },
                new Object[] { 5, "Buzz" }
        );
    }

    private final int number;
    private final String expected;

    public FizzBuzzTest(int number, String expected) {
        this.number = number;
        this.expected = expected;
    }

    @Test
    public void testFizzBuzzOf() throws Exception {
        assertThat(FizzBuzz.of(number)).as("FizzBuzz of %s", number).isEqualTo(expected);
    }

}
