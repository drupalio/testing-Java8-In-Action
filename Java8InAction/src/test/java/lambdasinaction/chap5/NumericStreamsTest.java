package lambdasinaction.chap5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumericStreamsTest {
	@Test
	void testIsPerfectSquare_1()
		throws Exception {
		int n = 1;

		boolean result = NumericStreams.isPerfectSquare(n);

		assertEquals(true, result);
	}

	@Test
	void testIsPerfectSquare_2()
		throws Exception {
		int n = 1;

		boolean result = NumericStreams.isPerfectSquare(n);

		assertEquals(true, result);
	}

	@Test
	void testMain_1()
		throws Exception {

		NumericStreams.main();

	}

	@Test
	void testMain_2()
		throws Exception {

		NumericStreams.main();

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