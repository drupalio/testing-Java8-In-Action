package lambdasinaction.dsl.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("dsl")
@Tag("model")
@RunWith(JUnitPlatform.class)
class TaxTest {
	@Test
	void testGeneral_1()
		throws Exception {
		double value = 1.0;

		double result = Tax.general(value);

		assertEquals(1.3, result, 0.1);
	}

	@Test
	void testRegional_1()
		throws Exception {
		double value = 1.0;

		double result = Tax.regional(value);

		assertEquals(1.1, result, 0.1);
	}

	@Test
	void testSurcharge_1()
		throws Exception {
		double value = 1.0;

		double result = Tax.surcharge(value);

		assertEquals(1.05, result, 0.1);
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