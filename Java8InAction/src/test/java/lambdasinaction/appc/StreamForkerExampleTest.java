package lambdasinaction.appc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("appc")
@RunWith(JUnitPlatform.class)
 class StreamForkerExampleTest {
	@Test
	void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		StreamForkerExample.main(args);

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