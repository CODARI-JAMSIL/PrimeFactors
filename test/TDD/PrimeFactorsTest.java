package TDD;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PrimeFactorsTest {

	@Test
	public void of_1_is_none(){
		PrimeFactors primeFactors = new PrimeFactors();
		
		assertEquals(Arrays.asList(), primeFactors.of(1));
	}
	
	@Test
	public void of_2_is_2(){
		PrimeFactors primeFactors = new PrimeFactors();
		
		assertEquals(Arrays.asList(2), primeFactors.of(2));
	}

}
