package lambdasinaction.chap8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap8")
@RunWith(JUnitPlatform.class)
class ObserverMainTest {
	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		ObserverMain.main(args);

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