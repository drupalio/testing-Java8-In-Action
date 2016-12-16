package lambdasinaction.chap7;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap7")
@RunWith(JUnitPlatform.class)
class ForkJoinSumCalculatorTest {
	@Test
	void testForkJoinSumCalculator_1()
		throws Exception {
		long[] numbers = new long[] {};

		ForkJoinSumCalculator result = new ForkJoinSumCalculator(numbers);

		assertAll("calcs", () -> {
			assertNotNull(result);
			assertEquals(null, result.getRawResult());
			assertEquals(new Long(0L), result.invoke());
			assertEquals(new Long(0L), result.get());
			assertEquals(new Long(0L), result.join());
			assertEquals(null, result.getException());
			assertEquals(false, result.isCancelled());
			assertEquals(true, result.isDone());
			assertEquals((short) 0, result.getForkJoinTaskTag());
			assertEquals(new Long(0L), result.getRawResult());
			assertEquals(false, result.isCompletedAbnormally());
			assertEquals(true, result.isCompletedNormally());
			assertEquals(false, result.tryUnfork());
		});
	}

	@Test
	void testCompute_1()
		throws Exception {
		ForkJoinSumCalculator fixture = new ForkJoinSumCalculator(new long[] {});

		Long result = fixture.compute();

		assertAll("calcs", () -> {
			assertNotNull(result);
			assertEquals("0", result.toString());
			assertEquals((byte) 0, result.byteValue());
			assertEquals((short) 0, result.shortValue());
			assertEquals(0, result.intValue());
			assertEquals(0L, result.longValue());
			assertEquals(0.0f, result.floatValue(), 1.0f);
			assertEquals(0.0, result.doubleValue(), 1.0);
		});
	}

	@Test
	void testCompute_2()
		throws Exception {
		ForkJoinSumCalculator fixture = new ForkJoinSumCalculator(new long[] {});

		Long result = fixture.compute();

		assertAll("calcs", () -> {
			assertNotNull(result);
			assertEquals("0", result.toString());
			assertEquals((byte) 0, result.byteValue());
			assertEquals((short) 0, result.shortValue());
			assertEquals(0, result.intValue());
			assertEquals(0L, result.longValue());
			assertEquals(0.0f, result.floatValue(), 1.0f);
			assertEquals(0.0, result.doubleValue(), 1.0);
		});
	}

	@Test
	void testForkJoinSum_1()
		throws Exception {
		long n = 1L;

		long result = ForkJoinSumCalculator.forkJoinSum(n);

		assertEquals(1L, result);
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