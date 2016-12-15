package lambdasinaction.chap6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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