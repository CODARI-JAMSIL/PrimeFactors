package TDD;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class PrimeFactorsTest {

	private PrimeFactors primeFactors;
	
	@Before
	public void setUp(){
		
	}

	@Test
	public void of_1_is_none(){
		primeFactors = new PrimeFactors();
		
		assertEquals(Arrays.asList(), primeFactors.of(1));
	}
	
	@Test
	public void of_2_is_2(){
		PrimeFactors primeFactors = new PrimeFactors();
		
		assertEquals(Arrays.asList(2), primeFactors.of(2));
	}
	
	@Test
	public void of_3_is_3(){
		PrimeFactors primeFactors = new PrimeFactors();
		
		assertEquals(Arrays.asList(3), primeFactors.of(3));
	}
	
	@Test
	public void of_4_is_2_2(){
		PrimeFactors primeFactors = new PrimeFactors();
		
		assertEquals(Arrays.asList(2,2), primeFactors.of(4));
	}

}
