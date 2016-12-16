package lambdasinaction.chap5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import lambdasinaction.chap5.Finding;

@Tag("chap5")
@RunWith(JUnitPlatform.class)
class FindingTest {
	@Test
	void testMain_1()
		throws Exception {

		Finding.main();

	}

	@Test
	void testMain_2()
		throws Exception {

		Finding.main();

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