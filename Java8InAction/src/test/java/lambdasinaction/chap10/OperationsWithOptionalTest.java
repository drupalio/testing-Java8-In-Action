package lambdasinaction.chap10;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsWithOptionalTest {
	@Test
	void testMain_1()
		throws Exception {

		OperationsWithOptional.main();

	}

	@Test
	void testMax_1()
		throws Exception {
		Optional<Integer> i = Optional.empty();
		Optional<Integer> j = Optional.empty();

		Optional<Integer> result = OperationsWithOptional.max(i, j);

		assertAll("exists", () -> {
			assertNotNull(result);
			assertEquals("Optional.empty", result.toString());
			assertEquals(false, result.isPresent());
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