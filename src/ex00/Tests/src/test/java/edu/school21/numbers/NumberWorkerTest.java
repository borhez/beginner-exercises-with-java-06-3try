package edu.school21.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberWorkerTest {
    private NumberWorker numberWorker;

    @ParameterizedTest
    @ValueSource(ints = {643, 37, 7, 3})
    void isPrimeForPrimes(int number) {
        numberWorker = new NumberWorker();
        Assertions.assertTrue(numberWorker.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {53350, 666, 35})
    void isPrimeForNotPrimes(int number) {
        numberWorker = new NumberWorker();
        Assertions.assertFalse(numberWorker.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, -111})
    void isPrimeForIncorrectNumbers(int number) {
        numberWorker = new NumberWorker();
        Assertions.assertThrows(IllegalNumberException.class, () -> numberWorker.isPrime(number));
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"}, delimiter = ',')
    void checkDigitSum(int x, int y) {
        numberWorker = new NumberWorker();
        Assertions.assertEquals(numberWorker.digitsSum(x), y);
    }
}
