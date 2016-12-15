package lambdasinaction.chap14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PatternMatchingTest {
	@Test
	void testMyIf_1()
		throws Exception {
		boolean b = false;
		Supplier<Object> truecase = mock(Supplier.class);
		Supplier<Object> falsecase = mock(Supplier.class);
		// add mock object expectations here


		Object result = PatternMatching.MyIf(b, truecase, falsecase);

		assertEquals(null, result);
	}

	@Test
	void testMyIf_2()
		throws Exception {
		boolean b = true;
		Supplier<Object> truecase = mock(Supplier.class);
		Supplier<Object> falsecase = mock(Supplier.class);
		// add mock object expectations here


		Object result = PatternMatching.MyIf(b, truecase, falsecase);

		assertEquals(null, result);
	}

	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		PatternMatching.main(args);

	}

	@Test
	void testPatternMatchExpr_1()
		throws Exception {
		PatternMatching.Expr e = new PatternMatching.BinOp("", new PatternMatching.Expr(), new PatternMatching.Expr());
		PatternMatching.TriFunction<String, PatternMatching.Expr, PatternMatching.Expr, Object> binopcase = mock(PatternMatching.TriFunction.class);
		Function<Integer, Object> numcase = mock(Function.class);
		Supplier<Object> defaultcase = mock(Supplier.class);
		// add mock object expectations here

		Object result = PatternMatching.patternMatchExpr(e, binopcase, numcase, defaultcase);

		assertEquals(null, result);
	}

	@Test
	void testPatternMatchExpr_2()
		throws Exception {
		PatternMatching.Expr e = new PatternMatching.Number(1);
		PatternMatching.TriFunction<String, PatternMatching.Expr, PatternMatching.Expr, Object> binopcase = mock(PatternMatching.TriFunction.class);
		Function<Integer, Object> numcase = mock(Function.class);
		Supplier<Object> defaultcase = mock(Supplier.class);
		// add mock object expectations here


		Object result = PatternMatching.patternMatchExpr(e, binopcase, numcase, defaultcase);

		assertEquals(null, result);
	}

	@Test
	void testPatternMatchExpr_3()
		throws Exception {
		PatternMatching.Expr e = new PatternMatching.Expr();
		PatternMatching.TriFunction<String, PatternMatching.Expr, PatternMatching.Expr, Object> binopcase = mock(PatternMatching.TriFunction.class);
		Function<Integer, Object> numcase = mock(Function.class);
		Supplier<Object> defaultcase = mock(Supplier.class);
		// add mock object expectations here


		Object result = PatternMatching.patternMatchExpr(e, binopcase, numcase, defaultcase);

		assertEquals(null, result);
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