package lambdasinaction.chap11;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap11")
@RunWith(JUnitPlatform.class)
class UtilTest {
	@Test
	void testUtil_1()
		throws Exception {
		Util result = new Util();
		assertNotNull(result);
	}

	@Test
	void testDelay_1()
		throws Exception {

		Util.delay();

	}

	@Test
	void testDelay_2()
		throws Exception {

		Util.delay();

	}

	@Test
	void testFormat_1()
		throws Exception {
		double number = 1.0;

		double result = Util.format(number);

		assertEquals(1.0, result, 0.1);
	}

	@Test
	void testFormat_2()
		throws Exception {
		double number = 1.0;

		double result = Util.format(number);

		assertEquals(1.0, result, 0.1);
	}

	@Test
	void testSequence_1()
		throws Exception {
		List<CompletableFuture<Object>> futures = mock(List.class);
		// add mock object expectations here


		CompletableFuture<List<Object>> result = Util.sequence(futures);

		assertAll("completions", () -> {
			assertNotNull(result);
			assertEquals(false, result.isCancelled());
//			assertEquals(true, result.isDone());
			assertEquals(0, result.getNumberOfDependents());
//			assertEquals(true, result.isCompletedExceptionally());
		});
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