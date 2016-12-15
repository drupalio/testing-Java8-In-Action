package lambdasinaction.chap6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartitionPrimeNumbersTest {
	@Test
	void testIsPrime_1()
		throws Exception {
		int candidate = 1;

		boolean result = PartitionPrimeNumbers.isPrime(candidate);

		assertEquals(true, result);
	}

	@Test
	void testIsPrime_2()
		throws Exception {
		int candidate = 1;

		boolean result = PartitionPrimeNumbers.isPrime(candidate);

		assertEquals(true, result);
	}

	@Test
	void testIsPrime_3()
		throws Exception {
		List<Integer> primes = mock(List.class);
		Integer candidate = new Integer(1);
		// add mock object expectations here


		boolean result = PartitionPrimeNumbers.isPrime(primes, candidate);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap6.PartitionPrimeNumbers.takeWhile(PartitionPrimeNumbers.java:41)
		//       at lambdasinaction.chap6.PartitionPrimeNumbers.isPrime(PartitionPrimeNumbers.java:36)
		assertTrue(result);
	}

	@Test
	void testIsPrime_4()
		throws Exception {
		List<Integer> primes = mock(List.class);
		Integer candidate = new Integer(1);
		// add mock object expectations here


		boolean result = PartitionPrimeNumbers.isPrime(primes, candidate);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap6.PartitionPrimeNumbers.takeWhile(PartitionPrimeNumbers.java:41)
		//       at lambdasinaction.chap6.PartitionPrimeNumbers.isPrime(PartitionPrimeNumbers.java:36)
		assertTrue(result);
	}

	@Test
	void testMain_1()
		throws Exception {

		PartitionPrimeNumbers.main();

	}

	@Test
	void testPartitionPrimes_1()
		throws Exception {
		int n = 1;

		Map<Boolean, List<Integer>> result = PartitionPrimeNumbers.partitionPrimes(n);

		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.containsKey(Boolean.FALSE));
		assertTrue(result.containsKey(Boolean.TRUE));
	}

	@Test
	void testPartitionPrimesWithCustomCollector_1()
		throws Exception {
		int n = 1;

		Map<Boolean, List<Integer>> result = PartitionPrimeNumbers.partitionPrimesWithCustomCollector(n);

		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.containsKey(Boolean.FALSE));
		assertTrue(result.containsKey(Boolean.TRUE));
	}

	@Test
	void testPartitionPrimesWithInlineCollector_1()
		throws Exception {
		PartitionPrimeNumbers fixture = new PartitionPrimeNumbers();
		int n = 1;

		Map<Boolean, List<Integer>> result = fixture.partitionPrimesWithInlineCollector(n);

		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.containsKey(Boolean.FALSE));
		assertTrue(result.containsKey(Boolean.TRUE));
	}

	@Test
	void testTakeWhile_1()
		throws Exception {
		List<Object> list = mock(List.class);
		Predicate<Object> p = mock(Predicate.class);
		// add mock object expectations here


		List<Object> result = PartitionPrimeNumbers.takeWhile(list, p);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap6.PartitionPrimeNumbers.takeWhile(PartitionPrimeNumbers.java:41)
		assertNotNull(result);
	}

	@Test
	void testTakeWhile_2()
		throws Exception {
		List<Object> list = mock(List.class);
		Predicate<Object> p = mock(Predicate.class);
		// add mock object expectations here


		List<Object> result = PartitionPrimeNumbers.takeWhile(list, p);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap6.PartitionPrimeNumbers.takeWhile(PartitionPrimeNumbers.java:41)
		assertNotNull(result);
	}

	@Test
	void testTakeWhile_3()
		throws Exception {
		List<Object> list = mock(List.class);
		Predicate<Object> p = mock(Predicate.class);
		// add mock object expectations here


		List<Object> result = PartitionPrimeNumbers.takeWhile(list, p);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap6.PartitionPrimeNumbers.takeWhile(PartitionPrimeNumbers.java:41)
		assertNotNull(result);
	}

	@BeforeEach
	void setUp()
		throws Exception {
	}

	@AfterEach
	void tearDown()
		throws Exception {
	}


}