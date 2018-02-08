package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Svetlana Ragulina (alistern22@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class FactorialTest {

    @Test
    public void whenFiveThanFactorialOneHundredTwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenThreeThanFactorialSix() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(3);
        assertThat(result, is(6));
    }

    @Test
    public void whenZeroThanFactorialOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result, is(1));
    }
}
