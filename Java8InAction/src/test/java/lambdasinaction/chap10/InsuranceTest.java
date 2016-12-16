package lambdasinaction.chap10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("chap10")
@RunWith(JUnitPlatform.class)
class InsuranceTest {
	@Test
	void testGetName_1()
		throws Exception {
		Insurance fixture = new Insurance();

		String result = fixture.getName();

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