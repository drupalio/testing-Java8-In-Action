package lambdasinaction.chap6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap6")
@RunWith(JUnitPlatform.class)
class CollectorHarnessTest {
	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		CollectorHarness.main(args);

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