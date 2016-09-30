package primes;

import java.util.List;

public class TestPrimes {
	
	/**
	 * This will generate primes up to a certain value
	 * and output them if desired.
	 *
	 * @param  max  how high to calculate primes
	 * @param  logging  whether to log the primes
	 */
	public static void main(String[] args) {
		
		int max = Integer.parseInt(args[0]);
		boolean logging = false;
		
		if(args.length == 2) {
			logging = Boolean.parseBoolean(args[1]);
		}
		
		// we are timing the generation of primes
		Long start = System.currentTimeMillis();
		
		List<Integer> primes = new GeneratePrimes().sieve(max);
		
		if (logging ) {
			for (int i = 0; i < primes.size(); i++) {
				System.out.println(primes.get(i));
			}
		}

		Long finish = System.currentTimeMillis();
		System.out.printf("Primes calculation took: %d ms", (finish - start));
		
	}

}






