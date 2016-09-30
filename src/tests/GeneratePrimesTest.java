package tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import primes.GeneratePrimes;

import org.junit.Before;
import org.junit.Test;

public class GeneratePrimesTest {
	
	private static GeneratePrimes generator;
	
	@Before
	public void setup() {
		generator = new GeneratePrimes();
	}
	
	@Test
	public void shouldGenerateCorrectPrimes() {
		List<Integer> actualPrimes = Arrays.asList(2,3,5,7,11,13,17,19,23);
		List<Integer> generatedPrimes = generator.sieve(25);
		assertEquals("generated primes should all be actual primes",
				      generatedPrimes, actualPrimes);
	}
	
	@Test
	public void generatedPrimesShouldHaveCorrectSize() {
		List<Integer> generatedPrimes = generator.sieve(25);
		assertEquals("the primes array should size should have the correct amount of primes",
					 9, generatedPrimes.size());
	}
	
	@Test
	public void negativeInputShouldReturnEmptyArray() {
		List<Integer> generatedPrimes = generator.sieve(-5);
		assertEquals("primes array should be of length 0", 0, generatedPrimes.size());
	}

}
