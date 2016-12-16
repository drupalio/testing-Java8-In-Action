package lambdasinaction.chap7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap7")
@RunWith(JUnitPlatform.class)
class ParallelStreamsTest {
	@Test
	void testIterativeSum_1()
		throws Exception {
		long n = 1L;

		long result = ParallelStreams.iterativeSum(n);

		assertEquals(1L, result);
	}

	@Test
	void testIterativeSum_2()
		throws Exception {
		long n = -1L;

		long result = ParallelStreams.iterativeSum(n);

		assertEquals(0L, result);
	}

	@Test
	void testParallelRangedSum_1()
		throws Exception {
		long n = 1L;

		long result = ParallelStreams.parallelRangedSum(n);

		assertEquals(1L, result);
	}

	@Test
	void testParallelSum_1()
		throws Exception {
		long n = 1L;

		long result = ParallelStreams.parallelSum(n);

		assertEquals(1L, result);
	}

	@Test
	void testRangedSum_1()
		throws Exception {
		long n = 1L;

		long result = ParallelStreams.rangedSum(n);

		assertEquals(1L, result);
	}

	@Test
	void testSequentialSum_1()
		throws Exception {
		long n = 1L;

		long result = ParallelStreams.sequentialSum(n);

		assertEquals(1L, result);
	}

	@Test
	void testSideEffectParallelSum_1()
		throws Exception {
		long n = 1L;

		long result = ParallelStreams.sideEffectParallelSum(n);

		assertEquals(1L, result);
	}

	@Test
	void testSideEffectSum_1()
		throws Exception {
		long n = 1L;

		long result = ParallelStreams.sideEffectSum(n);

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