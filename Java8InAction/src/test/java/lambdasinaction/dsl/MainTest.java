package lambdasinaction.dsl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("dsl")
@RunWith(JUnitPlatform.class)
class MainTest {
	@Test
	void testLambda_1()
		throws Exception {
		Main fixture = new Main();

		fixture.lambda();

	}
	@Test
	void testMethodChaining_1()
		throws Exception {
		Main fixture = new Main();

		fixture.methodChaining();

	}

	@Test
	void testNestedFunction_1()
		throws Exception {
		Main fixture = new Main();

		fixture.nestedFunction();

	}

	@Test
	void testPlain_1()
		throws Exception {
		Main fixture = new Main();

		fixture.plain();

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