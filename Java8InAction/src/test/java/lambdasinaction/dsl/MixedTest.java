package lambdasinaction.dsl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("dsl")
@RunWith(JUnitPlatform.class)
class MixedTest {
	@Test
	void testMixed_1()
		throws Exception {
		Mixed fixture = new Mixed();

		fixture.mixed();

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