package lambdasinaction.chap2;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MeaningOfThisTest {
	@Test
	void testMeaningOfThis_1()
		throws Exception {
		MeaningOfThis result = new MeaningOfThis();
		assertNotNull(result);
	}

	@Test
	void testDoIt_1()
		throws Exception {
		MeaningOfThis fixture = new MeaningOfThis();

		fixture.doIt();

	}

	@Test
	void testMain_1()
		throws Exception {

		MeaningOfThis.main();

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