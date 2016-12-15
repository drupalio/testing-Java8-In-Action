package lambdasinaction.chap14;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.function.Function;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CombinatorsTest {
	@Test
	void testCompose_1()
		throws Exception {
		Function<Object, Object> g = mock(Function.class);
		Function<Object, Object> f = mock(Function.class);
		// add mock object expectations here


		Function<Object, Object> result = Combinators.compose(g, f);

		assertNotNull(result);
	}

	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		Combinators.main(args);

	}

	@Test
	void testRepeat_1()
		throws Exception {
		int n = 1;
		Function<Object, Object> f = mock(Function.class);
		// add mock object expectations here


		Function<Object, Object> result = Combinators.repeat(n, f);

		assertNotNull(result);
	}

	@Test
	void testRepeat_2()
		throws Exception {
		int n = 0;
		Function<Object, Object> f = mock(Function.class);
		// add mock object expectations here


		Function<Object, Object> result = Combinators.repeat(n, f);

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