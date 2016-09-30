package primes;

import java.util.ArrayList;
import java.util.List;

public class GeneratePrimes {
	
	/**
	* Generates primes up to an indicated value
	* 
	* @param  max  how high to calculate primes
	* @return primes  the generated primes
	*/
	public List<Integer> sieve(int max) {
		
		// should this be here?
		// what about type check?
		if (max < 0) {
			List<Integer> primes = new ArrayList<Integer>(0);
			return primes;
		}
		
		List<Integer> primes = new ArrayList<Integer>(max);
		boolean[] isPrime = new boolean[max + 1];
		
		for (int c = 1; c < max; c++) {
			isPrime[c] = true;
		}
	
		for (int i = 2; i < max; i++) {
			if(isPrime[i-1]) {
				primes.add(i);
				// remove divisible
				for(int j = i*2; j < max; j +=i) {
					isPrime[j-1] = false;
				}
			}
		}
		return primes;
	}
}
