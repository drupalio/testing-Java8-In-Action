package lambdasinaction.chap5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap5")
@RunWith(JUnitPlatform.class)
class PuttingIntoPracticeTest {
	@Test
	void testMain_1()
		throws Exception {

		PuttingIntoPractice.main();

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