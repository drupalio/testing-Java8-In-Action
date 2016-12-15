package lambdasinaction.chap13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecursionTest {
	@Test
	void testFactorialHelper_1()
		throws Exception {
		long acc = 1L;
		long n = 2L;

		long result = Recursion.factorialHelper(acc, n);

		assertEquals(2L, result);
	}

	@Test
	void testFactorialHelper_2()
		throws Exception {
		long acc = 1L;
		long n = 1;

		long result = Recursion.factorialHelper(acc, n);

		assertEquals(1L, result);
	}

	@Test
	void testFactorialIterative_1()
		throws Exception {
		int n = 1;

		int result = Recursion.factorialIterative(n);

		assertEquals(1, result);
	}

	@Test
	void testFactorialIterative_2()
		throws Exception {
		int n = 0;

		int result = Recursion.factorialIterative(n);

		assertEquals(1, result);
	}

	@Test
	void testFactorialRecursive_1()
		throws Exception {
		long n = 2L;

		long result = Recursion.factorialRecursive(n);

		assertEquals(2L, result);
	}

	@Test
	void testFactorialRecursive_2()
		throws Exception {
		long n = 1;

		long result = Recursion.factorialRecursive(n);

		assertEquals(1L, result);
	}

	@Test
	void testFactorialStreams_1()
		throws Exception {
		long n = 1L;

		long result = Recursion.factorialStreams(n);

		assertEquals(1L, result);
	}

	@Test
	void testFactorialTailRecursive_1()
		throws Exception {
		long n = 1L;

		long result = Recursion.factorialTailRecursive(n);

		assertEquals(1L, result);
	}

	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		Recursion.main(args);

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